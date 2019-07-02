package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.ArrayList;

// ServerSocket을 생성한 후 
// 클라이언트의 접속을 감지하는 쓰레드 클래스
public class ClientCollector extends Thread {
	private ServerSocket server;
	

	
	public ClientCollector(int port) {
		try {
			this.server = new ServerSocket(port);
			
		} catch (IOException e) {			
			System.out.println("다른 프로세스에서 동일한 PORT 번호를 사용 중 입니다.");
		}
		
	}

	public void run() {
		
		while(true) {

			System.out.println("run 실행중");
			Socket socket;
			try {
				socket = this.server.accept();
				
			
				ClientData client = new ClientData(socket);
				if( !ClientSaver.checkClient(client) ) {
					System.out.println("addClient !!");
					ClientSaver.addClient(client);
					client.activate();
					
					ClientSaver cs = new ClientSaver();
					Integer temp = cs.getClientSize();
					String guestNum = temp.toString();
					ArrayList<String> ar = new ArrayList<>();
					for(int i = 0 ; i < temp; i++) {
						ar.add(cs.getClient(i).getHost());
					}
					String[] guestHost = ar.toArray(new String[ar.size()]); 
					
					TransferData td = new TransferData();
					td.setGuestNum(guestNum);
					td.setGuestHost(guestHost);
					BroadCaster.broadCast(td);
				
					//// 공지메세지 한번 출력 ////
					String msg;
					NoticeLog log = new NoticeLog("Notice.txt");
					msg = log.getLog();
					TransferData tem = new TransferData();
					tem.setNoticeMsg(msg);
					BroadCaster.broadCast(tem);
					////////////////////////
					
				} else {
					client.close();
				}
			} catch (IOException e) {				
				break;
			} 
			
		}
	}
	
	public void closeServer() {
		System.out.println("서버종료");
		try {
			this.server.close();	
		} catch (IOException e) {
			System.out.println("예외발생");
		}
		
	}
}









