
	// Ŭ���� -> ���α׷����� ó���ϰ��� �ϴ� ��� ���� �Ӽ�/�����
	// �����ϰ� �ִ� ����� ���� �ڷ���
	
	// Ŭ������ �ۼ� ���
	// class Ű���带 ����Ͽ� �ۼ�
	
	/*
		class Ŭ������(Ŭ�����̸��� ù���ڴ� �빮�ڷ� �ۼ�) {
			�����ϰ��� �ϴ� ����� �Ӽ�...
			- (���� ����)
			ǥ���ϰ��� �ϴ� ����� ���...
			- (�޼ҵ� ����)
		}
	 */
	
	// First ����
class First {
	// Ŭ������ ���ο��� �Ӽ��� ����� �� �ֽ��ϴ�.
	// �Ӽ� : Ŭ������ ����
	// �Ӽ��� ������ �����ϰ� �ǰ�, Ŭ������ ����ʵ��� ȣĪ��

	// Ŭ������ ����ʵ� ����
	// (ǥ���ϰ��� �ϴ� ����� �Ӽ�)
	int number;

	// Ŭ������ ���ο��� ����� ����� �� �ֽ��ϴ�.
	// ��� : Ŭ������ ������ �� �ִ� ���
	// ����� �޼ҵ�� �����ϰ� �ǰ�, Ŭ������ ����޼ҵ��� ȣĪ��
	
	// Ŭ������ ����޼ҵ� ����
	// (ǥ���ϰ��� �ϴ� ����� ���)
	void showInfo() {
		// Ŭ������ ����޼ҵ忡���� ����ʵ带 �����Ӱ� ������ �� �ֽ��ϴ�.
		System.out.printf("number -> %d\n",number);
	}
}

public class Class_01_Define {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");

		// Ŭ������ ���� ����
		// Ŭ������ ����� ���� �ڷ�������
		// �Ϲ� �ڷ����� ���������� ������ ������ �� �ֽ��ϴ�.
		First f;
		
		// Ŭ���� Ÿ���� ������ ���۷��� �����Դϴ�.
		// (HEAP �޸𸮸� �����ϴ� ����)
		// Ŭ���� Ÿ���� ������ �ش� Ŭ������ ��ü�� �����ϴ� ����
		// ��ü : Ŭ������ ��üȭ�Ǿ� �޸𸮿� �ε��� ����
		// Ŭ������ ���°� �޸𸮿� �ε��� ���¸� ��ü, �ν��Ͻ�
		// Ŭ������ ��ü�� �����ϴ� ���
		// new Ŭ������();
		f = new First();
		
		// Ŭ������ ����� �����ϴ� ���
		// ���ٿ�����(.)�� ���
		f.number = 111;
		f.showInfo();
		System.out.println("���α׷� ����");
	}

}