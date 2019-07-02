package tje.net;

import java.io.BufferedReader;
import java.io.IOException;

class SimpleReceiverThread extends Thread {
	private String title;
	private BufferedReader in;
	public SimpleReceiverThread(String title, BufferedReader in) {
		this.in = in;
		this.title = title;
	}
	public void run() {
		// ��Ʈ��ũ���� �����ϴ� �����͸� �����ϴ� ����
		String msg;
		while(true) {
			// ������ ����Ǵ� ��� ���ܰ� �߻�
			// ���� ���Ḧ ����ϴ� ����ó�� �ڵ尡 �ʿ���
			try {
				msg = in.readLine();
				System.out.printf("%s : %s\n",title,msg);
				
				if(msg.equals("bye"))
					break;
			} catch (IOException e) {
				break;
			}
		}
		
		System.out.printf("%s���� ���� ����\n",title);
		
		try {
			this.in.close();
		} catch (IOException e) {
			System.out.println("�Է� ��Ʈ�� ����������� ���ܰ� �߻��Ͽ����ϴ�.");
		}
	}
}