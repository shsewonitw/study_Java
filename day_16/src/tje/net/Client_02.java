package tje.net;

import java.io.*;
import java.net.*;

public class Client_02 {
	public static void main(String[] args) throws Exception {	


		String ip = "192.168.0.147";

		int port = 5050;

		Socket client = new Socket(ip, port);

		System.out.println("������ ���� �Ϸ�");		
		
		// �������� ����̽��� ����� ���� ��ü�� 
		// �����͸� ������� �� �ִ� ����Ʈ ��Ʈ���� �����մϴ�.
		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();
		
// ����Ÿ���� �����͸� ������ϱ� ���� 
		// ��Ʈ�� ��ü ����
		
		// �Է� ��Ʈ��
		BufferedReader in =
				new BufferedReader(
						new InputStreamReader(is));
		
		// ��� ��Ʈ��
		PrintWriter out = 
				new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(os)));
		
		// ���� ���� �����͸� ����
		out.println("Hello Server~!");
		// ���ۿ� �ִ� ������ �������� ����
		out.flush();
		
		// ���� ���� ������ ����
		String strAck = in.readLine();
		System.out.printf("���� : %s\n",strAck);
		
		// Socket �� ���õ� ��Ʈ���� ����
		in.close();
		out.close();
		client.close();
	}
}


















