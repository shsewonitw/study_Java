package tje.collection;

// �÷��� Ŭ���� ���� ���
// �Ϲ������� �÷��� Ŭ������ ��ü����
// ���α׷����� ó���ϴ� �����͸� �����ϰ� �˴ϴ�.
// (���� Ÿ���� ȥ��Ǿ� ����Ǵ� ���� ���� ����)
// ������ �÷��� Ŭ������ �Է�, ��ȯ�� ���õ� ��� �޼ҵ����
// Object Ÿ���� ������� �ϱ⶧���� ��������ȯ�� �ؾ��ϴ�
// �������� �����մϴ�.(��Ÿ�ӿ����� �߻��� ���ɼ��� ����Ǿ�����)

// �̷��� �������� �ذ��ϱ� ���ؼ� JKD 1.5 ���� ���������� 
// ���׸� ������ �����մϴ�.
// ���׸� ����
// ������ �̸��� Ŭ���������� ��ü ���� �� Ÿ���� �����Ͽ� 
// ���� �ٸ� Ÿ���� �����ϴ� Ŭ������ ��ü�� ������ ��
// �ִ� ����(�޼ҵ� �����ε��� ������ ����)


// ���׸� ������ ����� ArrayList Ŭ������ ��ü ���� ����
// ArrayList<Integer> a = new ArrayList<Integer>();

// new ������ Ŭ������������ ���׸� Ÿ���� ������ �� ����
// ArrayList<Integer> a = new ArrayList<>();

import java.util.*;

public class Collection_03 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		// ���׸� Ÿ���� ������ �÷��� ��ü��
		// Object Ÿ���� �޴� �޼ҵ����
		// �ش� Ÿ���� ó���� �� �ִ�
		// �Է�/��ȯ �޼ҵ�� ����˴ϴ�.
		strList.add("One");
		strList.add("Two");
		strList.add("Three");
		
		// String Ÿ������ ���׸��Ǿ��� ������
		// �Ʒ��� ���� Ÿ���� �Էµ� �� ����
		// strList.add(0);
		// strList.add(3.14);
		
		// String Ÿ���� ��ȯ�ϴ�
		// get �޼ҵ尡 �����Ǵ� ���� Ȯ���� �� ����
		String value = strList.get(0);
		System.out.println(value);
	}

}