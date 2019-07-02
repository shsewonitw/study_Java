package tje.net.server;

import java.net.*;
import java.io.*;

// ������ ���ӵ� Ŭ���̾�Ʈ�� 
// Socket ������ �����ϴ� Ŭ����
public class Client {	
	private Socket socket;
	private String host;
	private PrintWriter out;
	private BufferedReader in;
	private ClientMessageReceiver receiver;
	
	public Client(Socket socket) {
		this.socket = socket;
		// ������ Ŭ���̾�Ʈ�� �ּҰ��� Ȯ���� �� �ִ� �޼ҵ�
		// InetAddress Ŭ������ ��ü�� ���
		this.host = this.socket.getInetAddress().getHostAddress();
		try {
			this.out = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(
									this.socket.getOutputStream())), true);
			this.in = new BufferedReader(
					new InputStreamReader(this.socket.getInputStream()));
		} catch (IOException e) {
			System.out.printf("%s Ŭ���̾�Ʈ�� ��Ʈ�� ���� ����\n", this.host);
		}
	}
	
	public void activate() {
		this.receiver = new ClientMessageReceiver(this, this.host, this.in);
		this.receiver.start();
	}
	
	public void send(String msg) {
		this.out.println(msg);
	}
	
	public void close() {		
		try {
			this.out.close();
			this.in.close();
			this.socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}	
	
	public boolean equals(Object obj) {
		if( !(obj instanceof Client) )
			return false;
		
		Client target = (Client)obj;
		boolean flag = this.host.equals(target.host);
		
		return flag;
	}
	
	public String getHost() {
		return this.host;
	}
}














