package tje.util;

// ���ڿ��� ������ �� �ִ� ����� �����ϴ� Ŭ����
import java.util.StringTokenizer;

public class StringTokenizer_02 {
	public static void main(String[] args) {
		// ; �� �������� ������ ����� ���ڿ� ����
		String subjects = "KOR;ENG;MATH";
		String scores = "100,90#95";
		
		// StringTokenizer Ŭ������ ����Ͽ� ���� ���ڿ� ������
		// �Ľ��� ��, �Ʒ��� ���� ����ϼ���
		// KOR : 100��
		// ENG :  90��
		// MATH : 95��
		// TOT : 285��
		// AVG :  95��
		
		
		int TOT = 0;
		double AVG;
		StringTokenizer stSubjects = new StringTokenizer(subjects,";");
		StringTokenizer stScores = new StringTokenizer(scores,",#");
		int count = stSubjects.countTokens();
		while(stSubjects.hasMoreTokens()) {
			String sNum = stScores.nextToken();
			System.out.println(stSubjects.nextToken() + " : " + sNum + "��");
			Integer num = new Integer(sNum);
			TOT += num;
		}
		System.out.printf("TOT : %d��\n",TOT);
		System.out.printf("AVG : %.2f��\n",(double)TOT/count);
	
	}
}
