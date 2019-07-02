class Animal {
	public void sound() {
		System.out.println("�Ҹ��� ���ϴ�.");
	}
}
class Dog extends Animal {
	public void sound() {		
		super.sound();		
		System.out.println("�۸�~!");
	}
}
class Cat extends Animal {
	public void sound() {
		super.sound();		
		System.out.println("�߿�~!");
	}
}
public class Class_39_MethodOverriding {
	public static void main(String[] args) {		
		Dog d = new Dog();
		Cat c = new Cat();		

		d.sound();	c.sound();		
		
		// �θ�Ŭ������ ���۷��� ������
		// �ڽ�Ŭ������ ��ü�� ������ �� �ֽ��ϴ�.
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		// �޼ҵ� �������̵��� �����ϴ� ���
		// �������̵� �� �޼ҵ�� �θ�Ŭ������ 
		// ���۷��� ������ ���ؼ��� ����˴ϴ�.
		a1.sound();
		a2.sound();
	}
}













