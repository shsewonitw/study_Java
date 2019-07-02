import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("score[%d]> ", i);
					scores[i] = sc.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("score[%d]: %d\n", i, scores[i]);
				}
			} else if (selectNo == 4) {
				int sum = 0, max = 0;
				double avg;
				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
					if(scores[i]>max) {
						max = scores[i];
					}
				}
				avg = (double)sum/studentNum;
				System.out.printf("최고 점수: %d\n평균 점수: %.2f\n",max,avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}

}
