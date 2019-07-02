package tje.object;

class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {	
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		String info = "name : " + this.name + ", age : " + this.age;
		return info;
	}
		
	// ��ü�� �񱳸� �����ϱ� ���� equals �޼ҵ�
	// �ùٸ� equals �޼ҵ��� ���ǹ��
	// 1. �Ű������� ���޵� Object Ÿ���� ������ ���ؼ�
	//    Ÿ�� äũ�� ����(���� Ŭ������ ������ Ÿ�������� ��)
	// 2. ������ Ÿ���� ���޵��� �ʾҴٸ� return false
	// 3. ���� ������ Ÿ���� ���޵Ǿ��ٸ� ���� ����ȯ�� ���ؼ� Ÿ�� ��ȯ
	// 4. Ÿ���� ��ȯ�� ���۷����� ����Ͽ� ��� �ʵ��� ���� ��
	// 5. �񱳰���� ��ȯ
	public boolean equals(Object obj) {		
		// 1. Ÿ��üũ
		if( !(obj instanceof Student) )
			// 2. ������ Ÿ���� �ƴѰ�� false�� ��ȯ
			return false;
		
		// 3. ����ȯ
		Student target = (Student)obj;
		
		// 4. Ÿ���� ��ȯ�� ���۷����� ����Ͽ� ��� �ʵ��� ���� ��
		boolean result;		
		boolean flag_name = this.name.equals(target.name);
		boolean flag_age = this.age == target.age;		
		result = flag_name && flag_age;
		
		// 5. �񱳰���� ��ȯ
		return result;
	}
}

public class Object_04 {
	public static void main(String[] args) {
		Student s1 = new Student("�л�1", 20);
		Student s2 = new Student("�л�2", 30);
		
		System.out.println("�л�1 -> " + s1);
		System.out.println("�л�2 -> " + s2);
		
		if( s1 == s2 )
			System.out.println("s1 �л��� s2 �л��� �����ϴ�.");
		else
			System.out.println("s1 �л��� s2 �л��� �ٸ��ϴ�.");
		
		if( s1.equals(s2) )
			System.out.println("s1 �л��� s2 �л��� �����ϴ�.");
		else
			System.out.println("s1 �л��� s2 �л��� �ٸ��ϴ�.");
		
		Student s3 = new Student("�л�1", 20);
		
		System.out.println("�л�1 -> " + s1);
		System.out.println("�л�3 -> " + s3);
		
		// Object Ŭ������ equals �޼ҵ�� �� ��ü�� 
		// �����Ͱ� ���������� ���õ� ������ ������ �� �ִ� ���� �����մϴ�.
		// (Object Ŭ������ equals �޼ҵ�� �⺻������ �� ��ü�� 
		// �������� ���ϴ� ���길�� ����)
		// ����� ���� Ŭ�������� ��ü�� ������ ���� �� �ִ� 
		// equalse �޼ҵ带 ����ϱ� ���ؼ��� equals �޼ҵ带
		// �������̵� �ؾ߸� �մϴ�.
		if( s1.equals(s3) )
			System.out.println("s1 �л��� s3 �л��� �����ϴ�.");
		else
			System.out.println("s1 �л��� s3 �л��� �ٸ��ϴ�.");
		
		String s4 = "�л�4";
		
		if( s1.equals(s4) )
			System.out.println("s1 �л��� s4 �л��� �����ϴ�.");
		else
			System.out.println("s1 �л��� s4 �л��� �ٸ��ϴ�.");
	}
}








