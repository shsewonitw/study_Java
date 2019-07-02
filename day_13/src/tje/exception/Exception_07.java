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

public class Exception_07 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int num = 0;

		// 올바르게 정수가 입력될 때까지 값의 입력을 요청한 후,
		// 짝수 홀수 여부를 출력하세요.

		while (true) {
			try {
				// 예외가 발생할 가능성이 있는 코드
				System.out.print("정수를 입력하세요 : ");
				num = kb.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("InputMismatchException 발생하여 처리함");
				kb.next();
				continue;
			}
			break;
		}

		if (num % 2 == 0)
			System.out.printf("짝수입니다.\n");
		else
			System.out.printf("홀수입니다.\n");

		System.out.println("프로그램 종료");
		kb.close();
	}
}