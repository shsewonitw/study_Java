
class ThisD {
	private int num1;
	private int num2;
	private int num3;

	public ThisD(int num1) {
		this.num1 = num1;
	}
	
	public ThisD(int num1, int num2) {
		// num1 �� �ʱ�ȭ�ϴ� �ڵ尡 �ߺ��Ǵ� ���
		//this.num1 = num1;
		
		// ������ ���̿����� this�� Ȱ���Ͽ� �����ڰ� ȣ���� �� �� �ֽ��ϴ�.
		// this(�������� �Ű�����...)
		
		// ���� Ŭ������ int Ÿ���� 1�� ���޹޴� �����ڸ� ȣ��
		this(num1);
		this.num2 = num2;
	}
	
	public ThisD(int num1, int num2, int num3) {
		// num1 �� num2 �� �ʱ�ȭ�ϴ� �ڵ尡 �ߺ��Ǵ� ���
		// this.num1 = num1;
		// this.num2 = num2;
		
		// ������ ���̿��� this�� Ȱ���Ͽ� �����ڰ� ȣ���� �� �� �ֽ��ϴ�.
		// this(�������� �Ű�����...)
		
		// ����Ŭ������ int Ÿ���� 2�� ���޹޴� �����ڸ� ȣ��
		this(num1, num2);
		this.num3 = num3;
	}
	
	
}

public class Class_16_This {

	public static void main(String[] args) {


	}

}
