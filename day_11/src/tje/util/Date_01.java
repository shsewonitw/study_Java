package tje.util;

// �̱��� �������� ������ ��¥ ��ü ��ȯ Ŭ����
import java.util.Calendar;
// ��¥ ������ �����ϱ� ���� Ŭ����
import java.util.Date;

public class Date_01 {
	public static void main(String[] args) {
		// ���� �ð��� ��¥ ������ ó���ϴ� ���
		// java.util.Calendar�� ���� ���� �ð��� ���õ�
		// Date ��ü�� ��ȯ�޾� ó���� �� ����
		
		// ���� �ð� ���� ����
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();
		System.out.println("���� �ð��� " + now.toString());
	}
}
