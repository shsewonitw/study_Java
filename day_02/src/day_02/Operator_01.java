package day_02;

// 연산자
// 연산자는 자바 언어에서 사용할 수 있는 기호들의 정의
// +, -, %, >>, <<, &&, || ...

public class Operator_01 {

	public static void main(String[] args) {
		// 산술연산자
		// +, -, *, /, %
		int n1 = 10;
		int n2 = 7;
		int result;
		result = n1 + n2;
		System.out.printf("%d %c %d = %d\n", n1,'+',n2,result);

		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n", n1,'-',n2,result);
		
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n", n1,'*',n2,result);
		
		// 나누기 연산 : 정수 사이에서의 연산인 경우 정수만 반환
		result = n1 / n2;
		System.out.printf("%d %c %d = %d\n", n1,'/',n2,result);
		
		result = n1 % n2;
		System.out.printf("%d %c %d = %d\n", n1,'%',n2,result);
		
		byte b1 = 10;
		byte b2 = 7;
		// 자바에서 산술연산자는 정수 사이에서의 연산은 int가 반환
		// 아래와 같이 byte 또는 short 타입의 변수에 산술연산의 결과를 대입받는 경우 컴파일 에러가 발생
		// byte b3 = b1 + b2;
		// 강제 형변환을 통해서 산술연산의 결과를 byte 또는 short 타입의 변수로 대입할 수 있음
		byte b3 = (byte)(b1 + b2);
		
		// 연산자의 좌항 또는 우항이 실수인 경우 해당 실수의 타입을 반환
		// 정수 + float = float
		// double + 정수 = double
		// double + float = double
	}

}
