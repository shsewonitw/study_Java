package tje.net.server;

import java.io.IOException;
import java.net.*;

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
			Socket socket;
			try {
				socket = this.server.accept();
				Client client = new Client(socket);
				if( !ClientSaver.checkClient(client) ) {
					ClientSaver.addClient(client);
					client.activate();
				} else {
					client.close();
				}
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}
}









