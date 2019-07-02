package tje.net;

import java.io.*;
import java.net.*;

public class Server_02 {

	public static void main(String[] args) throws Exception {

		int port = 5050;

		ServerSocket ss = new ServerSocket(port);

		System.out.println("���� ����~!");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��� �� ~!");

		Socket client = ss.accept();
		System.out.println("Ŭ���̾�Ʈ ����~!");


		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();

		BufferedReader in = new BufferedReader(new InputStreamReader(is));

		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(os)));

		// Ŭ���̾�Ʈ�� �޼��� ����
		String msg = in.readLine();
		System.out.printf("Ŭ���̾�Ʈ : %s\n",msg);
		
		// Ŭ���̾�Ʈ���� �޼��� ����
		out.println("Hello Client~!");
		// ���ۿ� �ִ� ������ Ŭ���̾�Ʈ���� ����
		out.flush();
		
		// Ŭ���̾�Ʈ�� ���õ� ��� ��Ʈ���� ����
		in.close();
		out.close();
		client.close();
		
		// ���� ���� ����
		ss.close();
	}

}
