package tje.net;

import java.io.IOException;
import java.net.*;

public class Server_01 {

	public static void main(String[] args) throws Exception {
		// ServerSocket Ŭ����
		// Ŭ���̾�Ʈ�� ������ �޾Ƶ��� �� �ִ� Ŭ����
		// Ư�� port ��ȣ�� �����ϴ� ������ ��
		// accept �޼ҵ带 ����Ͽ� Ŭ���̾�Ʈ�� ������ ������ �� ������
		// ���ο� Ŭ���̾�Ʈ�� ���ӵǸ� �ش� Ŭ���̾�Ʈ�� �����͸� �ְ���� �� �ִ� 
		// Socket ��ü�� �����Ͽ� ��ȯ��
		
		int port = 5050;
		// 5050 ���� port ��ȣ�� ������ �� �ִ� ServerSocket ��ü ����
		ServerSocket ss = new ServerSocket(port);
		
		System.out.println("���� ����~!");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��� �� ~!");
		// accept �޼ҵ�� �����ڿ��� ������ port ��ȣ��
		// ���ؼ� �����ϴ� Ŭ���̾�Ʈ�� �߻��� ������
		// ����ϴ� �޼ҵ�
		// Ŭ���̾�Ʈ�� �����ϸ� �ش� Ŭ���̾�Ʈ�� �����͸� �ְ�ޱ� ����
		// Socket ��ü�� ��ȯ�մϴ�.
		Socket client = ss.accept();
		
		System.out.println("Ŭ���̾�Ʈ ����~!");
		
		client.close();
		ss.close();
	}

}
