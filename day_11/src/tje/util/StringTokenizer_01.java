package tje.util;

// ���ڿ��� ������ �� �ִ� ����� �����ϴ� Ŭ����
import java.util.StringTokenizer;

public class StringTokenizer_01 {
	public static void main(String[] args) {
		// ; �� �������� ������ ����� ���ڿ� ����
		String subjects = "KOR;ENG;MATH";
		String scores = "100,90#95";
		
		// subjects ���ڿ� ������ ; �� �������� ������ �� �ִ� StringTokenizer ��ü�� ����
		StringTokenizer stSubjects = new StringTokenizer(subjects, ";");
		// scores ���ڿ� ������ ,�� #�� �������� ������ �� �ִ� StringTokenizer ��ü�� ����
		StringTokenizer stScores = new StringTokenizer(scores, ",#");
		
		// StringTokenizer �� ���ҵ� ���ڿ��� TOKEN���� ȣĪ�ϸ�
		// �ݺ����� ���ؼ� �� ��ū�� ������ �� ����
		// hasMoreTokens() �޼ҵ�� ���� ������ �� �ִ� ��ū�� ���������� true/false ������ ��ȯ��
		while(stSubjects.hasMoreTokens()) {
			// nextToken() �޼ҵ�� ���� ��ū�� ��ġ�� �̵��Ͽ�
			// �ش� ��ū�� ���� ��ȯ�ϴ� �޼ҵ�
			System.out.println(stSubjects.nextToken());
		}
		while(stScores.hasMoreTokens()) {
			System.out.println(stScores.nextToken());
		}
	}
}
