package tje.collection;

import java.util.*;

// HashMap��  Ű ������ ���Ǵ� 
// ����� ���� Ŭ���� ����
class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return String.format("name : %s, age : %d", this.name, this.age);
	}	
	
	// �ؽ� ������ �÷��� ��ü�� ����� ���� �ڷ����� ��ü��
	// �Է��Ϸ��� ��� �ߺ��� ���� ���Ÿ� ���ؼ�
	// �ݵ�� hashCode �޼ҵ带 �������̵��ؾ� �մϴ�.
	// hashCode �޼ҵ忡���� ���� Ŭ������ ��� ��ü����
	// �׷����� �� �ִ� ���� ��ȯ�ϵ��� �����մϴ�.
	public int hashCode() {
		// ���� ���̰��� ������ ��ü�鸸 ���� �� �ֵ���
		// age �ʵ��� ���� ��ȯ
		return this.age;	
	}
	
	public boolean equals(Object obj) {		
		System.out.printf("%s �� equals �޼ҵ� ����\n", this.name);
		
		if( !(obj instanceof Person) )
			return false;
		Person target = (Person)obj;
		boolean flag_name = this.name.equals(target.name);
		boolean flag_age = this.age == target.age;
		return flag_name && flag_age;
	}
}

public class Collection_12 {
	public static void main(String[] args) {
		// Hash �˰����� ������� ������ Ŭ����������
		// equals �޼ҵ尡 ȣ����� �ʴ� ������
		// Hash ����� Ŭ�������� Ű ���� �ߺ��� 
		// �����ϱ� ���ؼ� ����Ǵ� ����
		// 1. �Էµ�(�˻���) ��ü�� hashCode �޼ҵ� ����
		// 2. ��ȯ���� hashCode �޼ҵ��� �����
		//    ���� ����Ǿ� �ִ� ��� ��ü���� 
		//    hashCode �޼ҵ��� ��ȯ���� ��
		// 3. ���� ������ hashCode �޼ҵ��� ����� �����Ѵٸ�
		//    equals �޼ҵ带 �����Ͽ� �� ��ü�� �������� ��
		HashMap<Person, Integer> map = new HashMap<>();
		
		Person p1 = new Person("A", 1);
		Person p2 = new Person("B", 2);
		Person p3 = new Person("C", 3);
		
		map.put(p1, 101);
		map.put(p2, 202);
		map.put(p3, 303);
		
		System.out.println("map.size -> " + map.size());
		
		Person p4 = new Person("C", 3);
		map.put(p4, 404);
		
		System.out.println("map.size -> " + map.size());
	}
}
