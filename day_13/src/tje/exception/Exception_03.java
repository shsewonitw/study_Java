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

public class Exception_03 {
	public static void main(String[] args) {		
		// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
		Scanner kb = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = kb.nextInt();
		
		if( num % 2 == 0 )
			System.out.printf("¦���Դϴ�.\n");
		else
			System.out.printf("Ȧ���Դϴ�.\n");
		kb.close();
	}
}