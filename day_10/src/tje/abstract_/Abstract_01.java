package tje.abstract_;

// �߻� Ŭ����
// ����� ���� �������� ������ �������� �ο��ϱ� ���� Ŭ����

// �Ϲ����� ����� ���� ������ ������ ������
// �������� ����
// ����� ���� �������� �����ϰ��� �Ͽ���, ����Ŭ�������� �޼ҵ� �������̵��� �������� ������ �������� ������ �� �����ϴ�.
// �̶�, �������̵��� �������� �ʴ°��� ������ ������ ���ٴ� ���� �������� �����Դϴ�.

class Animal_A {
	// �޼ҵ� �������̵��� ����
	// ������ ������ ���� �޼ҵ��� ����
	// (�θ�Ŭ������ sound �޼ҵ�� ���¸� �����)
	public void sound() {}
}

// �޼ҵ� �������̵��� �����ϰ� �ִ� ������ Ŭ����
class Dog_A extends Animal_A {	
	public void sound() {
		System.out.println("�۸�~!");
	}
}

// �޼ҵ� �������̵��� �������� ���� ����� Ŭ����
class Cat_A extends Animal_A {}

public class Abstract_01 {
	public static void main(String[] args) {		
		Animal_A [] animals = new Animal_A[3];
		
		animals[0] = new Dog_A();
		animals[1] = new Cat_A();
		animals[2] = new Dog_A();
		for(int i = 0 ; i < animals.length ; i++) {
			// �������� ���� �޼ҵ� ����
			// ���� ��ü�� Ÿ�Կ� ���� ���� �ٸ� ������ ����
			// ������ : �۸�~!
			// ����� : ?
			animals[i].sound();
		}

	}
}
