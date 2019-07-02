package tje.exception;

// ����(Exception) ó�� ���
// try {
//		���ܰ� �߻��� ���ɼ��� �ִ� ���� �ڵ�...
// } catch ( ����Ŭ������ ������ ) {
//		���ܰ� �߻��� ����� ���� �ڵ�...
// 	 }

// try ������ ����� ���๮���� ���ܰ� �߻����� �ʴ� ��� 
// catch ������ ������� �ʽ��ϴ�.
// ������ ���ܰ� �߻��� ��� try ������ ���̻� �������� �ʰ�
// ��� catch �������� �̵��ϰ� �˴ϴ�.
// �߻��� ������ ������ catch ���� ����� Ŭ������ �����ϴٸ�
// �ش� catch ���� ����Ǹ鼭 ���������� ���α׷��� ����˴ϴ�.
// ���� catch ���� ����� ����Ŭ������ �߻��� ���ܰ� �ٸ��ٸ�
// ���ܸ� ó���� �� ���� ���α׷��� ���� ����˴ϴ�.

import java.util.*;


public class Exception_04 {
	public static void main(String[] args) {		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("1��° ���� �Է�: ");
		int n1 = kb.nextInt();
		System.out.print("2��° ���� �Է�: ");
		int n2 = kb.nextInt();
		
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
			// ��� ���α׷��� ���� ������ ���� ��, 0�� ������ �Ǹ� ���ܰ� �߻�		
			int result = n1 / n2;
			System.out.printf("%d / %d = %d\n",n1,n2,result);
		} catch(ArithmeticException e) {
			System.out.println("ArthmeticException Ÿ���� ���ܰ� �߻��Ͽ� ó����");
		}
		
		System.out.println("���α׷� ����");
		kb.close();
	}
}