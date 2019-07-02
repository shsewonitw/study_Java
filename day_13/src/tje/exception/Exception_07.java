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

public class Exception_07 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int num = 0;

		// �ùٸ��� ������ �Էµ� ������ ���� �Է��� ��û�� ��,
		// ¦�� Ȧ�� ���θ� ����ϼ���.

		while (true) {
			try {
				// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
				System.out.print("������ �Է��ϼ��� : ");
				num = kb.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("InputMismatchException �߻��Ͽ� ó����");
				kb.next();
				continue;
			}
			break;
		}

		if (num % 2 == 0)
			System.out.printf("¦���Դϴ�.\n");
		else
			System.out.printf("Ȧ���Դϴ�.\n");

		System.out.println("���α׷� ����");
		kb.close();
	}
}