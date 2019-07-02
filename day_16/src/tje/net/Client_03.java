package tje.net;

import java.io.*;
import java.net.*;

public class Client_03 {
	public static void main(String[] args) throws Exception {	

		// �������� �����͸� �ְ���� �� �ִ� Ŭ���̾�Ʈ ���α׷��� �ۼ��ϼ���.
		// Ű����κ��� �Էµ� ���ڿ��� ���� ���� �����մϴ�.
		// ���� ������ �����Ͱ� bye�� ��� �Ǵ� ���������� ���޵� �����Ͱ� bye�� ���
		// ���α׷��� �����մϴ�.
		// ����¼�����
		// Ŭ���̾�Ʈ�� ���� �����͸� ������ ��, �������� �޼����� �����մϴ�.
		
		String ip = "192.168.0.147";
		int port = 5050;
		
		// �������� ����
		// Socket Ŭ������ ��ü�� �����Ͽ� ������ ������ �� ����
		Socket client = new Socket(ip, port);		

		System.out.println("������ ���� �Ϸ�");

		// Ű���� �Է� ��Ʈ��
		BufferedReader kb = 
				new BufferedReader(
						new InputStreamReader(System.in));
		// �Է� ��Ʈ��
		BufferedReader in = 
				new BufferedReader(
						new InputStreamReader(
								client.getInputStream()));		
		// ��� ��Ʈ��(auto flush �Ӽ� ����)
		PrintWriter out = 
				new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(
										client.getOutputStream())), true);
		
		String input_kb;
		String input_server;
		do {
			System.out.print("������ ������ �޽����� �Է� : ");
			input_kb = kb.readLine();
			
			// ���� ���� �����͸� ����
			out.println(input_kb);
			
			if( input_kb.equals("bye") )
				break;
			
			// ���� ���� ������ ����
			input_server = in.readLine();
			System.out.printf("���� : %s\n", input_server);
		} while( !input_server.equals("bye") );		
		
		// Ű���� ��Ʈ���� ����
		kb.close();
		
		// Socket�� ���õ� ��Ʈ���� ����
		in.close();
		out.close();
		client.close();
		
		System.out.println("Ŭ���̾�Ʈ ����");
	}
}