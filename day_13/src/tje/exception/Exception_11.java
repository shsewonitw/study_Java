package tje.exception;

import java.util.*;

public class Exception_11 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		// nextInt �޼ҵ�� �Էµ� �����͸�
		// ������ ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ� �Դϴ�.
		// �̶�, ���� ������ �����Ͱ� �ƴ� ���
		// ������ ���ܸ� �߻����� ���α׷��� �����ϰ� �˴ϴ�.
		// ���ܴ� ����ڿ� ���ؼ� ������ �Ǵܿ� ����
		// ������ �߻���ų �� �ֽ��ϴ�.
		int num = kb.nextInt();
		
		System.out.printf("�Էµ� ������ %d �Դϴ�.\n",num);

		kb.close();
		System.out.println("���α׷� ����");
	}

}
