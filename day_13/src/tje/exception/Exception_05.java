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

public class Exception_05 {
	public static void main(String[] args) {		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("�޼����� �Է��ϼ���(5���� �̻�) : ");
		String msg = kb.next();
		
		if(msg.length() < 5)
			msg = null;
		
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
			// java.lang.NullPointerException �߻� ���ɼ��� ����
			// ���۷��� ������ null ���� ���Ե� ���¿��� ���� ������ �����ϴ� ��� �߻��Ǵ� ����
			System.out.printf("�Էµ� ���ڿ��� ���̴� %d �Դϴ�.\n",msg.length());
		} catch(NullPointerException e) {
			System.out.println("NullPointerException ���ܰ� �߻��Ͽ� ó����");
		}
		System.out.println("���α׷� ����");
		kb.close();
	}
}