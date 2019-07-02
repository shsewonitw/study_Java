package tje.net;

import java.io.*;
import java.net.*;


public class Server_04 {

	public static void main(String[] args) {
		
		int port = 7070;
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			System.out.printf("�ٸ� ���μ������� ��Ʈ��ȣ(%d)�� ����ϰ� �ֽ��ϴ�.\n",port);
			return;
		}
		
		System.out.println("Ŭ���̾�Ʈ�� ������ ��� ��...");
		Socket socket = null;
		try {
			socket = server.accept();
		} catch (IOException e) {
			System.out.println("accept �޼ҵ忡�� ���ܰ� �߻�");
			try {
				server.close();
			} catch (IOException e1) {
				System.out.println("������ ���� �������� ���ܰ� �߻�");
			}
			return;
		}
		
		System.out.println("Ŭ���̾�Ʈ�� ���ӵ�");
		
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
			System.out.println("Ŭ���̾�Ʈ���� ��Ʈ�� ���� ����");
			try {
				socket.close();
			} catch (IOException e1) {
				System.out.println("���� ���ῡ�� ���ܰ� �߻��Ͽ����ϴ�.");
			}
			return;
		}

		// Ŭ���̾�Ʈ�� �����͸� �ְ�ޱ� ���� �غ� �Ϸ�

		// Ŭ���̾�Ʈ�� �����͸� �ְ�޴� ���������� ���ǻ���
		// ����½� ��ŷ ������ �߻�
		// �Ϲ������� �Է�(�������� ������ �����͸� �޴� ����)
		// ������� ó��

		new SimpleReceiverThread("Ŭ���̾�Ʈ", socket_in).start();

		String msg;
		do {
			System.out.print("Ŭ���̾�Ʈ�� ������ �޼����� �Է�: ");
			try {
				msg = kb.readLine();
			} catch (IOException e) {
				System.out.println("Ű���� �Է¿��� ���ܰ� �߻�");
				break;
			}

			socket_out.println(msg);
			// socket_out.flush(); // -> PrintWirterŬ������ ������ �ι�° ���ڷ� true �����ϸ� autoflush
		} while (!msg.equals("bye"));

		try {
			kb.close();
		} catch (IOException e1) {
			System.out.println("Ű���� ��Ʈ�� ����������� ���ܰ� �߻��Ͽ����ϴ�.");
		}
		socket_out.close();
		try {
			server.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("���� ����������� ���ܰ� �߻��Ͽ����ϴ�.");
		}
		
	}
}
