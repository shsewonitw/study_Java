package tje.net;

import java.io.*;
import java.net.*;

public class Server_02 {

	public static void main(String[] args) throws Exception {

		int port = 5050;

		ServerSocket ss = new ServerSocket(port);

		System.out.println("서버 시작~!");
		System.out.println("클라이언트의 접속을 대기 중 ~!");

		Socket client = ss.accept();
		System.out.println("클라이언트 접속~!");


		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();

		BufferedReader in = new BufferedReader(new InputStreamReader(is));

		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(os)));

		// 클라이언트의 메세지 수신
		String msg = in.readLine();
		System.out.printf("클라이언트 : %s\n",msg);
		
		// 클라이언트에게 메세지 전송
		out.println("Hello Client~!");
		// 버퍼에 있는 내용을 클라이언트측에 전달
		out.flush();
		
		// 클라이언트와 관련된 모든 스트림을 종료
		in.close();
		out.close();
		client.close();
		
		// 서버 소켓 종료
		ss.close();
	}

}
