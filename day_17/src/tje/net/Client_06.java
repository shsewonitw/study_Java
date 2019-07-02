package tje.net;

import java.io.*;
import java.net.*;


public class Client_06 {

	public static void main(String[] args) {
		String host = "192.168.0.70";
		int port = 7070;
		
		// ������ ����
		Socket socket = null;
		
		try {
			socket = new Socket(host, port);
		} catch (UnknownHostException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			return;
		} catch (IOException e) {
			System.out.println("������ ���ῡ �����߽��ϴ�.");
			return;
		}
		
		// ������ ���� ���� ����
		System.out.println("������ ���� �Ǿ����ϴ�.");
		
		
		// Ű���� ��Ʈ�� ����
		BufferedReader kb = 
				new BufferedReader(
						new InputStreamReader(System.in));
				
		// ������ �ۼ����� ���� ��Ʈ�� ����
		// ���ǻ��� 
		// �ݵ�� ����� ��Ʈ���� ���� ������
		// ������ �ݴ�� �ؾ��մϴ�.
		// ���� ��� �������� �Է½�Ʈ���� ���� �����ϴ� ���
		// Ŭ���̾�Ʈ������ ��� ��Ʈ���� ���� �����մϴ�. ( �Ѵ� ��½�Ʈ�� ���� ���� ���� )
		// ������ Ŭ���̾�Ʈ ��� �Է½�Ʈ���� ���� �����ϴ� ���
		// ���Ѻ�ŷ ���� �����ϴ�. (��ü ������� ��� �߻�)
		BufferedReader socket_in = null;
		PrintWriter socket_out = null;
		try {
			socket_out = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(socket.getOutputStream())),true);
			
			socket_in = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			System.out.println("�������� ��Ʈ�� ���� ����");
			try {
				socket.close();
			} catch (IOException e1) {
				System.out.println("���� ���ῡ�� ���ܰ� �߻��Ͽ����ϴ�.");
			}
			return;
		}

		// ������ �����͸� �ְ�ޱ� ���� �غ� �Ϸ�
		
		// ������ �����͸� �ְ�޴� ���������� ���ǻ���
		// ����½� ��ŷ ������ �߻�
		// �Ϲ������� �Է�(�������� ������ �����͸� �޴� ����)
		// ������� ó��
		
		new SimpleReceiverThread("����",socket_in).start();
		
		String msg;
		do {
			System.out.print("������ ������ �޼����� �Է�: ");
			try {
				msg = kb.readLine();
			} catch (IOException e) {
				System.out.println("Ű���� �Է¿��� ���ܰ� �߻�");
				break;
			}
			
			socket_out.println(msg);
			// socket_out.flush(); // -> PrintWirterŬ������ ������ �ι�° ���ڷ� true �����ϸ� autoflush
		} while(!msg.equals("bye"));

		
		try {
			kb.close();
		} catch (IOException e1) {
			System.out.println("Ű���� ��Ʈ�� ����������� ���ܰ� �߻��Ͽ����ϴ�.");
		}
		socket_out.close();
		try {
			socket.close();
		} catch (IOException e) {
			System.out.println("��� ��Ʈ�� ����������� ���ܰ� �߻��Ͽ����ϴ�.");
		}
	}
}
