package chatting;

import java.net.*;
import java.io.*;

// 서버에 접속된 클라이언트의 
// Socket 정보를 저장하는 클래스
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
		// 접속한 클라이언트의 주소값을 확인할 수 있는 메소드
		// InetAddress 클래스의 객체를 사용
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
			System.out.printf("%s 클라이언트의 스트림 생성 실패\n", this.host);
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
			System.out.println("오브젝트스트림 출력 실패");
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














