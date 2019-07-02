import java.util.Scanner;

public class ControlStatement_IF_07 {

	public static void main(String[] args) {
		// 사용자로부터 3개의 성적 점수를 입력받아
		// 총점과 평균을 출력하세요.
		// 평균점수를 사용하여 성적의 평가를 출력
		// 90점 이상 -> A, 80점 이상 -> B, 70점 이상 -> C, 60점 이상 -> D, 60점 미만 -> F
		
		Scanner sc = new Scanner(System.in);
		
		int score1, score2, score3;
		int sum;
		double avg;
		
		System.out.print("1번째 성적 입력 : ");
		score1 = sc.nextInt();
		System.out.print("2번째 성적 입력 : ");
		score2 = sc.nextInt();
		System.out.print("3번째 성적 입력 : ");
		score3 = sc.nextInt();
		
		sc.close();
		
		sum = score1 + score2 + score3;
		avg = (double)sum/3;
		
		System.out.printf("총점은 : %d점, 평균은 : %.2f점\n",sum,avg);
		
		char grade;
		
		// 특정 범위를 비교하여 if 문을 처리하는 경우의 처리방법
		// 1. 이상치 데이터를 비교
		// 2. 높은 데이터(낮은 데이터) 순으로 비교를 수행
		if( avg < 0 || avg > 100)
			grade = '?';
		else if( avg >= 90 )
			grade = 'A';
		else if( avg >= 80 )
			grade = 'B';
		else if( avg >= 70 )
			grade = 'C';
		else if( avg >= 60 )
			grade = 'D';
		else
			grade = 'F';
		/*
		if( avg >= 90 && avg <= 100 )
			grade = 'A';
		else if( avg >= 80 && avg < 90 )
			grade = 'B';
		else if( avg >= 70 && avg < 80 )
			grade = 'C';
		else if( avg >= 60 && avg < 70 )
			grade = 'D';
		else
			grade = 'F';
		*/
		
		if(grade != '?')
			System.out.printf("성적 평가는 '%c' 입니다.\n", grade);
		else
			System.out.printf("(ERROR)성적 점수를 확인해주세요(%.2f)\n",avg);

	}
	
}
