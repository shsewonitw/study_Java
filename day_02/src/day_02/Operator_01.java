package day_02;

// ������
// �����ڴ� �ڹ� ���� ����� �� �ִ� ��ȣ���� ����
// +, -, %, >>, <<, &&, || ...

public class Operator_01 {

	public static void main(String[] args) {
		// ���������
		// +, -, *, /, %
		int n1 = 10;
		int n2 = 7;
		int result;
		result = n1 + n2;
		System.out.printf("%d %c %d = %d\n", n1,'+',n2,result);

		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n", n1,'-',n2,result);
		
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n", n1,'*',n2,result);
		
		// ������ ���� : ���� ���̿����� ������ ��� ������ ��ȯ
		result = n1 / n2;
		System.out.printf("%d %c %d = %d\n", n1,'/',n2,result);
		
		result = n1 % n2;
		System.out.printf("%d %c %d = %d\n", n1,'%',n2,result);
		
		byte b1 = 10;
		byte b2 = 7;
		// �ڹٿ��� ��������ڴ� ���� ���̿����� ������ int�� ��ȯ
		// �Ʒ��� ���� byte �Ǵ� short Ÿ���� ������ ��������� ����� ���Թ޴� ��� ������ ������ �߻�
		// byte b3 = b1 + b2;
		// ���� ����ȯ�� ���ؼ� ��������� ����� byte �Ǵ� short Ÿ���� ������ ������ �� ����
		byte b3 = (byte)(b1 + b2);
		
		// �������� ���� �Ǵ� ������ �Ǽ��� ��� �ش� �Ǽ��� Ÿ���� ��ȯ
		// ���� + float = float
		// double + ���� = double
		// double + float = double
	}

}
