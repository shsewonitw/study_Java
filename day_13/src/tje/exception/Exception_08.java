package tje.exception;

// ����(Exception) ó��
// try ���� ������ �����ڵ忡�� 
// ���� �ٸ� �ټ� ���� ���ܰ� �߻��� ���ɼ��� �ִ� ���

/*
	try {
		���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
	} catch(ù��° ����ó�� Ŭ������) {
		ù��° ����ó�� Ŭ���� Ÿ���� ���ܰ� �߻��� ����� �����ڵ�
	} catch(�ι�° ����ó�� Ŭ������) {
		�ι�° ����ó�� Ŭ���� Ÿ���� ���ܰ� �߻��� ����� �����ڵ�
	} catch(Exception e) {
		// Exception Ŭ������ ��� ����ó�� Ŭ������ �ֻ��� �θ�Ŭ����
		// �ռ� ������ catch �������� ó���� �� ���� ���ܰ� �߻���
		// ��� ó���� �����ڵ�
	} 
*/

import java.util.*;

public class Exception_08 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n1, n2, result;
		
		try {
			// �߸��� ������ �Է��� ���� ���ɼ��� �ִ� �ڵ�
			System.out.print("1��° ������ �Է��ϼ��� : ");
			n1 = kb.nextInt();
			
			if(n1>10)
				kb.close();
			System.out.print("2��° ������ �Է��ϼ��� : ");
			n2 = kb.nextInt();
			
			// / 0 �� ���輺�� �ִ� �ڵ�
			result = n1 / n2;
			System.out.printf("%d / %d = %d\n",n1,n2,result);
		} catch(InputMismatchException e) {
			System.out.println("�߸��� ������ �Է��� ����");
		} catch(ArithmeticException e) {
			System.out.println("���� ���꿡�� ������ �߻���");
		} catch(Exception e) {
			// Exception Ŭ������ ��� ����ó�� Ŭ������ �ֻ��� �θ�Ŭ����
			// �ռ� ������ catch �������� ó���� �� ���� ���ܰ� �߻���
			// ��� ó���� �����ڵ�
			System.out.println("�������� ���� ���ܰ� �߻��Ͽ� ó����");
			
			// ����ó�� Ŭ������ �޼ҵ�
			// 1. getMessage �޼ҵ�
			//  - ���� �߻��� ���ܿ� ���õ� ������ ���ڿ��� ��ȯ
			//  - ������ Ÿ�Կ� ���� �޼����� �������� �������� ���� (null ���� ��ȯ�� �� ����)
			System.out.printf("Exception Message : %s\n",e.getMessage());
			
			// 2. printStackTrace �޼ҵ�
			//  - ���� �߻��� ������ �߻� ������ ���ñ����� ����ϴ� �޼ҵ�
			//  - �Ϲ������� ���ܸ� ó������ �ʾ����� ��µǴ� ����� ������
			//  - ����� ��, ������ �߻� ������ �����ϰ��� �ϴ� ��� ����
			e.printStackTrace();
			
			// 3. getClass �޼ҵ�
			//  - ���ܰ� �߻��� Ŭ������ Ÿ���� ��ȯ
			System.out.printf("Exception Type : %s\n",e.getClass().getName());
		}
		
		System.out.println("���α׷� ����");
		kb.close();
	}
}
