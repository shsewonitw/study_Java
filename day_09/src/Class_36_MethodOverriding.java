
// �θ�Ŭ���� ���ǵǴ� �Ӽ�, �Ǵ� ��ɵ���
// ��� �ڽ�Ŭ�������� �����ؾ� �ϹǷ�
// �Ϲ����� ���Ǹ� ����� �� �ֽ��ϴ�.
// ������ �ڽ�Ŭ���������� 
// �ڱ⸸�� ��Ư�� ����� ������ �� ����
class Animal_1 {
	public void sound() {
		System.out.println("�Ҹ��� ���ϴ�.");
	}
}
class Dog_1 extends Animal_1 {}
class Cat_1 extends Animal_1 {}

public class Class_36_MethodOverriding {
	public static void main(String[] args) {		
		Dog_1 d = new Dog_1();
		Cat_1 c = new Cat_1();
		
		// ��ӹ޴� �޼ҵ尡 �ڽ�Ŭ�������� 
		// ��︮�� �ʴ� ���!
		d.sound();	c.sound();		
	}
}





