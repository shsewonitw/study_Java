package tje.wrapper;

public class Wrapper_01 {

	public static void main(String[] args) {
		// 래퍼 클래스
		// 자바의 기본 자료형과 1:1로 매핑되어 있는 클래스
		// 자바의 기본 자료형을 객체로 표현하기 위해서
		// 만들어진 클래스
		// byte -> Byte , short -> Short , int -> Integer
		// long -> Long , float -> Float , double -> Double
		// char -> Character , boolean -> Boolean
		
		// 래퍼클래스의 객체를 선언하여
		// 정수형 값을 저장하는 방법
		
		// 기본자료형의 데이터를 객체 형태로 처리하기 위한 클래스
		// JDK 1.4 버전까지의 사용법
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(17);
		
		System.out.printf("%d + %d = %d\n",i1.intValue(),i2.intValue(),i1.intValue()+i2.intValue());
		
		// JDK 1.5 이후부터의 사용법
		// 오토박싱, 오토언박싱
		// 기본 타입의 값을 객체 타입으로 오토 박싱을 지원
		
		// 오토 박싱 문법
		// - 기본형의 값을 래퍼 클래스 타입으로 자동 변환함
		Integer i3 = 200; // Integer i3 = new Integer(200);
		Integer i4 = 27; // Integer i4 = new Integer(27);
		// 오토 언박싱 문법
		// - 객체 타입의 값을 기본자료형 타입으로 자동 변환함
		int sum = i3 + i4; // int sum = i3.intValue() + i4.intValue(); 
		
		// 기본 자료형을 Object 타입으로 대입하는 코드
		// 오토 박싱의 활용
		Object intObj = 10; // Object intObj = new Integer(10);
	}

}