package tje.net;

import java.io.*;
import java.net.*;

public class Client_05 {
	public static void main(String[] args) {
		String host = "localhost";
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
		System.out.println("������ ����Ǿ����ϴ�.");
		
		// ������ �ۼ����� ���� ��Ʈ�� ����
		// ���ǻ���
		// �ݵ�� ����� ��Ʈ���� ���� ������
		// ������ �ݴ�� �ؾ��մϴ�.
		// ������� �������� �Է½�Ʈ���� ���� �����ϴ� ��� 
		// Ŭ���̾�Ʈ������ ��� ��Ʈ���� ���� �����մϴ�.
		// ������ Ŭ���̾�Ʈ ��� �Է½�Ʈ���� ���� �����ϴ� ���
		// ���� ��ŷ ���� �����ϴ�.(��ü ������� ��� �߻�)
		BufferedReader socket_in = null;		
		BufferedInputStream socket_byte_in = null;
		try {			
			socket_in = new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));	
			socket_byte_in = new BufferedInputStream(socket.getInputStream());
		} catch (IOException e) {
			System.out.println("�������� ��Ʈ�� ���� ����");
			try {
				socket.close();
			} catch (IOException e1) {
				System.out.println("���� ����������� ���ܰ� �߻��Ͽ����ϴ�.");
			}
			return;
		}		
		
		// ������ �����͸� �ְ�ޱ� ���� �غ� �Ϸ�
		
		String dirPath = "D:\\Student\\dev\\java_se\\tools_net_copy";
		File dir = new File(dirPath);
		
		if( !dir.exists() )
			dir.mkdirs();
		
		String fileName = null;
		try {
			fileName = socket_in.readLine();
		} catch (IOException e1) {
			System.out.println("���ϸ��� �����ϴ°������� ������ �߻�");
		}
		
		File file = new File(dir, fileName);	
		
		BufferedOutputStream out_file = null;		
		try {
			out_file = new BufferedOutputStream(new FileOutputStream(file));
		} catch (FileNotFoundException e2) {
			System.out.println("������ ã�� �� �����ϴ�.");
			return;
		}		
		
		byte [] data = new byte[1024];
		int size;
		try {
			while( (size = socket_byte_in.read(data)) != -1 ) {
				out_file.write(data, 0, size);
				out_file.flush();
			}
		} catch (IOException e1) {
			System.out.println("���� �����͸� ���Ź޴� ������ ���ܰ� �߻�");
		}
				
		try {		
			socket_in.close();
			out_file.close();
			socket.close();
		} catch (IOException e) {
			System.out.println("���� ����������� ���ܰ� �߻��Ͽ����ϴ�.");
		}
	}
}