
// static �޼ҵ�
// static ��� �ʵ�� ���� ���α׷� �������� �޸𸮿� �ε��Ǿ�
// ��ü�� �������� Ŭ���� �̸��� ����� ȣ���� �� �ִ� �޼ҵ�

// 1. ������ ���� ����� �����ϱ� ���ؼ�(Math Ŭ����)
// 2. private ���������ڰ� ����� static ����� �ʱ�ȭ�ϱ� ���ؼ�

class StaticD {
	// �ܺο����� ������ ���ܵ� static ����ʵ�
	private static int ARRAY_SIZE = 17;
	// private ���ǵ� static ����� �����ϱ� ����
	// static �޼ҵ�
	public static int getARRAY_SIZE() {
		return ARRAY_SIZE;
	}
}

public class Class_22_Static {

	public static void main(String[] args) {
		// private ���� ���ǵ� static ����� �ܺο����� ������ ������ �ʴ´�.
		//System.out.printf("�迭�� ũ�� : %d\n",StaticD.ARRAY_SIZE());
		
		// static �޼ҵ�� ��ü�� �������� Ŭ������ �̸����� ����� �� �ִ� �޼ҵ�
		// private static ����� ���� ��ȯ�޴� ����
		System.out.printf("�迭�� ũ�� : %d\n",StaticD.getARRAY_SIZE());
	}

}
