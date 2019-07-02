package tje.net.server;

import java.io.*;

// ������ Ŭ���̾�Ʈ�� �����ϴ� �޼����� 
// ������ �� �ִ� ������ Ŭ����
public class ClientMessageReceiver extends Thread {
	private Client client;
	private String host;
	private BufferedReader in;
	
	public ClientMessageReceiver(Client client, String host, BufferedReader in) {
		this.client = client;
		this.host = host;
		this.in = in;
	}
	
	public void run() {
		String msg;
		while( true ) {
			try {
				msg = in.readLine();
				
				if( msg.equals("bye") )
					break;
				
				BroadCaster.broadCast(host, msg);
				
			} catch (IOException e) {
				break;
			}
		}
		
		ClientSaver.delClient(this.client);
		System.out.printf("%s Ŭ���̾�Ʈ�� ������ �����\n", this.host);
	}
}










