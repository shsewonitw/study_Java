import java.util.Scanner;

public class ControlStatement_FOR_04_Example {

	public static void main(String[] args) {
		// 시자용자에게 3개의 정수를 입력받아
		// 입력된 정수의 합계, 평균, 최대값, 최소값을 출력하세요

		Scanner sc = new Scanner(System.in);
		
		int sum = 0, min = 0, max = 0;
		double avg;

		for (int i = 1; i <= 3; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			sum += num;
			
			
			// 최대값과 최소값을 구하기 위해서는
			// 입력되는 값 중 최초로 들어온 값으로
			// 초기화를 진행해야 한다.
			if (i == 1) {
				max = min = num;
			} else {
				if (num > max)
					max = num;

				if (min > num)
					min = num;
			}
		}

		sc.close();
		avg = (double) sum / 3;

		System.out.printf("합계: %d, 평균: %.2f, 최대값: %d, 최소값: %d\n", sum, avg, max, min);
	}

}
