package day_02;

public class Operator_09 {
	
	public static void main(String[] args) {
		// ���׿�����
		// ���ǽ��� ����� ���� �� �Ǵ� ���� �б��� �� �ִ� ������
		// ���ǽ� : ���� �������� ������ ��
		// ���ǽ��� ���迬���� �Ǵ� �������ڸ� �����Ͽ� �ۼ�
		// ���� -> ���ǽ� ? ���ǽ��� ���� ����� ��/�� : ���ǽ��� ������ ����� ��/��
		
		int number = 20;
		
		// ¦�� / Ȧ�� �޼����� �����ϴ� ����
		String result;
		result = number % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.printf("%d ������ %s �Դϴ�.\n",number,result);
	}
}

