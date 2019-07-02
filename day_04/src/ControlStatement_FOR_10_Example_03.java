
public class ControlStatement_FOR_10_Example_03 {

	public static void main(String[] args) {
		// 중첩된 구조의 반복문의 예제
		// 구구단 짝수단일때 짝수와의 곱만, 홀수단일때 홀수와의 곱만 나오게 출력

		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d단을 출력합니다.\n", i);

			for (int j = 1; j <= 9; j++) {
				
				boolean flag_even = (i % 2 == 0 && j % 2 == 0);
				boolean flag_odd = (i % 2 == 1 && j % 2 == 1);
				
				if( i%2 == j%2 )
				//if (flag_even || flag_odd)
					System.out.printf("%d x %d = %d\n", i, j, i * j);
			}

			System.out.println();
		}

	}

}
