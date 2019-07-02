package tje.collection;

import java.util.ArrayList;

public class Collection_08 {

	public static void main(String[] args) {
		ArrayList<Integer> list_int = new ArrayList<>();
		list_int.add(10);	list_int.add(20);	list_int.add(30);
		
		ArrayList<String> list_str = new ArrayList<>();
		list_str.add("One");	list_str.add("Two");	list_str.add("Three");
		
		// �÷��� ���ο��� Ư�� ���� ���� ������ Ȯ���ϴ� ���
		// contains �޼ҵ� : �ݷ��� ���ο��� Ư�� ���� ����������
		// boolean Ÿ������ ��ȯ�ϴ� �޼ҵ�
		System.out.println("10 : "+list_int.contains(10));
		System.out.println("15 : "+list_int.contains(15));
		
		System.out.println("One : "+list_str.contains("One"));
		System.out.println("Five : "+list_str.contains("Five"));
		
		// ����Ʈ Ÿ���� �÷��� ��ü�� ���
		// Ư�� ���� ���� �ε����� ���� ��ȯ���� �� �ִ� indexOf �޼ҵ尡 ����
		System.out.println("10 : "+list_int.indexOf(10));
		// ���� �������� �ʴ� ���� ��� -1 ���� ��ȯ
		System.out.println("15 : "+list_int.indexOf(15));
		
	}

}
