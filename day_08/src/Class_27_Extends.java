// ����� ����
// extends Ű������ ���
// class SubClass�� extends SuperClass��
// ����� �޴� Ŭ���� : ����Ŭ����, �ڽ�Ŭ����, ����Ŭ����
// ����� ���ִ� Ŭ���� : ����Ŭ����, �θ�Ŭ����, ����Ŭ����

class �ڵ��� {
	double ����;
	double ��ⷮ;
	int �����;
}

class K7 extends �ڵ��� {}


public class Class_27_Extends {

	public static void main(String[] args) {
		// ����� ������ �ڽ�Ŭ������ ��ü�� ����
		K7 car = new K7();
		
		// �ڽ� Ŭ������ �θ�Ŭ�����κ��� ��ӹ��� ������� ����� �� �ֽ��ϴ�.
		System.out.printf("���� : %f\n",car.����);
		System.out.printf("��ⷮ : %f\n",car.��ⷮ);
		System.out.printf("����� : %d\n",car.�����);
	}

}
