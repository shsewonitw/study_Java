// Ŭ������ ���(Ȯ��) ����
// �ټ����� Ŭ�������� �ߺ��Ǵ� ����ʵ�, ����޼ҵ带 �����ϰ� �ִ� ���
// �θ�-�ڽ� ���踦 �����Ͽ� �ڵ��� �ߺ��� ������ �� �ִ� ����
// �ڵ��� ��Ȱ�� ��� ( Ŭ�������� Ȱ���� �� �ִ� ��Ȱ�� ��� )

// �ڵ��� �ߺ��� �߻��ϰ� �ִ� Ŭ����
/*
class Person_A {
	String name;
	int age;
	String address;
	String tel;
}

class Person_B {
	String name;
	int age;
	String address;
	String tel;
}
*/

// �ڵ��� �ߺ��� �߻��ϰ� �ִ� Ŭ��������
// �ߺ��Ǵ� ������� ������ Ŭ������ ������ ��,
// ���踦 ��(is a , has a)
// is a ���谡 �����ϴ� ��� ����� ����
// has a ���谡 �����ϴ� ��� ����ʵ�� ����

// �ߺ��Ǵ� �ڵ带 �����ϱ� ���� �θ�Ŭ������ ����
class Person {
	String name;
	int age;
	String address;
	String tel;
}

// ����� ������ �ڽ�Ŭ������ ����
// ����� �����ϴ� ���
// class �ڽ�Ŭ������ extends �θ�Ŭ������
class Person_A extends Person {}
class Person_B extends Person {}





public class Class_26_Extends {
	public static void main(String[] args) {
		Person_A a = new Person_A();
		Person_B b = new Person_B();
		
		// �ڽ�Ŭ������ �θ�Ŭ�����κ��� ��ӹ���
		// ����� ����� �� �ֽ��ϴ�.
		System.out.println(a.name);
		System.out.println(b.address);

	}

}
