package tje.io;

import java.io.*;
import java.util.*;
// ��ü ������� ���ؼ� ���Ǵ� 
// ObjectInputStream, ObjectOutputStream Ŭ����
// Ư�� ��ü ��ü�� �ܺη� ����ϰų� �Է¹��� �� �ִ� Ŭ����
// ObjectInputStream, ObjectOutputStream Ŭ������ ����Ͽ�
// ����µǴ� Ŭ������ �ݵ�� Serializable �������̽��� �����ؾ��մϴ�.

public class IO_16 {

	public static void main(String[] args) throws Exception, IOException {		
	
		String dirPath = "D:\\Student\\dev\\java_se\\file_test";
		File dir = new File(dirPath);
		
		File file = new File(dir,"object_01.dat");
		
		ObjectInputStream in = 
				new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(file)));
		
		// ��ü ��ü�� �Է¹��� �� �ִ� readobject �޼ҵ�
		// Object Ÿ���� ��ȯ�ϱ� ������
		// �ݵ�� ���� ����ȯ�� ���ؼ� ��ü�� ���Թ޾ƾ� �մϴ�.
		
		ArrayList<Integer> list = (ArrayList<Integer>)in.readObject();
		
		for(int i = 0 ; i < list.size(); i++)
			System.out.printf("list.get(%d) -> %d\n",i,list.get(i));
		System.out.println("���α׷� ����");
		in.close();
		
	}

}
