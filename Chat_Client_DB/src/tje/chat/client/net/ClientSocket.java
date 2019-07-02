package tje.chat.client.net;

import java.net.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.io.*;

import tje.chat.client.ClientFrame;
import tje.chat.common.ClientInfo;
import tje.chat.common.Packet;
import tje.chat.model.*;
import tje.jdbc.model.Member;
import tje.jdbc.model.Notice;

public class ClientSocket extends Thread {
	private ClientFrame frame;
	private ServerInfo serverInfo;
	private Socket socket;
	
	private ObjectOutputStream out;
	private ObjectInputStream in;
	
	public ClientSocket(ClientFrame frame, ServerInfo serverInfo) {
		this.frame = frame;
		this.serverInfo = serverInfo;
		
		try {			
			this.socket = new Socket(serverInfo.getIp(), serverInfo.getPort());
			
			out = new ObjectOutputStream(
					new BufferedOutputStream(this.socket.getOutputStream()));
			out.flush();
			
			in = new ObjectInputStream(
					new BufferedInputStream(this.socket.getInputStream()));	
			
			out.writeObject(this.serverInfo.getMember());		
			out.flush();			
			
			// ������ ���̽��� ����� ����� ������ �����κ���
			// ���Ź޴� �ڵ�
			this.serverInfo.setMember((Member)in.readObject());
			// �α��� �� ������� ������ ����ȭ�鿡�� ������ �� �ֵ���
			// �����ϴ� �ڵ�
			this.frame.setLoginMember(this.serverInfo.getMember());
			
			JOptionPane.showMessageDialog(null, "������ ����Ǿ����ϴ�.");
			
			ArrayList<ClientInfo> connected_list = (ArrayList<ClientInfo>)in.readObject();			
			this.frame.setConnectedTable(connected_list);
			
			ArrayList<Notice> notice_list = (ArrayList<Notice>)in.readObject();
			this.frame.addNoticeMessage(notice_list);
			
		} catch (Exception e) {
			e.printStackTrace();
			this.socket = null;
			JOptionPane.showMessageDialog(null, "������ ���� �������� ������ �߻��߽��ϴ�.");
			return;
		}
	}
	
	public void send(String targetIp, Object data, String sourceIp, String sourceNickName) {
		Packet packet = new Packet(
				Packet.TYPE_CLIENT_MSG, data, targetIp, sourceIp, sourceNickName);
		
		try {
			this.out.writeObject(packet);
			this.out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		if( this.socket == null )
			return;
		
		while(true) {
			Packet packet = null;
			try {
				packet = (Packet)in.readObject();
				
				switch( packet.getPacketType() ) {
					case Packet.TYPE_NOTICE:
						this.frame.addNoticeMessage((String)packet.getPacketData());
						break;
					case Packet.TYPE_NEW_CLIENT:
						this.frame.addConnectedTable((ClientInfo)packet.getPacketData());
						break;
					case Packet.TYPE_DISCONECT_CLIENT:
						this.frame.delConnectedTable((ClientInfo)packet.getPacketData());
						break;
					case Packet.TYPE_CLIENT_MSG:
						this.frame.receiveMessage(
								packet.getSourceIp(), packet.getSourceNickName(), 
								(String)packet.getPacketData());
						break;
				}
				
			} catch ( Exception e ) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "������ ������ ������ ������ �߻��߽��ϴ�.");
				break;
			}
		}
	}
	
	public void close() {
		try {
			this.socket.close();
			JOptionPane.showMessageDialog(null, "������ ������ ���� �Ǿ����ϴ�.");
		} catch (IOException e) {			
			JOptionPane.showMessageDialog(null, "������ ���� �������� ������ �߻��߽��ϴ�.");
		}
	}
}












