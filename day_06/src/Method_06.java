
public class Method_06 {
	// �޼ҵ� �����ε�
	// �޼ҵ��� �̸��� ����, �Ű������� Ÿ��, ����, ������ �ٸ���
	// ���� �ٸ� �޼ҵ�� �����ϴ� ����
	// �ϰ��� �޼ҵ� �̸��� ����Ͽ� ����ڿ��� �������� �̸��� �˷��ݴϴ�.

	// 2���� ������ �Ű������� �Է¹޾� ���� ū ���� ��ȯ�ϴ� max2 �޼ҵ�
	public static int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

	// 3���� ������ �Ű������� �Է¹޾� ���� ū ���� ��ȯ�ϴ� max3 �޼ҵ�
	public static int max(int n1, int n2, int n3) {
		int r = n1 > n2 ? n1 : n2;
		return r > n3 ? r : n3;
	}

	// 4���� ������ �Ű������� �Է¹޾� ���� ū ���� ��ȯ�ϴ� max4 �޼ҵ�
	public static int max(int n1, int n2, int n3, int n4) {
		int r;
		if ( n1 > n2 ) r = n1;
		else		   r = n2;
		if( n3 > r )   r = n3;
		return r > n4 ? r : n4;
	}
	public static void main(String[] args) {
		
		System.out.println(max(10,20));
		System.out.println(max(10,20,30));
		System.out.println(max(10,20,30,40));
		
		// println �޼ҵ�� ������ �̸��� �����
		// �پ��� �Ű������� ����� �� �ֽ��ϴ�.
		// �޼ҵ� �����ε��� ��:
		// System.out.println(1);
		// System.out.println("Hello");

	}

}
