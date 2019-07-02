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
		// 서버에 연결
		
		try {
			socket = new Socket(guestHost, guestPort);
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다.");
			return;
		} catch (IOException e) {
			System.out.println("서버와 연결에 실패했습니다.");
			return;
		}
		
		// 서버와 연결 성공 지점
		System.out.println("서버와 연결 되었습니다.");
		
		
		// 키보드 스트림 생성
		
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
			System.out.println("서버와의 스트림 생성 실패");
			try {
				socket.close();
			} catch (IOException e1) {
				System.out.println("소켓 종료에서 예외가 발생하였습니다.");
			}
			return;
		}


		
//		new SimpleReceiverThread("서버",socket_in).start();
		
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
			
			System.out.println("NoticeThread 스레드 실행중");
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
					System.out.println("NoticeThread예외발생");
					break;
				}
			}
		}
	}

}
