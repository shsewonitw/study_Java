
public class Method_03 {

	// Call By Value ����� �޼ҵ� ȣ��
	// �޼ҵ带 ȣ���� �� �����ϴ� �Ű������� ���� ����� �ǹ�(int, float, double)
	// �Ʒ��� setNum �޼ҵ带 �����ϱ� ����
	// main �޼ҵ��� num ������ ���� 10�� �Ѱ��ְ�, setNum �޼ҵ忡��
	// �ش� ���� 777���� ����������, main �޼ҵ� num ������ ���� ������� �ʽ��ϴ�.
	// ������ �����ϴ� �޼ҵ� ȣ���̾��� ������...(STACK �޸��� ������ ����)
	
	// 1. �޼ҵ��� �Ű������� ���������Դϴ�.
	// 2. ���δٸ� �޼ҵ忡���� ������ �̸��� ������ �����ϴ� ���� ����
	
	public static void setNum(int num) {
		num = 777;
		System.out.printf("(setNum) num = %d\n",num);
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		System.out.printf("(main) num = %d\n",num);
		setNum(num);
		System.out.printf("(main) num = %d\n",num);
		System.out.println("���α׷� ����");
	}

}
