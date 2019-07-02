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

public class Exception_02 {
	public static void main(String[] args) {		
		// 예외가 발생할 가능성이 있는 코드
		Scanner kb = new Scanner(System.in);
		
		System.out.print("메세지를 입력하세요(5글자 이상) : ");
		String msg = kb.next();
		
		if(msg.length() < 5)
			msg = null;
		
		// java.lang.NullPointerException 발생 가능성이 있음
		// 레퍼런스 변수에 null 값이 대입된 상태에서 접근 연산을 실행하는 경우 발생되는 예외
		System.out.printf("입력된 문자열의 길이는 %d 입니다.\n",msg.length());
		kb.close();
	}
}