package tje.exception;

import java.util.*;

public class Exception_12 {

	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("���� �Է�(10 �̻� �Է�): ");
		int num = kb.nextInt();
		
		// ����ڰ� 10 �̸��� ���� �Է��� ��� ������ ���ܸ� �߻���Ű�� ����
		if(num < 10)
			throw new Exception("10 �̸��� ���� �ԷµǾ����ϴ�.");
		
		System.out.printf("�Էµ� ������ %d �Դϴ�.\n",num);

		kb.close();
		System.out.println("���α׷� ����");
	}

}
