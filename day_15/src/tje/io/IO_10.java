package tje.io;

import java.io.*;

public class IO_10 {

	public static void main(String[] args) throws Exception {
		// ���� ó��
		// File�κ��� �����͸� �Է¹޴� ���
		// FileInputStream(����������), FileReader(���ڵ�����)
		
		String dirPath = "D:\\Student\\dev\\java_se\\file_test";
		File dir = new File(dirPath);

		if(!dir.exists())
			dir.mkdirs();
		
		File file_binary = new File(dir, "binary_data.dat");
		File file_text = new File(dir, "text_data.txt");
		
		// ���Ϸκ��� �Է� ������ �ִ� ��Ʈ�� ��ü ����
		// ���ǻ��� : ���� ��� ��Ʈ���� ��� ������ �������� ������
		//		      ������ ��, ��Ʈ���� ����
		//		      �ݸ�, �Է½�Ʈ���� ������ �������� ������ ���ܰ� �߻�
		
		// 1. ���������͸� �Է¹��� �� �ִ� ��Ʈ�� ��ü ����
		FileInputStream fis = new FileInputStream(file_binary);
		// 2. ���ڵ����͸� �Է¹��� �� �ִ� ��Ʈ�� ��ü ����
		FileReader fr = new FileReader(file_text);
		
		// ���Ϸκ��� ������ �Է¹޴� �ڵ�
		/*
		int data_binary = fis.read();
		System.out.println(data_binary);
		data_binary = fis.read();
		System.out.println(data_binary);
		// ������ ���� �����ϸ� -1 ���� ��ȯ
		data_binary = fis.read();
		System.out.println(data_binary);
		*/
		
		// ����Ʈ ��Ʈ���� ����Ͽ� ������ ������ 1byte�� �о���� �ڵ�
		int data_binary;
		while( (data_binary= fis.read()) != -1)
			System.out.println(data_binary);
		
		// ���� ��Ʈ���� ����Ͽ� ������ ������ 2byte�� �о���� �ڵ�
		// ���ǻ���
		// ���� �ؽ�Ʈ Ÿ���� ������ �� ���ھ� �о���̴� ���
		// �ݵ�� int Ÿ������ ���ڰ��� ���� �޾ƾ� �մϴ�.
		// ������ ���� �����ϸ� -1 ���� ��ȯ������
		// char�� ��ȣ�� ���� �ڷ����̹Ƿ� -���� ó���� �� ����
		// ������ ����θ� ����Ͽ� �ݺ��� �������ü� �����ϴ�.
		int data_text;
		while( (data_text= fr.read()) != -1)
			System.out.println((char)data_text);
		
		fis.close();
		fr.close();
		
		System.out.println("���α׷� ����");
	}

}
