package tje.exception;

import java.util.*;

public class Exception_09 {

	public static void main(String[] args) {
		// Ű���� �Է� �۾��� ó���ϱ� ����
		// Scanner ��ü�� ����
		Scanner kb = new Scanner(System.in);

		String name; // �л� �̸�
		int age; // �л� ����

		try {
			System.out.print("�̸��� �Է��ϼ���: ");
			name = kb.next();

			System.out.print("���̸� �Է��ϼ���: ");
			age = kb.nextInt();

			System.out.printf("�̸�: %s, ����: %d\n", name, age);
			
			// try ���� ������ ���� �ڵ�� �Ϲ������� ����¿� ���õ� 
			// �۾��� �����ϴ�.
			// �ڹٿ����� ������� ��Ʈ���� ������ ����ϰ� ������
			// ��� ����� �۾� ��, ��Ʈ���� �����ϴ� �ڵ尡 �ʿ��մϴ�.
			// �Ʒ��� ���� try �������� close �޼ҵ带 ȣ���ϴ� ���
			// ���ܰ� �߻��ɶ� ������� ���ϴ� �������� �����Ƿ�]
			// catch �������� close�� �����ؾ� �մϴ�.
			
			// ���ܰ� �߻����� ���� ��� close ó��
			// kb.close();
		} catch (Exception e) {
			// ���ܰ� �߻��� ��� close ó��
			// kb.close();
			e.printStackTrace();
		} finally {
			// ���� �߻� ���ο� �������
			// �׻� ����Ǵ� ����
			// �Ϲ������� ����¿� ���õ� 
			// ��Ʈ���� �����ϴ� �ڵ带 �ۼ��մϴ�.
			System.out.println("finally ����");
			kb.close();
		}
		// Scanner Ŭ������ Ȱ���Ͽ� Ű�����Է��� ó���ϴ� ���
		// �ݵ�� ����� ���� close�޼ҵ带 ȣ���Ͽ�
		// �����ؾ߸� �մϴ�.
		// kb.close();
		System.out.println("���α׷� ����");
	}

}
