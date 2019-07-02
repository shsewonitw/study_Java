package tje.interface_;

// �������̽� ���� ���
// �������̽��� �θ� �������̽��� ����� �� �ֽ��ϴ�.
// interface �ڽ��������̽� extends �θ��������̽�1, �θ��������̽�n ....

interface Inter_Super_A {
	public abstract void test_1();
}

interface Inter_Super_B {
	public abstract void test_2();
}

// �������̽��� ���� ���
// �������̽��� ��ӹ޴� �ڽ� �������̽��� �θ��������̽��� 
// �߻�޼ҵ带 �����ϰ� �ֽ��ϴ�.
interface Inter_Sub extends Inter_Super_A , Inter_Super_B {
	public abstract void test_3();
}

// �������̽� �� ����� �����ϰ� �ִ� �������̽���
// Ŭ�������� �����ϴ� ��� �θ��������̽���
// �߻�޼ҵ带 �����Ͽ� �������̵��� �����ؾ� �մϴ�.
class Inter_Sub_Class_1 implements Inter_Sub {
	public void test_1() {}
	public void test_2() {}
	public void test_3() {}
	
}

public class Interface_03 {

	public static void main(String[] args) {
		// �ڽ�Ŭ������ ��ü ����
		Inter_Sub_Class_1 obj = new Inter_Sub_Class_1();
		// �θ��������̽��� ���۷��� ������ ����Ͽ�
		// �ڽ�Ŭ������ ��ü�� ����
		Inter_Super_A a = obj;
		Inter_Super_B b = obj;
		Inter_Sub s = obj;
		
		// �� �θ��������̽��� ���۷��� ������ 
		// �ش� �������̽��� ����� ������� ������ �����մϴ�.
		a.test_1();		// a.test_2();		a.test_3();
		b.test_2();		// b.test_1();		b.test_3();
		s.test_1();		s.test_2();		s.test_3();
	}

}
