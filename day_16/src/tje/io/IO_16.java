package tje.io;

import java.io.*;
import java.util.*;
// 객체 입출력을 위해서 사용되는 
// ObjectInputStream, ObjectOutputStream 클래스
// 특정 객체 자체를 외부로 출력하거나 입력받을 수 있는 클래스
// ObjectInputStream, ObjectOutputStream 클래스를 사용하여
// 입출력되는 클래스는 반드시 Serializable 인터페이스를 구현해야합니다.

public class IO_16 {

	public static void main(String[] args) throws Exception, IOException {		
	
		String dirPath = "D:\\Student\\dev\\java_se\\file_test";
		File dir = new File(dirPath);
		
		File file = new File(dir,"object_01.dat");
		
		ObjectInputStream in = 
				new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(file)));
		
		// 객체 자체를 입력받을 수 있는 readobject 메소드
		// Object 타입을 반환하기 때문에
		// 반드시 강제 형변환을 통해서 객체를 대입받아야 합니다.
		
		ArrayList<Integer> list = (ArrayList<Integer>)in.readObject();
		
		for(int i = 0 ; i < list.size(); i++)
			System.out.printf("list.get(%d) -> %d\n",i,list.get(i));
		System.out.println("프로그램 종료");
		in.close();
		
	}

}
