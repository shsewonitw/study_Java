package tje.interface_;

class Super_A {}
class Super_B {}


// �ڹ� ���� �����ϴ� ��� �����
// ���� ��Ӹ��� �����մϴ�.
// �ϳ��� Ŭ������ �ϳ��� �θ�Ŭ������ ���� �� �ֽ��ϴ�.
// (���� ���� Ŭ������ ����� �� ����)
// class Sub_A extends Super_A, Super_B {};

// ���� ����� �����ϱ� ���� �������̽�
// �������̽��� Ŭ���� -> ������ �ִ� Ŭ����
// �������̽��� ����ʵ�� public static final ����� ���� �� �ֽ��ϴ�.
// �������̽��� ����޼ҵ�� public abstract �޼ҵ常 ���� �� �ֽ��ϴ�.

// �������̽� ���� ���
// interface �������̽���{
//		�������...(public static final)
//		����޼ҵ�...(public abstract)
// }

interface Inter_A {
	// �Ϲ� ��� �ʵ��� ������ ���ѵ�
	// public int n1;
	
	// �������� ������ �Ұ��� 
	// public Inter_A() {
	// 	System.out.println("Inter_A ������ ����");
	// }
	
	// �Ϲ� �޼ҵ��� ������ ���ѵ�
	// public void printInfo() {}
	
	// �������̽� ���ο� ������ �� �ִ� ���
	// 1. public static final �������
	public static final int num=10;
	// 2. public abstract ����޼ҵ�
	public abstract void test();
}

// �������̽��� ��ӹ޴� Ŭ������ ����
// (�������̽��� �����ϴ� Ŭ������ ����)
// class �ڽ�Ŭ������ implements �θ��������̽���

class Sub_A implements Inter_A{
	public void test() {
		System.out.println("Sub_A Ŭ������ test �޼ҵ� ����");
	}
}

public class Interface_01 {

	public static void main(String[] args) {
		// �������̽��� ��ü�� ������ �� �����ϴ�.
		// 1. �������� ����
		// 2. �߻�޼ҵ带 ������ �� �ֱ� ������...
		// Inter_A i = new Inter_A();
		
		// ����� ���� ������ �������� �������̽��� Ȱ���
		// �θ� �������̽��� ���۷����� ����Ͽ�
		// �ڽ�Ŭ������ ��ü�� ����
		Inter_A i = new Sub_A();
		
		// �θ� �������̽��� ���۷����� ����Ͽ�
		// �ڽ� Ŭ������ �������̵��� �޼ҵ带 ȣ��
		i.test();
	}

}
