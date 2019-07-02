package tje.io;

import java.io.*;
import java.util.*;

// ��ü ������� ���ؼ� ���Ǵ� 
// ObjectInputStream, ObjectOutputStream Ŭ����
// Ư�� ��ü ��ü�� �ܺη� ����ϰų� �Է¹��� �� �ִ� Ŭ����
// ObjectInputStream, ObjectOutputStream Ŭ������ ����Ͽ�
// ����µǴ� Ŭ������ �ݵ�� Serializable �������̽��� �����ؾ��մϴ�.

// ����� ���� Ŭ������ �ܺη� ������ϴ� ����
// Serializable �������̽��� ��� �߻� �޼ҵ嵵 �������� �ʽ��ϴ�.
// (���� �ʿ�)
class MyClass implements Serializable{
	String name;
}

public class IO_17 {
	public static void main(String[] args) throws Exception {
		
		MyClass obj = new MyClass();
		obj.name = "ABC";
		
		String dirPath = "D:\\Student\\dev\\java_se\\file_test";
		File dir = new File(dirPath);
		
		File file = new File(dir, "object_02.dat");
		
		ObjectOutputStream out = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(file)));
		
		// ��ü ��ü�� ����� �� �ִ� writeObject �޼ҵ�
		// Object Ÿ���� �Ű������� ���޹޾�
		// �ش� ��ü�� ��Ʈ���� ���ؼ� ����ϴ� ����� ����
		out.writeObject(obj);
		// flush�� ȣ���Ͽ� ��ü�� ���
		out.flush();
		// ��Ʈ�� ����
		out.close();
		
		System.out.println("���α׷� ����");
		
	}
}









