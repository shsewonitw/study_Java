package tje.io;

import java.io.*;

public class IO_12 {
	public static void main(String[] args) throws Exception {
		// ���� ó��
		// File�� �����͸� ���۸� ����ؼ� �Է¹޴� ���
		// BufferedInputStream(����������), BufferedReader(���ڵ�����)
		
		String dirPath = "D:\\Student\\dev\\java_se\\file_test";
		File dir = new File(dirPath);
		
		if( !dir.exists() )
			dir.mkdirs();	
		
		File file_binary = new File(dir, "binary_data_using_buffer.dat");
		File file_text = new File(dir, "text_data_using_buffer.txt");
		
		// ���Ͽ� ����� �� �ִ� ��Ʈ�� ��ü ����
		// 1. ���������͸� �Է¹��� �� �ִ� ��Ʈ�� ��ü ����
		BufferedInputStream bis = 
				new BufferedInputStream(
						new FileInputStream(file_binary));

		// 2. ���ڵ����͸� �Է¹��� �� �ִ� ��Ʈ�� ��ü ����
		BufferedReader br = 
				new BufferedReader(
						new FileReader(file_text));
		
		int input_binary;
		while( (input_binary = bis.read()) != -1 )
			System.out.println(input_binary);
		
		String input_text;
		while( (input_text = br.readLine()) != null )
			System.out.println(input_text);
				
		// ��Ʈ���� ����
		bis.close();
		br.close();
	}
}












