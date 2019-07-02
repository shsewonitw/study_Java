
public class ControlStatement_FOR_10_Example {

	public static void main(String[] args) {
		// 중첩된 구조의 반복문의 예제
		// 구구단 출력 보기좋게

		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d단을 출력합니다.\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}

	}

}
