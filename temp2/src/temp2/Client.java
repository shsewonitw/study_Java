package temp2;

import java.net.*;
import java.io.*;

public class Client {
	private Socket socket;
	private String host;
	private BufferedReader in;
	private PrintWriter out;
	
	public Client(Socket socket) {
		this.socket = socket;
		this.host = socket.getInetAddress().getHostAddress();
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void send(String msg) {
		this.out.println(msg);
	}
	
	public String getHost() {
		return this.host;
	}
	
	public void close() {
		try {
			socket.close();
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public boolean equals(Object obj) {
		if( !(obj instanceof Client) )
			return false;
		Client target = (Client)obj;
		boolean flag = this.host.equals(target.host);
		return flag;
	}
}
