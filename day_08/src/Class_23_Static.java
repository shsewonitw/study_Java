
class StaticE {
	private int num_normal;
	private static int num_static;
	
	public StaticE(int num_normal, int num_static) {
		this.num_normal = num_normal;
		this.num_static = num_static;
	}
	
	// �Ϲ� �޼ҵ��� ����
	// �Ϲ� �޼ҵ�� Ŭ������ ��ü�� �����ϰ� �ִ� ���۷��� ������ 
	// �������� this�� ���� �޾� �ش� ��ü�� ����� ������ �� �ִ� �޼ҵ�
	public void showInfo_normal() {
		System.out.printf("num_normal = %d, num_static = %d\n",num_normal,num_static);
	}
	
	// static �޼ҵ忡���� this �� ����� �� �����ϴ�.
	// static �޼ҵ�� Ŭ������ �̸����� ���� ������ �� �ִ� �޼ҵ�μ�
	// ��ü�� �������� ��Ÿ���� this�� ���޹��� �� �����ϴ�.
	// �̷��� ������ static �޼ҵ��� ���ο����� this�� ����ؾ� �ϴ�
	// �Ϲ� ����ʵ�, �Ϲ� �޼ҵ� ȣ���� �� �� �����ϴ�.
	public static void showInfo_static() {
		//System.out.printf("num_normal = %d, num_static = %d\n",num_normal,num_static);
		System.out.printf("num_static = %d\n",num_static);
		// �Ϲ� �޼ҵ带 ȣ���ϱ� ���ؼ��� ������ �Ű�����
		// this�� �����ؾ� ������, static�޼ҵ� ���ο�����
		// this�� ����� �� ���� ������ �Ϲ� �޼ҵ忡 this����
		// ������ �� �����ϴ�.
		// showInfo_normal();
		
		// static �޼ҵ� ���ο�����
		// static ����ʵ�, ��� �޼ҵ常�� ����� �� �ֽ��ϴ�.
	}
}

public class Class_23_Static {

	public static void main(String[] args) {
		// Ŭ������ �Ϲ� ��� �޼ҵ带 ����ϱ� ���ؼ��� 
		// �ݵ�� ��ü�� ������ �� ȣ���ؾ��մϴ�.
		
		// �Ϲ� ��� �޼ҵ�� Ŭ������ �̸����� ������ ������ �ʽ��ϴ�.
		// StaticE.showInfo_normal();
		StaticE obj = new StaticE(10,20);
		obj.showInfo_normal();
		
		// �ݸ� static �޼ҵ�� ��ü�� ��������
		// Ŭ������ �̸����� ȣ���� �� �ִ� �޼ҵ��Դϴ�.
		StaticE.showInfo_static();

	}

}
