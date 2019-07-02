package tje.net;

import java.io.*;
import java.net.*;

public class Server_05 {
	public static void main(String[] args) {
		// 클라이언트가 접속되면 D:\dev\java_se\tools 디렉토리에 저장된
		// eclipse-java-2018-12-R-win32-x86_64.zip 파일을 클라이언트에게
		// 전송할 수 있는 서버를 작성하세요.
		// 클라이언트는 서버가 전송하는 파일의 데이터를 수신받아
		// 파일로 저장하도록 작성하세요.
		
		String dirPath = "D:\\Student\\dev\\java_se\\tools";
		File dir = new File(dirPath);
		String fileName = "eclipse-java-2018-12-R-win32-x86_64.zip";
		File file = new File(dir, fileName);
		
		BufferedInputStream in_file = null;
		
		try {
			in_file = new BufferedInputStream(new FileInputStream(file));
		} catch (FileNotFoundException e2) {
			System.out.println("파일을 찾을 수 없습니다.");
			return;
		}
		
		
		int port = 7070;
		
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {			
			System.out.printf("다른 프로세스에서 포트 번호(%d)를 사용하고 있습니다.\n", port);
			return;
		}
		
		System.out.println("클라이언트의 접속을 대기 중...");
		Socket socket = null;
		try {
			socket = server.accept();
		} catch (IOException e) {
			System.out.println("accept 메소드에서 예외가 발생");
			try {
				server.close();
			} catch (IOException e1) {
				System.out.println("서버의 종료 과정에서 예외가 발생함");
			}
			return;
		}

		System.out.println("클라이언트가 접속됨");
		
		PrintWriter socket_out = null;
		// 파일의 데이터를 출력하기 위한 바이트 스트림 생성
		BufferedOutputStream socket_byte_out = null;
		try {
			socket_out = 
					new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(
										socket.getOutputStream())), true);
			socket_byte_out = new BufferedOutputStream(socket.getOutputStream());						
		} catch (IOException e) {
			System.out.println("클라이언트와의 스트림 생성 실패");
			try {
				socket.close();
			} catch (IOException e1) {
				System.out.println("소켓 종료과정에서 예외가 발생하였습니다.");
			}
			return;
		}		
		
		// 클라이언트와 데이터를 주고받기 위한 준비가 완료
		
		// 1. 파일이름을 클라이언트에게 전달 
		socket_out.println(file.getName());
		
		// 2. 파일의 데이터를 클라이언트에게 전달
		byte [] data = new byte[1024];
		int size;
		
		try {
			while( (size = in_file.read(data)) != -1 ) {
				socket_byte_out.write(data, 0, size);
				socket_byte_out.flush();
			}
		} catch (IOException e1) {
			System.out.println("파일 전송과정에서 문제가 발생했습니다.");
		}		
		
		try {
			socket_out.close();
			socket_byte_out.close();
			server.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("소켓 종료과정에서 예외가 발생하였습니다.");
		}
	}
}















