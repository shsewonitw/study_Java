package tje.util;

// �̱��� �������� ������ ��¥ ��ü ��ȯ Ŭ����
import java.util.Calendar;
// ��¥ ������ �����ϱ� ���� Ŭ����
import java.util.Date;
import java.text.ParseException;
// ��¥ ������ ���ڿ��� ó���ϱ� ���� Ŭ����
// 1. Date Ŭ������ ��ü�� ���ڿ��� ��ȯ
// 2. ���ڿ��� ����� ��¥ ������ Date Ŭ������ ��ü�� ��ȯ
import java.text.SimpleDateFormat;

public class Date_03 {
	public static void main(String[] args) throws ParseException {
		// Ư�� ��¥�� ���õ� ������ ���ڿ��� ����
		String targetDate = "2019/04/01 16:43:05";
		
	
		
		// Date Ŭ������ ��ü�� ���ڿ��� ��ȯ
		String format = "yyyy/MM/dd hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		Date date = sdf.parse(targetDate);
		
		System.out.println("Ÿ�� �ð��� " + date.toString());
	}
}
