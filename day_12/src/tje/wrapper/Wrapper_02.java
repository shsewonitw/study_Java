package tje.wrapper;

public class Wrapper_02 {
	public static void main(String[] args) {
		// ���� Ŭ������ Ȱ��
		// �� ���� Ŭ�������� �ش� �ڷ����� ����
		// �������� static ��� �ʵ�/�޼ҵ�� �����մϴ�.
		
		// int Ÿ���� ���� ������ �ִ밪 �� �ּҰ�
		System.out.printf("int Ÿ���� �ִ밪 : %d\n", Integer.MAX_VALUE);
		System.out.printf("int Ÿ���� �ּҰ� : %d\n", Integer.MIN_VALUE);
		// int Ÿ���� ���� ũ��
		System.out.printf("int Ÿ���� ����Ʈ ũ�� : %d\n", Integer.BYTES);
		System.out.printf("int Ÿ���� ��Ʈ ũ�� : %d\n", Integer.SIZE);
		
		String strNum = "101";
		// ���ڿ��� ����� ������ ���� int Ÿ������
		// ��ȯ�� �� �ִ� Integer Ŭ������ parseInt �޼ҵ�
		int num = Integer.parseInt(strNum);
		System.out.printf("num = %d\n", num);
		
		String strBinaryNum = "101";
		// ���ڿ��� ����� ������ ���� int Ÿ������
		// ��ȯ�� �� �ִ� Integer Ŭ������ parseInt �޼ҵ�
		// (������ ������ �߰������� �����Ͽ� ó���� �� ����)
		int binaryNum = Integer.parseInt(strBinaryNum, 2);
		System.out.printf("binaryNum = %d\n", binaryNum);
		
	}
}