package tje.net;

import java.io.*;
import java.net.*;

public class Server_03 {
	public static void main(String[] args) throws Exception {
		
		// �������� �����͸� �ְ���� �� �ִ� Ŭ���̾�Ʈ ���α׷��� �ۼ��ϼ���.
		// Ű����κ��� �Էµ� ���ڿ��� ���� ���� �����մϴ�.
		// ���� ������ �����Ͱ� bye�� ��� �Ǵ� ���������� ���޵� �����Ͱ� bye�� ���
		// ���α׷��� �����մϴ�.
		// ����¼�����
		// Ŭ���̾�Ʈ�� ���� �����͸� ������ ��, �������� �޼����� �����մϴ�.
				
		int port = 5050;		
		ServerSocket ss = new ServerSocket(port);
		
		System.out.println("���� ����~!");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��� ��~!");
		
		Socket client = ss.accept();		
		System.out.println("Ŭ���̾�Ʈ ����~!");	

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
		String input_client;
		do {
			// Ŭ���̾�Ʈ ���� �޼����� ����
			input_client = in.readLine();
			System.out.printf("Ŭ���̾�Ʈ : %s\n", input_client);
			
			if( input_client.equals("bye") )
				break;
			
			System.out.print("Ŭ���̾�Ʈ�� ������ �޽����� �Է� : ");
			input_kb = kb.readLine();
			
			// ũ���̾�Ʈ ���� �����͸� ����
			out.println(input_kb);
		} while( !input_kb.equals("bye") );
		
		// Ű���� ��Ʈ���� ����
		kb.close();
		
		// Ŭ���̾�Ʈ�� ���õ� ��� ��Ʈ���� ����
		in.close();
		out.close();
		client.close();
		
		// ���� ���� ����		
		ss.close();
		System.out.println("���� ����");
	}
}












