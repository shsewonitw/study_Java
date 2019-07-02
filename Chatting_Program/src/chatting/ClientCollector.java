package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.ArrayList;

// ServerSocket�� ������ �� 
// Ŭ���̾�Ʈ�� ������ �����ϴ� ������ Ŭ����
public class ClientCollector extends Thread {
	private ServerSocket server;
	

	
	public ClientCollector(int port) {
		try {
			this.server = new ServerSocket(port);
			
		} catch (IOException e) {			
			System.out.println("�ٸ� ���μ������� ������ PORT ��ȣ�� ��� �� �Դϴ�.");
		}
		
	}

	public void run() {
		
		while(true) {

			System.out.println("run ������");
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
				
					//// �����޼��� �ѹ� ��� ////
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
		System.out.println("��������");
		try {
			this.server.close();	
		} catch (IOException e) {
			System.out.println("���ܹ߻�");
		}
		
	}
}









