
class StaticF {
	private static int num;
	
	// private ���� ���ǵ� static ����� �ʱ�ȭ�ϱ� ����
	// static ��
	// static �޼ҵ�� �޸� ȣ��Ǿ�߸� ����Ǵ� ���� �ƴ�
	// Ŭ������ �ε��Ǵ� ������ �ڵ����� ����Ǵ� ����
	static {
		System.out.println("STATIC �� ����");
		num = 800;
	}
	
	// static ��� num�� �ʱ�ȭ�ϱ� ���� �޼ҵ��� ����
	public static void initNum() {
		num = 100;
	}
	// static ��� num�� �����ϱ� ���� �޼ҵ��� ����
	public static void setNum(int num) {
		// static �޼ҵ��� �Ű������� static ��� �ʵ�� �̸��� �ߺ��Ǵ� ���
		// this �� �ƴ� Ŭ������ �̸��� ����Ͽ� �����մϴ�.
		StaticF.num = num;
	}
	
	public static int getNum() {
		return num;
	}
}

public class Class_24_Static {

	public static void main(String[] args) {
		System.out.println("main ����");
		
		// static ����� ���� �ʱ�ȭ���� ���� ���
		// �⺻���� 0, null(���۷��� ������ ���)
		System.out.println(StaticF.getNum());
		// private ���� ���ǵ� static ����� ���� �ʱ�ȭ�ϱ� ���� �޼ҵ��� ȣ�� (�ݵ�� ȣ��Ǿ�߸� ����)
		StaticF.initNum();
		System.out.println(StaticF.getNum());
		
		System.out.println("main ����");
	}

}
