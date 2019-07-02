package tje.io;

import java.io.*;

public class IO_12_EX {

	public static void main(String[] args) throws Exception {
		// tools ���丮�� ��Ŭ���� ����������
		// tools_copy ���丮�� �����ϼ���.
		
		String dirPath = "D:\\Student\\dev\\java_se";
		File dir = new File(dirPath,"tools");
		File dir_copy = new File(dirPath,"tools_copy");
		
		if( !dir_copy.exists())
			dir_copy.mkdirs();
		
		File file = new File(dir,"eclipse-java-2018-12-R-win32-x86_64.zip");
		File file_copy = new File(dir_copy,file.getName());
		
		BufferedInputStream bis =
				new BufferedInputStream(
						new FileInputStream(file));
		
		BufferedOutputStream bos = 
				new BufferedOutputStream(
						new FileOutputStream(file_copy));
		
		/*	 1����Ʈ�� �о�ͼ� ���� ( ���� )
		int data;
		long startTime = System.nanoTime();
		while((data = bis.read()) != -1)
			bos.write(data);
			bos.flush();
		long endTime = System.nanoTime();
		*/
		
		/*   ����ũ�⸸ŭ�� ����Ʈ�迭�� ���� �ѹ��� ���� ( ���������� ����õ )
		int size;
		byte[] data = new byte[(int)file.length()];
		long startTime = System.nanoTime();
		bis.read(data);
		bos.write(data);
		bos.flush();
		long endTime = System.nanoTime();
		*/
		
		/*   ����Ʈ�迭�� ũ�� ũ�� ���� ( ���� ) */
		int size;
		byte[] data = new byte[2048];
		long startTime = System.nanoTime();
		while((size = bis.read(data)) != -1) {
			System.out.println(size);
			bos.write(data,0,size);
			bos.flush();
		}
		long endTime = System.nanoTime();	
		
		
		System.out.printf("���� ���� �Ϸ� - (%d ns)\n",endTime-startTime);
		System.out.printf("�������� ũ��: %d bytes\n",file.length());
		System.out.printf("�������� ũ��: %d bytes\n",file_copy.length());
		bos.close();
		bis.close();		
	}
}