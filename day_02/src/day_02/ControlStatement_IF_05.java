package day_02;

import java.util.Scanner;

public class ControlStatement_IF_05 {

	public static void main(String[] args) {
		// 키보드 입력기능을 사용하여
		// 사용자에게 3개의 성적 점수를 입력받으세요.
		// 입력된 성적 점수를 사용하여 총점과 평균을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int score1, score2, score3;
		int sum;
		double avg;
		
		System.out.println("1번째 성적을 입력하세요 : ");
		score1 = sc.nextInt();
		
		System.out.println("2번째 성적을 입력하세요 : ");
		score2 = sc.nextInt();
		
		System.out.println("3번째 성적을 입력하세요 : ");
		score3 = sc.nextInt();
		
		sum = score1 + score2 + score3;
		avg = (double)sum/3;
		System.out.printf("총점은 %d점, 평균은 %.2f점 입니다.",sum,avg);
		
		// 키보드 입력 처리를 종료
		sc.close();
		
	}

}
