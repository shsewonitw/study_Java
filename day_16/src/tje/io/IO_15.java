package tje.io;

import java.io.*;
import java.util.*;
// ��ü ������� ���ؼ� ���Ǵ� 
// ObjectInputStream, ObjectOutputStream Ŭ����
// Ư�� ��ü ��ü�� �ܺη� ����ϰų� �Է¹��� �� �ִ� Ŭ����
// ObjectInputStream, ObjectOutputStream Ŭ������ ����Ͽ�
// ����µǴ� Ŭ������ �ݵ�� Serializable �������̽��� �����ؾ��մϴ�.

public class IO_15 {

	public static void main(String[] args) throws Exception, IOException {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		String dirPath = "D:\\Student\\dev\\java_se\\file_test";
		File dir = new File(dirPath);
		
		File file = new File(dir,"object_01.dat");
		
		ObjectOutputStream out = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(file)));
		
		// ��ü ��ü�� ����� �� �ִ�  writeObject �޼ҵ�
		// Object Ÿ���� �Ű������� ���޹޾�
		// �ش� ��ü�� ��Ʈ���� ���� ����ϴ� ��� 
		out.writeObject(list);
		// flush�� ȣ���Ͽ� ��ü�� ���
		out.flush();
		out.close();
		
	}

}
