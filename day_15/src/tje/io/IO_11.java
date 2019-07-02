package tje.io;

import java.io.*;

public class IO_11 {
	public static void main(String[] args) throws Exception {
		// ���� ó��
		// File�� �����͸� ���۸� ����ؼ� ����ϴ� ���
		// BufferedOutputStream(����������), BufferedWriter(���ڵ�����)
		
		String dirPath = "D:\\Student\\dev\\java_se\\file_test";
		File dir = new File(dirPath);
		
		if( !dir.exists() )
			dir.mkdirs();	
		
		File file_binary = new File(dir, "binary_data_using_buffer.dat");
		File file_text = new File(dir, "text_data_using_buffer.txt");
		
		// ���Ͽ� ����� �� �ִ� ��Ʈ�� ��ü ����
		// 1. ���������͸� ����� �� �ִ� ��Ʈ�� ��ü ����
		BufferedOutputStream bos = 
				new BufferedOutputStream(
						new FileOutputStream(file_binary));
				
		// 2. ���ڵ����͸� ����� �� �ִ� ��Ʈ�� ��ü ����
		BufferedWriter bw = 
				new BufferedWriter(
						new FileWriter(file_text));
		
		// ���ۿ� ������ ���
		// ���ۿ� ��µ� �����ʹ� �ش� ��Ʈ���� close �ǰų�
		// �ش� ��Ʈ�� ��ü�� ���ؼ� flush �޼ҵ尡 ȣ��Ǹ�
		// ���� ��Ʈ���� ���ؼ� ��µ˴ϴ�.
		bos.write(11);
		bos.write(22);
		
		// flush �޼ҵ�� ���ۿ� �׿��ִ� �����͸� ����ϴ� �޼ҵ�
		// (���۸� ���� ����� ����)
		bos.flush();

		bw.write("Hello~");
		bw.write("Java~");
		
		// flush �޼ҵ�� ���ۿ� �׿��ִ� �����͸� ����ϴ� �޼ҵ�
		// (���۸� ���� ����� ����)
		bw.flush();
		
		// ��Ʈ���� ����
		bw.close();
		bw.close();
	}
}












