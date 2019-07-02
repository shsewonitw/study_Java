import java.util.*;

public class Method_02_Ex {

	public static void gugudan_one(int num) {
		System.out.printf("\n%d단\n", num);
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d * %d = %d\n", num, j, num * j);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 정수 한개를 매개변수로 전달받아
		// 해당 정수의 구구단을 출력할 수 있는 메소드를 정의하세요
		// (메소드명 : gugudan_one)
		// 사용자에게 정수를 입력받아 앞서 정의한 gugudan_one 메소드를 사용하여 해당 정수의 구구단을 출력

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9 정수를 입력 : ");
		num = sc.nextInt();
		gugudan_one(num);
	}

}
