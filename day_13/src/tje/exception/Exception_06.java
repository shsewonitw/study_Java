package tje.exception;

// 예외(Exception) 처리
// 에러 : 잘못된 것, 에러가 존재하는 경우 실행될 수 없음
// 예외 : 잘못된 것, 
//    특정 상황 또는 조건이 만족되는 경우 프로그램이 종료되는 현상
// 예외는 다양한 상황에 대해서 발생하는 현상으로 모든 예외를 대처할 수 없음
// 다만, 예외가 발생한 경우 프로그램이 종료되지 않고 저장과 같은 기능을 제공
// 할 수 있어야함.
// (예외가 발생해도 프로그램이 강제종료되지 않고 사용자에게 선택권을 주어야함)

import java.util.*;

public class Exception_06 {
	public static void main(String[] args) {		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		// try 영역에서 생성된 변수는
		// try 구문이 종료된 후 접근할 수 없습니다.
		// try 구문이 정상적으로 종료한 경우 짝수/홀수를 
		// 출력하기 위해서 변수를 선언
		// try 구문내부에서 초기화하는 코드는 실행되지 않을 가능성이 있기 때문에
		// 초기화를 진행
		int num=0;
		
		try {
			// 예외가 발생할 가능성이 있는 코드
			num = kb.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException 발생하여 처리함");
			System.out.println("프로그램 종료");
			kb.close();
			return;
		}
		
		if( num % 2 == 0 )
			System.out.printf("짝수입니다.\n");
		else
			System.out.printf("홀수입니다.\n");

		System.out.println("프로그램 종료");
		kb.close();
	}
}