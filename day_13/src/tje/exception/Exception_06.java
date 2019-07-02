package tje.exception;

// ����(Exception) ó��
// ���� : �߸��� ��, ������ �����ϴ� ��� ����� �� ����
// ���� : �߸��� ��, 
//    Ư�� ��Ȳ �Ǵ� ������ �����Ǵ� ��� ���α׷��� ����Ǵ� ����
// ���ܴ� �پ��� ��Ȳ�� ���ؼ� �߻��ϴ� �������� ��� ���ܸ� ��ó�� �� ����
// �ٸ�, ���ܰ� �߻��� ��� ���α׷��� ������� �ʰ� ����� ���� ����� ����
// �� �� �־����.
// (���ܰ� �߻��ص� ���α׷��� ����������� �ʰ� ����ڿ��� ���ñ��� �־����)

import java.util.*;

public class Exception_06 {
	public static void main(String[] args) {		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		
		// try �������� ������ ������
		// try ������ ����� �� ������ �� �����ϴ�.
		// try ������ ���������� ������ ��� ¦��/Ȧ���� 
		// ����ϱ� ���ؼ� ������ ����
		// try �������ο��� �ʱ�ȭ�ϴ� �ڵ�� ������� ���� ���ɼ��� �ֱ� ������
		// �ʱ�ȭ�� ����
		int num=0;
		
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
			num = kb.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException �߻��Ͽ� ó����");
			System.out.println("���α׷� ����");
			kb.close();
			return;
		}
		
		if( num % 2 == 0 )
			System.out.printf("¦���Դϴ�.\n");
		else
			System.out.printf("Ȧ���Դϴ�.\n");

		System.out.println("���α׷� ����");
		kb.close();
	}
}