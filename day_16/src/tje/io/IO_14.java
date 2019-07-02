package tje.io;


import java.io.*;

public class IO_14 {

	public static void main(String[] args) throws Exception {
		String dirPath = "D:\\Student\\dev\\java_se\\file_test";
		File dir = new File(dirPath);
		
		File file = new File(dir,"log.txt");
		
		// Ű����κ��� �Էµ� ������ log.txt ���Ͽ� ����ϼ���.
		
		// Ű���� �Է� ��Ʈ��
		BufferedReader in = 
				new BufferedReader(
						new InputStreamReader(System.in));
		
		// ���� ��� ��Ʈ��
		// ���� Ÿ���� ��¿� ���Ǵ� PrintWriter Ŭ����
		// print, println, printf �� ���� ���� Ÿ���� ����� ��
		// ������ �޼ҵ���� ����
		PrintWriter out = 
				new PrintWriter(
						new BufferedWriter(
								new FileWriter(file, true)),true);
		
		// PrintWriter Ŭ������ �����ڿ��� boolean�� ���� �����Ͽ�
		// �ڵ����� flush �޼ҵ带 ȣ���� �� �ֵ��� ������ �� �ֽ��ϴ�.
		// FileOutputStream, FileWriter Ŭ������ �����ڿ��� boolean�� ���� �����Ͽ�
		// ���Ӱ� ������ ������ �ۼ��ϰų�, ������ ���뿡�� �߰��Ͽ� ������ �ۼ��� �� �ֽ��ϴ�.
		
		// Ű����κ��� �Էµ� ���ڿ��� ������ ����
		String msg;
		// ���� ������ ���� �Է¹��� ���� 
		char isExit;
		
		do {
			System.out.print("�α� �޼��� �Է�: ");
			// Ű����κ��� ������ ���ڿ��� �Է¹���
			msg = in.readLine();
			// �Էµ� ���ڿ��� ���Ͽ� ���
			out.println(msg);
			
			// ���ۿ� ��µ� ���ڿ��� ���� ���Ϸ� ���
			// PrintWriter Ŭ������ ������ �Ű�������
			// autoflush ���� true �����ϴ� ���
			// ��� ��¸޼ҵ��� ���� �� �ڵ�����
			// flush �޼ҵ尡 ȣ���
//			out.flush();
			
			System.out.print("����? (y/n) : ");
			isExit = (char)in.read();
			
			// �Է¹��ۿ� �����ִ� ����Ű�� �� ����
			in.skip(2);
		} while(isExit != 'y' && isExit !='Y');
		
		in.close();
		out.close();
		System.out.println("���α׷� ����");
	}

}
