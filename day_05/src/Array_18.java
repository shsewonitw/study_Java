import java.util.Scanner;

public class Array_18 {

	public static void main(String[] args) {
		// 3명의 학생 성적을 처리할 수 있는 프로그램을 작성하세요.
		// 성적은 5과목이며, 사용자가 입력한 값으로 저아합니다.
		// 모든 학생의 입력이 끝난 후에는 각 학생의 총점과 평균을 출력하세요.
		// (2차원 배열을 사용하세요!)

		Scanner sc = new Scanner(System.in);

		
		int[][] scores = new int[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d번 학생의 %d번째 과목 성적 입력 : ",i+1,j+1);
				scores[i][j] = sc.nextInt();
			
			}
		}
		
		int sum=0;
		double avg;
		for(int i = 0;i<3;i++) {
			for(int j =0;j<5;j++) {
				sum += scores[i][j];
			}
			avg = (double)sum/5;
			System.out.printf("\n%d번째 학생의 총점: %d, 평균: %.2f\n",i+1,sum,avg);
			sum=0;
		}

	}

}


