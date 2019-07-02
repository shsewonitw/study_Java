
public class ControlStatement_FOR_10_Example_02 {

	public static void main(String[] args) {
		// 중첩된 구조의 반복문의 예제
		// 구구단 짝수인 단만 출력

		for (int i = 2; i <= 9; i++) {

			// continue를 사용하여
			// 홀수 단인 경우 다음 반복으로 이동함
			if (i % 2 == 1)
				continue;

			System.out.printf("%d단을 출력합니다.\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}

	}

}
