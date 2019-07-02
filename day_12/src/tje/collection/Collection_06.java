package tje.collection;

// HashSet Ŭ����
// �������� �ߺ��� ������� �ʰ� �����ϴ� Ŭ����
// - �˻��� ���ؼ� ���Ǵ� Ŭ����
// - �ߺ��� ���� �����ϸ鼭 �����͸� �����ϱ� ���� ���

import java.util.*;
public class Collection_06 {

	public static void main(String[] args) {
		// Vector, ArrayList, LinkedList �÷��� Ŭ��������
		// �������� �ߺ��� ����ϰ�, ���� �Է� ������ �����մϴ�.
		// �Ʒ��� �ڵ�� �ߺ��� �������� �Ź� �����Ͱ� �Էµ˴ϴ�. 
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); list.add(20); list.add(30);
		list.add(10); list.add(20); list.add(30);
		System.out.println("ArrayList ���ο� ����� ������ ����: "+list.size());
		
		// Hash Ÿ���� �÷��� Ŭ�������� �������� �ߺ��� ������� �ʽ��ϴ�.
		// �Ʒ��� �ڵ�� 6���� add�� ���� �Ǿ�����, �ߺ��� ���� ���ԵǾ����Ƿ� 
		// 3���� �����͸� �Էµ˴ϴ�.
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10); set.add(20); set.add(30);
		set.add(10); set.add(20); set.add(30);
		System.out.println("ArrayList ���ο� ����� ������ ����: "+set.size());
	}

}
