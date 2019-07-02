package tje.collection;

import java.util.ArrayList;

// ����� ���� Ŭ������ �÷��ǿ� �����ϴ� ��� ���ǻ���
// ����� ���� Ŭ������ equals �޼ҵ尡 �������̵� ���� ���� ���
// �÷��� ���ο��� ������ ������ ��ü�� �˻�, ������ �� �����ϴ�.
class Human {
	private String name;
	private int age;
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		// String strInfo = "name: " + this.name+ ", age: " + this.age;
		String strInfo = String.format("name: %s, age : %d", this.name,this.age);
		return strInfo;
	}
	
	@Override
	public boolean equals(Object obj) {

		boolean flag_name = this.name.equals(((Human)obj).name);
		boolean flag_age = this.age == ((Human)obj).age;
		
		if(obj instanceof Human && flag_name && flag_age)
			return true;
		
		return super.equals(obj);
	}
}

public class Collection_09 {

	public static void main(String[] args) {
		// ����� ���� Ŭ���� Ÿ�Ե� ���׸��� ����� �˴ϴ�.
		ArrayList<Human> list = new ArrayList<Human>();
		
		Human h1 = new Human("ABC",11);
		Human h2 = new Human("DEF",22);
		Human h3 = new Human("GHI",33);
		
		list.add(h1);	list.add(h2);	list.add(h3);
		for( Human h : list) {
			System.out.println(h);
		}
		
		System.out.printf("%s -> %b\n",h1,list.contains(h1));
		System.out.printf("%s -> %b\n",h2,list.contains(h2));
		System.out.printf("%s -> %b\n",h3,list.contains(h3));
		
		Human h4 = new Human("ABC",11);
		System.out.printf("%s -> %b\n",h4,list.contains(h4));
	}

}
