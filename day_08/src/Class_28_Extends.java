
class SuperA {
	private int n1;
	public int n2;
	// ����Ʈ ����������
	// �⺻�����δ� publicó�� ����
	int n3;
}

class SubA extends SuperA {
	public void printInfo() {
		// �θ�Ŭ������ private �����
		// �ڽ�Ŭ�������� ������ �� ���� ����Դϴ�.
		// System.out.printf("n1 = %d\n",n1);
		// �θ�Ŭ������ public, ����Ʈ ���������ڷ� ����� �����
		// �ڽ�Ŭ�������� ������ �� �ִ� ����Դϴ�.
		System.out.printf("n2 = %d\n",n2);
		System.out.printf("n3 = %d\n",n3);
	}
}

public class Class_28_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
