package tje.interface_;

// �θ� �������̽�
interface Inter_D {
	public abstract void test_1();
}

// �θ� Ŭ����
abstract class Super_D {
	public abstract void test_2();
}


// Ŭ������ �������̽��� ���ÿ� ���� ����� ���� �� �ֽ��ϴ�.
// class �ڽ� Ŭ������ extends �θ�Ŭ������ implements ���θ��������̽���
class Sub_D extends Super_D implements Inter_D {
	public void test_1() {}
	public void test_2() {}
}
public class Interface_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
