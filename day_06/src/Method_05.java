
public class Method_05 {
	// 리턴되는 값이 존재하는 메소드의 선언
	// 리턴 값 : 메소드의 실행 종류 이후, 호출한 지점으로
	// 값을 반환하는 것
	// 메소드의 선언부에 반환하고자 하는 값의 타입을 정의할 수 있음

	// 리턴값의 타입을 지정한 메소드는 메소드의 내부에서
	// 반드시 return 키워드와 함께 반환할 값을 정의해야만 합니다.

	// 정수 한개을 매개변수로 전달받아
	// 제곱된 값을 반환하는 squar 메소드 정의
	public static int squar(int num) {
		// return 키워드
		// 메소드의 실행을 종료할 수 있는 명령
		// 메소드의 내부에서 return 키워드가 사용되면
		// 해당 위치에서 메소드의 실행이 종료됩니다.
		// 리턴값이 존재하는 메소드의 경우 return 키워드와 함께
		// 반환할 값을 정의할 수 있습니다.
		// 주의할 점 : 리턴값의 타입에 정의된 자료형으로만 반환할 수 있음
		return num * num;
	}

	public static void returnTest(int num) {
		// 특정 메소드의 실행을 중지하고 호출한 지점으로
		// 돌아가기 위한 return 키워드
		// (반환값이 없어도 사용할 수 있음)
		if (num % 2 == 1)
			return;

		System.out.println("returnTest 메소드 실행~!");
		System.out.printf("매개변수 num의 값은 %d 입니다.\n", num);
	}

	// 3개의 정수를 매개변수로 전달받아
	// 가장 큰 수를 반환하는 max 메소드를 정의하고
	// main 메소드에서 테스트하세요.
	public static int max(int n1, int n2, int n3) {
		int max = n1;
		max = n2 > max ? n2 : max;
		max = n3 > max ? n3 : max;
		return max;
	}

	// 정수형의 1차원 배열을 매개변수로 전달받아
	// 해당 배열의 모든 요소를 제곱한 배열을 반환하는 메소드
	public static int[] squar_array(int[] source) {
		int[] result = new int[source.length];
		for (int i = 0; i < source.length; i++) {
			result[i] = source[i] * source[i];
		}
		return result;
	}

	public static void main(String[] args) {

		int[] source = { 10, 20, 30 };
		// 100, 400, 900
		int[] squar_result = squar_array(source);
		for(int i = 0 ; i < squar_result.length;i++) {
			System.out.println(squar_result[i]);
		}

		int num = 13;

		// 제곱된 값을 반환받기 위해서 메소드를 호출한 후,
		// 실행의 결과를 반환받음
		// (리턴값의 타입이 선언된 메소드는
		// 실행의 결과를 호출한 지점으로 반환할 수 있습니다.)
		int num_squar = squar(num);
		System.out.printf("num_squar = %d\n", num_squar);

		returnTest(num);

		System.out.println(max(999999, 2000, 11122));
	}

}
