package tje.io;

import java.io.*;
import java.util.*;
// ��ü ������� ���ؼ� ���Ǵ� 
// ObjectInputStream, ObjectOutputStream Ŭ����
// Ư�� ��ü ��ü�� �ܺη� ����ϰų� �Է¹��� �� �ִ� Ŭ����
// ObjectInputStream, ObjectOutputStream Ŭ������ ����Ͽ�
// ����µǴ� Ŭ������ �ݵ�� Serializable �������̽��� �����ؾ��մϴ�.
// Serializable �������̽��� ��� �߻� �޼ҵ嵵 �������� �ʽ��ϴ�.
// (���� �ʿ�)
public class IO_18 {

	public static void main(String[] args) throws Exception, IOException {		
	
		String dirPath = "D:\\Student\\dev\\java_se\\file_test";
		File dir = new File(dirPath);

		File file = new File(dir, "object_02.dat");
		
		ObjectInputStream in = 
				new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(file)));
		
		// ��ü ��ü�� �Է¹��� �� �ִ� readobject �޼ҵ�
		// Object Ÿ���� ��ȯ�ϱ� ������
		// �ݵ�� ���� ����ȯ�� ���ؼ� ��ü�� ���Թ޾ƾ� �մϴ�.
		
		MyClass obj = (MyClass) in.readObject();
		System.out.printf("MyClass.name: %s\n", obj.name);
		System.out.println("���α׷� ����");
		in.close();
	
	}

}
