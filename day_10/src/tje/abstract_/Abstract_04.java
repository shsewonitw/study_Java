package tje.abstract_;

// �߻� Ŭ������ ����
// �߻� �޼ҵ� ������ ������!!
// ���� ���� �پ��� ����� ������ �� �ִ�
// �߻� �޼ҵ带 ���� �߻� Ŭ������ ��ӿ� �δ��� �ְ� �˴ϴ�.
// �ڽ� Ŭ�������� ������� ���� �߻� �޼ҵ��, ��ü ������ ����
// �ݵ�� �����ؾ� �ϴ� ������!!

abstract class Abstract_B {
	public abstract void test_1();
	public abstract void test_2();
	public abstract void test_3();
	public abstract void test_4();
	public abstract void test_5();
	public abstract void test_6();
	public abstract void test_7();
	public abstract void test_8();
	public abstract void test_9();
	public abstract void test_10();
}

// �߻�Ŭ������ �߻�޼ҵ尡 ���� �����ϴ� ���
// �ڽ�Ŭ������ �δ��� �����ֱ� ���� ����
// ����� Ŭ����
// �߻� Ŭ������ ��� �߻� �޼ҵ带 ���� �޼ҵ� ���·� �̸� ������ ���� Ŭ����
class Abstract_BAdapter extends Abstract_B {
	public void test_1() {}
	public void test_2() {}
	public void test_3() {}
	public void test_4() {}
	public void test_5() {}
	public void test_6() {}
	public void test_7() {}
	public void test_8() {}
	public void test_9() {}
	public void test_10() {}
}

// test_1 �޼ҵ带 �ʿ�� �ϴ� �ڽ�Ŭ����
class Abstract_B_Sub1 extends Abstract_BAdapter {
	// test_1 �޼ҵ带 �뵵�� �°� �������̵� ����
	public void test_1() {
		System.out.println("Abstract_B_Sub2���� ������ test_1 �޼ҵ�");
	}
}

public class Abstract_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
