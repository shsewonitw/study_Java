package tje.chat.server.net;

import java.net.*;
import java.sql.Connection;

import javax.swing.JOptionPane;

import tje.chat.common.Packet;
import tje.chat.server.ServerFrame;
import tje.jdbc.dao.MemberDAO;
import tje.jdbc.dao.NoticeDAO;
import tje.jdbc.model.Member;
import tje.jdbc.util.JDBCConnection;
import tje.jdbc.util.JDBCObjectManager;

import java.io.*;

public class ClientSocket extends Thread {
	// ���� �������� ��������
	private ServerFrame frame;
	// Ŭ���̾�Ʈ ������ ��������
	private Socket socket;
	// Ŭ���̾�Ʈ ip �ּ�
	private String ip;
	// Ŭ���̾�Ʈ ����
	private Member member;
	
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
			// �α��� ������ ���޹���
			member = (Member)in.readObject();
			
			if( member.getId() == null || member.getPassword() == null ) {
				this.member = null;				
				return;
			}
			
			Connection conn = JDBCConnection.getConnection();
			MemberDAO dao = MemberDAO.getInstance();
			this.member = dao.login(conn, member);
			
			
			
			if( this.member == null ) {
				return;
			}
			
			// �α� ��� �ۼ�
			this.frame.writeLog(ip + " / " + member.getNick() + " �� ����");
			// �α��ε� ������� ������ ����
			out.writeObject(this.member);
			out.flush();
			// ���� ������ ��� Ŭ���̾�Ʈ�� ����� ����			
			out.writeObject(ClientSaver.getInfo_list());
			out.flush();
			
			// �������� �޼����� �ֱ��� 10�� ����
			NoticeDAO noticeDao = NoticeDAO.getInstance();
			out.writeObject(noticeDao.select(conn));
			out.flush();
			
			JDBCObjectManager.close(conn);			
			
		} catch (Exception e) {
			this.socket = null;
			this.frame.writeLog(ip + " �� ���� �������� ������ �߻��Ͽ����ϴ�.");			
		}
	}
	
	public String getIp() {
		return this.ip;
	}
	
	public Member getMember() {
		return this.member;
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











