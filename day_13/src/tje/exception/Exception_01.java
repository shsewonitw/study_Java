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

public class Exception_01 {
	public static void main(String[] args) {		
		// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
		Scanner kb = new Scanner(System.in);
		
		System.out.print("1��° ���� �Է�: ");
		int n1 = kb.nextInt();
		System.out.print("2��° ���� �Է�: ");
		int n2 = kb.nextInt();
		
		// ��� ���α׷��� ���� ������ ���� ��, 0�� ������ �Ǹ� ���ܰ� �߻�		
		int result = n1 / n2;
		
		System.out.printf("%d / %d = %d\n",n1,n2,result);
		kb.close();
	}
}