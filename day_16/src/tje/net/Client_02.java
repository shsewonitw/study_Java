package tje.net;

import java.io.*;
import java.net.*;

public class Client_02 {
	public static void main(String[] args) throws Exception {	


		String ip = "192.168.0.147";

		int port = 5050;

		Socket client = new Socket(ip, port);

		System.out.println("서버와 연결 완료");		
		
		// 원격지의 디바이스와 연결된 소켓 객체는 
		// 데이터를 입출력할 수 있는 바이트 스트림을 제공합니다.
		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();
		
// 문자타입의 데이터를 입출력하기 위한 
		// 스트림 객체 생성
		
		// 입력 스트림
		BufferedReader in =
				new BufferedReader(
						new InputStreamReader(is));
		
		// 출력 스트림
		PrintWriter out = 
				new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(os)));
		
		// 서버 측에 데이터를 전송
		out.println("Hello Server~!");
		// 버퍼에 있는 내용을 서버측에 전달
		out.flush();
		
		// 서버 측의 응답을 수신
		String strAck = in.readLine();
		System.out.printf("서버 : %s\n",strAck);
		
		// Socket 에 관련된 스트림을 종료
		in.close();
		out.close();
		client.close();
	}
}


















