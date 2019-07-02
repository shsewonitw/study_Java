package chatting;

import java.net.*;
import java.io.*;

// ������ ���ӵ� Ŭ���̾�Ʈ�� 
// Socket ������ �����ϴ� Ŭ����
public class ClientData {	
	private Socket socket;
	private String host;
	private PrintWriter out;
	private BufferedReader in;
	private ObjectOutputStream obj_out;
	private ObjectInputStream obj_in;
	private ClientMessageReceiver receiver;
	
	public ClientData(Socket socket) {
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
			this.obj_out = new ObjectOutputStream(this.socket.getOutputStream());
			this.obj_in = new ObjectInputStream(this.socket.getInputStream());
		} catch (IOException e) {
			System.out.printf("%s Ŭ���̾�Ʈ�� ��Ʈ�� ���� ����\n", this.host);
		}
	}
	
	public void activate() {
		this.receiver = new ClientMessageReceiver(this, this.host, this.obj_out, this.obj_in);
		this.receiver.start();
	}
	

	public void notice(TransferData td) {
		
		try {
			obj_out.writeObject(td);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������Ʈ��Ʈ�� ��� ����");
		}
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
		if( !(obj instanceof ClientData) )
			return false;
		
		ClientData target = (ClientData)obj;
		boolean flag = this.host.equals(target.host);
		
		return flag;
	}
	
	public String getHost() {
		return this.host;
	}
}














