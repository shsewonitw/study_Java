package day_02;

// 기본입력(키보드) 처리하는 방법

// 키보드 입력을 처리하기 위한 선언문
import java.util.Scanner;

public class ControlStatement_IF_04 {

	public static void main(String[] args) {
		// 키보드 입력을 위한 변수를 선언
		// Scanner 의 변수를 사용
		Scanner sc = new Scanner(System.in);

		int intNumber;
		System.out.print("정수를 입력하세요 : ");
		// Scanner 클래스의 nextInt 메소드
		// 입력된 정수를 int 타입으로 반환하는 메소드
		intNumber = sc.nextInt();
		System.out.printf("intNumber -> %d\n",intNumber);
		
		
		double doubleNumber;
		System.out.print("실수를 입력하세요 : ");
		// Scanner 클래스의 nextDouble 메소드
		// 입력된 정수를 double 타입으로 반환하는 메소드
		doubleNumber = sc.nextDouble();
		System.out.printf("doubleNumber -> %.3f\n",doubleNumber);
		
		
		String strName;
		System.out.print("이름을 입력하세요 : ");
		// Scanner 클래스의 next 메소드
		// 입력된 문자열을 String 타입으로 반환하는 메소드
		strName = sc.next();
		System.out.printf("strName -> %s\n",strName);
		
		
		char chGender;
		System.out.print("성별을 입력하세요(M/W) : ");
		// 문자를 입력받는 방법
		// Scanner 클래스의 next 메소드를 사용해서 문자열을 입력받는다.
		// 그리고 입력된 문자열에서 가장 앞에 한 글자를 추출하여 변수에 대입
		// 입력된 문자열을 String 타입으로 반환하는 메소드
		// String 클래스의 charAt 메소드
		// 매개변수로 전달된 위치의 문자값을 반환
		chGender = sc.next().charAt(0);
		System.out.printf("%s",chGender=='M'?"남성":"여성");
	}
}
