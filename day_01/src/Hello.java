//주석을 작성하는 방법
//주석:설명문
//프로그램을 구성하는 실행문과 별도로 설명을 작성하는 경우 사용
//여러줄의 주석을 작성 -> /* 내용 */

// 모든 자바프로그램 소스코드에서 자동으로 추가되는 코드
// 자바의 기본 패키지를 로딩하는 실행 코드
import java.lang.*;

//모든 자바 프로그램의 소스 코드는 클래스 내부에 정의

// Hello 클래스를 정의하는 코드
// class 클래스명 -> class Hello
// public class -> 파일명과 동일한 이름의 클래스를 선언하는 경우
// 반드시 public class 로 선언해야 한다. (대소문자를 구분)

// 클래스의 이름은 대문자로 시작
// 만약 두 단어 이상의 조합으로 클래스 이름을 작성하는 경우
// 각 단어의 시작도 대문자로 작성

// Java 언어에서는 특정 영역을 지정하기 위해서 중괄호를 사용합니다.
public class Hello { // Hello 클래스의 시작 지점
	// 프로그램의 시작 지점(진입점)인 main 메소드의 선언
	// 메소드 : 기능을 정의하는 단위, 일반적인 용어로 함수라고도 함
	// 메소드의 특징 : 메소드명()
	public static void main(String[] args) { // 프로그램의 시작 지점
		// System 클래스
		// 기본입력(키보드 입력), 기본출력(모니터 출력) 객체를 제공하는 클래스

		// Dot(.) 연산자
		// 좌항의 요소에 접근하는 연산자
		
		// System.out : 기본출력 객체
		// 모니터에 텍스트를 출력할 수 있는 기능을 제공
		
		// System.out.println 메소드 : 출력 기능을 제공하는 메소드
		// 자동개행 지원하는 메소드
		
		// "" : 문자열을 의미
		// "" 내부에 정의된 문자들은 데이터로 취급하게 됨
		// Java의 식별자들을 포함할 수 있음
		
		// 자바의 모든 실행코드들은 반드시 ; 으로 마무리 해야함.
		// ; 은 실행문의 종료를 의미
		System.out.println("Hello Java~!");
		System.out.println("Hello Java~!");
	} // 프로그램의 종료 지점
	
} // Hello 클래스의 종료 지점