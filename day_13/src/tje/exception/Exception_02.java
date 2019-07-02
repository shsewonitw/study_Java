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

public class Exception_02 {
	public static void main(String[] args) {		
		// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
		Scanner kb = new Scanner(System.in);
		
		System.out.print("�޼����� �Է��ϼ���(5���� �̻�) : ");
		String msg = kb.next();
		
		if(msg.length() < 5)
			msg = null;
		
		// java.lang.NullPointerException �߻� ���ɼ��� ����
		// ���۷��� ������ null ���� ���Ե� ���¿��� ���� ������ �����ϴ� ��� �߻��Ǵ� ����
		System.out.printf("�Էµ� ���ڿ��� ���̴� %d �Դϴ�.\n",msg.length());
		kb.close();
	}
}