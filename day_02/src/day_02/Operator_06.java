package day_02;

public class Operator_06 {

	public static void main(String[] args) {
		// 대입연산자
		// 우항의 값/식의 결과를 좌항에 대입하는 연산
		// 일반적으로 변수에 값을 대입할 때 사용
		// 대입연산자는 우항의 값을 좌항에 대입한 후, 값을 반환합니다.
		
		int num;
		// num 변수에 10을 대입
		num = 10;
		System.out.printf("num -> %d\n",num);

		// 10 + 7 의 결과를 num 변수에 대입
		num = 10 + 7;
		System.out.printf("num -> %d\n",num);
		
		
		// 대입연산자를 사용하여 다수개의 변수를 동일한 값으로 초기화 할 수 있다.
		int n1, n2, n3;
		n1 = n2 = n3 = 33;
		System.out.printf("n1 -> %d, n2 -> %d, n3 -> %d\n",n1,n2,n3);
		
		// 대입연산자를 사용하여 특정 값을 변수에 대입한 후 사용할 수 있다. 
		int n4;
		System.out.printf("n4 -> %d\n",n4 = 40);
		
		int n5 = 30;
		// n5 변수에 100을 곱한 값을 대입한 후, 200 이상의 값인지 확인하는 코드
		System.out.println( (n5 = n5 * 100) >= 200 );
		
		// 변형된 형태의 대입연산자
		// +=, -=, *=, /=, %=, &=, |=, <<=, >>= ...
		// 자기 자신에 대한 연산의 결과를 대입받는 경우 중복되는 변수명을 생략할 수 있는 방법
		System.out.println( (n5 *= 100) >= 200 );
		
		// 변형된 형태의 대입연산자를 사용하여 n5 변수의 값을 10 증가하는 코드
		n5 = 10;
		System.out.printf("n5 -> %d\n",n5);
		// 아래의 코드는 컴파일 된 이후 n5 = n5 + 10 과 같이 동작
		n5 += 10;
		System.out.printf("n5 -> %d\n",n5);
	}

}
