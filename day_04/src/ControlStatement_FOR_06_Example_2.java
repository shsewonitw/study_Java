import java.util.Scanner;

public class ControlStatement_FOR_06_Example_2 {

	public static void main(String[] args) {
		// 사용자에게 정수 한개를 입력받습니다.
		// - 정수는 1000 이상의 값을 입력 받아야만 합니다.
		// - 만약 1000 미만의 값을 입력하는 경우 다시 입력 받습니다.

		Scanner sc = new Scanner(System.in);
		int num;
		for (;;) {
			System.out.print("1000 이상의 정수를 입력하세요: ");
			num = sc.nextInt();
			if (num >= 1000)
				break;
		}

		// 1000이상의 값이 올바르게 입력된 경우
		// 1에서 입력된 값까지의 3의 배수들의 합계를 계산합니다.
		// 그리고 합계에 사용된 3의 배수의 개수를 출력하세요.
		int tot = 0, count = 0;
		for (int i = 1; i <= num; i++) {
			if(i % 3 == 0) {
				tot += i;
				count++;
			}
		}
		
		System.out.printf("1에서 %d까지의 3의 배수들의 합계는 %d\n",num,tot);
		System.out.printf("1에서 %d까지의 3의 배수의 개수는 %d",num,count);
	}

}
