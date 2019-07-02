package tje.chat.server.net;

import java.io.IOException;
import java.net.*;
import javax.swing.*;

import tje.chat.server.ServerFrame;

public class ClientCollector extends Thread {
	// ���� �������� ��������
	private ServerFrame frame;
	// ���� ���� ����
	private ServerSocket server;
	
	public ClientCollector(ServerFrame frame, int port) {
		this.frame = frame;
		
		try {
			this.server = new ServerSocket(port);
		} catch (IOException e) {	
			this.server = null;
			this.frame.noticeServerError();
			return;
		}
		
		this.frame.writeLog("���� ������ �Ϸ�Ǿ����ϴ�.");
	}
	
	public void run() {
		if( this.server == null ) {
			this.frame.writeLog("���� ���� - run ���� �κ�");
		}
		
		while( true ) {
			Socket client = null;
			try {
				client = this.server.accept();
				ClientSocket cs = new ClientSocket(this.frame, client);
				
				if( ClientSaver.exits(cs) )
					cs.close();
				else {
					cs.initStream();
					ClientSaver.insert(cs);			
					cs.start();
				}
			} catch (IOException e) {
				break;
			}
		}
		
		
		this.frame.writeLog("���� ���� - run ���� �κ�");
	}
	
	public void close() {
		try {
			this.server.close();
			this.frame.writeLog("���� ���ᰡ �Ϸ�Ǿ����ϴ�.");
		} catch (IOException e) {
			this.frame.writeLog("���� ���ῡ�� ������ �߻��Ͽ����ϴ�.");
		}
	}
}










