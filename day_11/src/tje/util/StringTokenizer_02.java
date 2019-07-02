package tje.util;

// 문자열을 분할할 수 있는 기능을 제공하는 클래스
import java.util.StringTokenizer;

public class StringTokenizer_02 {
	public static void main(String[] args) {
		// ; 을 기준으로 정보가 저장된 문자열 변수
		String subjects = "KOR;ENG;MATH";
		String scores = "100,90#95";
		
		// StringTokenizer 클래스를 사용하여 위의 문자열 변수를
		// 파싱한 후, 아래와 같이 출력하세요
		// KOR : 100점
		// ENG :  90점
		// MATH : 95점
		// TOT : 285점
		// AVG :  95점
		
		
		int TOT = 0;
		double AVG;
		StringTokenizer stSubjects = new StringTokenizer(subjects,";");
		StringTokenizer stScores = new StringTokenizer(scores,",#");
		int count = stSubjects.countTokens();
		while(stSubjects.hasMoreTokens()) {
			String sNum = stScores.nextToken();
			System.out.println(stSubjects.nextToken() + " : " + sNum + "점");
			Integer num = new Integer(sNum);
			TOT += num;
		}
		System.out.printf("TOT : %d점\n",TOT);
		System.out.printf("AVG : %.2f점\n",(double)TOT/count);
	
	}
}
