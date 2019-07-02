package tje.collection;

// �÷��� Ŭ���� ���� ���
// ��� �÷��� Ŭ�������� �⺻������
// Object Ÿ���� ����/��ȯ�� �� �ֽ��ϴ�.

// Object Ÿ���� �Ű������� ����ϴ� ���
// �÷��� Ŭ�������� Ÿ�Կ� ������� ������ �� ����
// ������, ����� �����͸� ��ȯ�޴� ��������
// ��Ÿ�ӿ����� �߻��� �� �ֽ��ϴ�.
// Object -> �ڽ�Ŭ������Ÿ�� : ��������ȯ
import java.util.ArrayList;

public class Collection_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		// �پ��� Ÿ���� ������ �� �ִ�
		// �÷��� Ŭ������ ��ü
		list.add(10); // new Integer(10)
		list.add(107.15); // new Double(107.15)
		list.add("Hello Collections~!"); 
		
		
		int i = (Integer)list.get(0);
		
		// �÷��� ������ �����͸� �����ϴ� ��������
		// ��ġ���� �ʴ� Ÿ������ ����ȯ�� �Ͼ�� ���
		// ��Ÿ�� ������ �߻��Ǿ� ���α׷��� ���� ����
		// double d = (Double)list.get(0);
		
		double d = (Double)list.get(1);
		String s = (String)list.get(2);
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
	}
}
