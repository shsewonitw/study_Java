import java.util.*;
public class ControlStatement_FOR_10_Example_05 {

	public static void main(String[] args) {
		// 중첩된 반복문을 활용하여 학생의 성적을 
		// 처리하는 프로그램을 작성하세요
		// <예시>
		// 학생수를 입력하세요 : 3
		// 과목수를 입력하세요 : 3
		// 1번째 학생의 1번째 성적을 입력하세요 : 100
		// 1번째 학생의 2번째 성적을 입력하세요 : 100
		// 1번째 학생의 3번째 성적을 입력하세요 : 100
		// 1번째 학생의 총점은 300 점, 평균은 100.00 점 입니다. 
		// 2번째 학생의 1번째 성적을 입력하세요 : 90
		// 2번째 학생의 2번째 성적을 입력하세요 : 90
		// 2번째 학생의 3번째 성적을 입력하세요 : 90
		// 2번째 학생의 총점은 270 점, 평균은 90.00 점 입니다.
		// ... 

		Scanner sc = new Scanner(System.in);
		
		int student, subject, sum = 0;
		double avg;
		System.out.print("학생 수를 입력하세요 : ");
		student = sc.nextInt();
		
		System.out.print("과목 수를 입력하세요 : ");
		subject = sc.nextInt();
		
		for(int i=1 ; i<=student ; i++) {
			for(int j=1 ; j<=subject ; j++) {
				System.out.printf("%d번째 학생의 %d번째 성적을 입력하세요 : ",i,j);
				sum += sc.nextInt();
			}
			avg = (double)sum / subject;
			System.out.printf("%d번째 학생의 총점은 %d점, 평균은 %.2f점 입니다.\n\n",i,sum,avg);
			sum = 0;
		}
		sc.close();
	}

}
