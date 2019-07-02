package tje.io;

import java.io.*;

public class IO_09 {

	public static void main(String[] args) throws Exception {
		// ���� ó��
		// File�� �����͸� ����ϴ� ���
		// FileOutputStream(����������), FileWriter(���ڵ�����)
		
		String dirPath = "D:\\Student\\dev\\java_se\\file_test";
		File dir = new File(dirPath);

		if(!dir.exists())
			dir.mkdirs();
		
		// ���� ��� ��Ʈ�� ��ü�� �ش� ������ �������� �ʴ� ���
		// ������ �����ϸ� ��Ʈ���� ������
		
		File file_binary = new File(dir, "binary_data.dat");
		File file_text = new File(dir, "text_data.txt");
		
		// ���Ͽ� ����� �� �ִ� ��Ʈ�� ��ü ����
		// 1. ���������͸� ����� �� �ִ� ��Ʈ�� ��ü ����
		FileOutputStream fos = new FileOutputStream(file_binary);
		// 2. ���ڵ����͸� ����� �� �ִ� ��Ʈ�� ��ü ����
		FileWriter fw = new FileWriter(file_text);
		
		// ���Ͽ� ������ ���
		// 1. ����Ʈ ��Ʈ���� ���ؼ� ���
		fos.write(11);
		fos.write(22);
		
		// 2. ���� ��Ʈ���� ���ؼ� ���
		fw.write("Hello~");
		fw.write("JAVA~");
		fw.write(48);
		
		// ��Ʈ���� ����
		fos.close();
		fw.close();
	}

}
