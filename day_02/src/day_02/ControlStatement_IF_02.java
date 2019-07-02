package day_02;

// 제어문
//  - 실행 코드의 흐름을 제어할 수 있는 문법
// 1. 분기문
//  - 조건식의 결과에 따라서 실행문의 실행 여부를 제어하는 문법
//  - if, switch
// 2. 반복문
//  - 조건식의 결과에 따라서 실행문의 반복 여부를 제어하는 문법
//  - for, while, do ~ while
public class ControlStatement_IF_02 {

	public static void main(String[] args) {
		// if ~ else 문
		// 조건식을 기준으로 참일 경우와 거짓일 경우의 실행을 분기할 수 있는 문법
		// 조건식이 참일 경우 if 문에 포함된 실행문이 실행
		// 조건식이 거짓일 경우 else 문에 포함된 실행문이 실행

		// 형식
		// if( 조건식 - true/false의 값으로 분리되는 식 )
		// 		조건식이 참일 경우의 실행문;
		// else
		// 		조건식이 거짓일 경우의 실행문;
		int number = 10;

		//if ~ else 를 활용한 짝수/홀수 판별 예제
		if (number % 2 == 0)
			System.out.printf("짝수 입니다\n");
		else
			System.out.printf("홀수 입니다\n");

		// 주민등록번호의 7번째 자리의 정수
		int gender = 3;
		if (gender == 1 || gender == 3)
			System.out.println("남자입니다\n");
		else
			System.out.println("여자입니다\n");
	}

}
