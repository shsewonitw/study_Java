package tje.exception;

import java.util.*;

public class Exception_10 {

	public static void main(String[] args) {

		String name; 
		int age; 

		// ���ҽ��� �ڵ������� ���� ���� ( JDK 1.8 �̻󿡼��� ���� )
		// �Ϲ������� ����ó���� ����¿� ���õ� �۾��� ����
		// �Ź� finally ������ ���ؼ� ���ҽ��� �����ϴ� ������
		// ���ŷӱ� ������
		// try (����¿� ����� ����) �� ���� ���ҽ��� �����ϴ� ���
		// try ������ ���������� ���� �ڵ����� close �޼ҵ带 ȣ���մϴ�.
		try (Scanner kb = new Scanner(System.in) ; Scanner kb1 = new Scanner(System.in)){
			System.out.print("�̸��� �Է��ϼ���: ");
			name = kb.next();

			System.out.print("���̸� �Է��ϼ���: ");
			age = kb.nextInt();

			System.out.printf("�̸�: %s, ����: %d\n", name, age);
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}

}
