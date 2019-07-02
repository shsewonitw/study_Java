package chatting;


import java.io.*;
import java.net.*;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;

public class Client {
	private String guestHost;
	private int guestPort;
	private String guestName;
	public NoticeThread nt;
	private Socket socket = null;

//	
//	BufferedReader socket_in = null;
//	PrintWriter socket_out = null;
	ObjectOutputStream obj_out = null;
	ObjectInputStream obj_in = null;
	
	
	public Client(String guestHost, int guestPort, String guestName) {
		this.guestHost = guestHost;
		this.guestPort = guestPort;
		this.guestName = guestName;
		nt = new NoticeThread();
	}
	
	public void guestStart() {
		// ������ ����
		
		try {
			socket = new Socket(guestHost, guestPort);
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			return;
		} catch (IOException e) {
			System.out.println("������ ���ῡ �����߽��ϴ�.");
			return;
		}
		
		// ������ ���� ���� ����
		System.out.println("������ ���� �Ǿ����ϴ�.");
		
		
		// Ű���� ��Ʈ�� ����
		
		try {
//			socket_out = new PrintWriter(
//					new BufferedWriter(
//							new OutputStreamWriter(socket.getOutputStream())),true);
//			
//			socket_in = new BufferedReader(
//							new InputStreamReader(socket.getInputStream()));
//			
			obj_out = new ObjectOutputStream(socket.getOutputStream());
			
			obj_in = new ObjectInputStream(socket.getInputStream());
			
		} catch (IOException e) {
			System.out.println("�������� ��Ʈ�� ���� ����");
			try {
				socket.close();
			} catch (IOException e1) {
				System.out.println("���� ���ῡ�� ���ܰ� �߻��Ͽ����ϴ�.");
			}
			return;
		}


		
//		new SimpleReceiverThread("����",socket_in).start();
		
	}
	
	public void guestEnd() {
		
		try {
			obj_in.close();
//			socket_in.close();
//			socket_out.close();
			obj_out.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getHost() {
		return this.guestHost;
	}
	
	class NoticeThread extends Thread {
		@Override
		public void run() {
			TransferData td;
			String msg;
			String[] guestHost;
			
			System.out.println("NoticeThread ������ ������");
			while (true) {
				try {
					td = (TransferData)obj_in.readObject();
					
					if(td.getNoticeMsg() != null) {
						msg = td.getNoticeMsg();
						ClientUI.noticeMessageOutput.setText(msg);
					}
					else if(td.getGuestHost() != null) {
						guestHost = td.getGuestHost();
//						guestHost.remove(Client.this.guestHost);
//						guestHost.add(Client.this.guestName);
//						String[] strArr = guestHost.toArray(new String[guestHost.size()]);
						ClientUI.guestList.setListData(guestHost);
					}
					else if(td.getChatList() != null) {
						String[] chatList = td.getChatList();
						ClientUI.chatListList.setListData(chatList);
					}
					
					

				} catch (IOException | ClassNotFoundException e) {
					System.out.println("NoticeThread���ܹ߻�");
					break;
				}
			}
		}
	}

}
