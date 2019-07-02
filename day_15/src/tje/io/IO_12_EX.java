package tje.io;

import java.io.*;

public class IO_12_EX {

	public static void main(String[] args) throws Exception {
		// tools 디렉토리의 이클립스 압출파일을
		// tools_copy 디렉토리로 복사하세요.
		
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
		
		/*	 1바이트씩 읽어와서 복사 ( 느림 )
		int data;
		long startTime = System.nanoTime();
		while((data = bis.read()) != -1)
			bos.write(data);
			bos.flush();
		long endTime = System.nanoTime();
		*/
		
		/*   파일크기만큼의 바이트배열을 만들어서 한번에 복사 ( 개빠르지만 비추천 )
		int size;
		byte[] data = new byte[(int)file.length()];
		long startTime = System.nanoTime();
		bis.read(data);
		bos.write(data);
		bos.flush();
		long endTime = System.nanoTime();
		*/
		
		/*   바이트배열로 크게 크게 복사 ( 빠름 ) */
		int size;
		byte[] data = new byte[2048];
		long startTime = System.nanoTime();
		while((size = bis.read(data)) != -1) {
			System.out.println(size);
			bos.write(data,0,size);
			bos.flush();
		}
		long endTime = System.nanoTime();	
		
		
		System.out.printf("파일 복사 완료 - (%d ns)\n",endTime-startTime);
		System.out.printf("원본파일 크기: %d bytes\n",file.length());
		System.out.printf("복사파일 크기: %d bytes\n",file_copy.length());
		bos.close();
		bis.close();		
	}
}