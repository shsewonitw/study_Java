package day_02;

public class Variable_04 {

	public static void main(String[] args) {
		// �ڷ����� ���� ������ �ʱ�ȭ ��
		
		// 1. ���� Ÿ���� ������ �ʱ�ȭ �ϴ� ���
		//    - ���ڿ��� �����ϴ� ��� �ֵ���ǥ�� ���("���ڿ�")
		//    - ���ڰ��� �����ϴ� ��� ��������ǥ�� ���('A')
		char ch1 = 'A';
		System.out.printf("ch1 = %c\n",ch1);
		// �ڹٴ� �����ڵ带 �����ϹǷ� �ѱ۵� ������ ����
		char ch2 = '��';
		System.out.printf("ch2 = %c\n",ch2);
		
		// ��������ȯ
		// Ư�� Ÿ���� ���ϴ� Ÿ������ �����ϴ� ���
		// (������Ÿ��)�� �Ǵ� ����
		// ���ڴ� ������ ����Ǹ�, A -> 65, a -> 97, 0 -> 48
		System.out.printf("ch1 = %d\n",(int)ch1);
		System.out.printf("ch2 = %d\n",(int)ch2);
		
		System.out.printf("A = %d, a = %d, 0 = %d\n",(int)'A', (int)'a', (int)'0');
		// ���ڰ��� �����ϴ� char Ÿ���� ��ȣ�� �������� �ʴ´�.
		// �����ڵ�ǥ�� ������ ���� �������� �ʴ´�.
		char ch3 = 127;
		// char ch3 = -127;
		
		// �����ڵ尪�� ����� ��ҹ��� ��ȯ
		char ch4 = 'A';
		// �빮�ڸ� �ҹ��ڷ� �����ϴ� ��� ���� �������� ó��
		// �빮�ڿ� �ҹ����� ���̸� �����ִ� ���
		System.out.printf("��ȯ �� : %c, ��ȯ �� : %c\n", ch4,ch4+32);
		System.out.printf("��ȯ �� : %c, ��ȯ �� : %c\n", ch4,ch4+'a'-'A');
		
		char n1 = '7';
		char n2 = '5';
		System.out.println((int)n1);
		System.out.println((int)n2);
		
		// ���ڷ� ����� ���ڸ� ���� ������ ��ȯ�ϱ� ���ؼ�
		// ���� 0 ���� �ش�Ǵ� ����ŭ ����
		System.out.printf("%c + %c = %d\n", n1,n2,n1-'0'+n2-'0');
	}

}
