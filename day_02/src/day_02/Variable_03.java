package day_02;

public class Variable_03 {

	public static void main(String[] args) {
		// 변수의 선언 위치
		// 변수의 사용 전이라면 위치에 관계없이 변수를 생성할 수 있음
		int n1;

		System.out.println("프로그램 시작");
		// C언어와 같은 언어와 다르게 변수는 위치에 관계없이 선언할 수 있음
		int n2;

		// n3 변수가 선언되지 않은 시점이므로 아래와 같이 사용할 수 없음
		//System.out.printf"n3 = %d",n3);
		int n3 = 30;
		// n3 변수가 선언된 이후이므로 해당 변수에 접근할 수 있음
		System.out.printf("n3 = %d",n3);
		
		int n4;
		// 변수를 선언한 이후라도, 값을 대입하지 않으면 해당 변수는 사용할 수 없는 변수
		// 변수를 사용하기 위해서는 선언된 이후 반드시 값을 할당해야만 함
		// 변수의 초기화 : 변수의 생성 이후 최초로 값을 대입하는 행위
		// 변수는 생성된 이후 쓰레기값을 할당받는다.
		// 쓰레기값을 가지는 변수는 사용할 수 없기 때문에 초기화를 통해 값을 할당해야만 한다
		n4 = 10;
		System.out.printf("n3 = %d",n4);
	}

}
