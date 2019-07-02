package tje.chat.server.net;

import java.net.*;

import javax.swing.JOptionPane;

import tje.chat.common.Packet;
import tje.chat.server.ServerFrame;

import java.io.*;

public class ClientSocket extends Thread {
	// ���� �������� ��������
	private ServerFrame frame;
	// Ŭ���̾�Ʈ ������ ��������
	private Socket socket;
	// Ŭ���̾�Ʈ ip �ּ�
	private String ip;
	// Ŭ���̾�Ʈ ��Ī
	private String nickName;
	
	private ObjectOutputStream out;
	private ObjectInputStream in;
	
	public ClientSocket(ServerFrame frame, Socket client) {
		this.frame = frame;
		this.socket = client;
		this.ip = this.socket.getInetAddress().getHostAddress();
	}
	
	public void initStream() {
		try {
			out = new ObjectOutputStream(
					new BufferedOutputStream(this.socket.getOutputStream()));
			out.flush();
			
			in = new ObjectInputStream(
					new BufferedInputStream(this.socket.getInputStream()));	
					
			// Ŭ���̾�Ʈ���� ��Ʈ���� ������ ��
			// ��Ī ���� ���޹���
			nickName = (String)in.readObject();
			// �α� ��� �ۼ�
			this.frame.writeLog(ip + " / " + nickName + " �� ����");
			// ���� ������ ��� Ŭ���̾�Ʈ�� ����� ����			
			out.writeObject(ClientSaver.getInfo_list());
			out.flush();
			
		} catch (Exception e) {
			this.socket = null;
			this.frame.writeLog(ip + " �� ���� �������� ������ �߻��Ͽ����ϴ�.");
			return;
		}
	}
	
	public String getIp() {
		return this.ip;
	}
	
	public String getNickName() {
		return this.nickName;
	}
	
	public void close() {
		try {
			this.socket.close();
			this.frame.writeLog(ip + " ���� ����");
		} catch (IOException e) {
			this.frame.writeLog(ip + " ���� ����������� ������ �߻��Ͽ����ϴ�.");
		}
	}

	public boolean equals(Object obj) {
		if( !(obj instanceof ClientSocket) )
			return false;
		
		ClientSocket target = (ClientSocket)obj;
		boolean flag = this.ip.equals(target.ip);
		
		return flag;
	}
	
	public void send(Packet packet) {
		try {
			this.out.writeObject(packet);
			this.out.flush();
		} catch (IOException e) {			
			e.printStackTrace();
		}	
	}
	
	public void run() {
		if( this.socket == null ) {
			ClientSaver.delete(this);
			return;
		}
		
		while(true) {
			
			Packet packet = null;
			
			try {
				packet = (Packet)this.in.readObject();
				
				if( packet == null )
					// Ŭ���̾�Ʈ�� ���� ����
					break;
				
				// ������ ó��
				switch( packet.getPacketType() ) {
					case Packet.TYPE_CLIENT_MSG :
						BroadCaster.broadCast(packet, packet.getTargetIp());
						break;
				}
				
			} catch (Exception e) {
				// Ŭ���̾�Ʈ�� ���� ����
				break;
			}			
		}
		
		ClientSaver.delete(this);
		this.frame.writeLog(ip + " ���� ����");
	}
}











