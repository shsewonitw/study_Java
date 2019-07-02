
public class Variable_01 {

	public static void main(String[] args) {
		// 변수 : 임의의 메모리( RAM ) 공간에 이름을 붙여 관리하는 방법
		//      프로그램이 실행되고있는 동안 값을 저장하는 방법
		
		// 변수를 선언하는 방법
		// 자료형 변수명;
		// 자료형 : 데이터의 타입
		//   - 정수 : byte(1) , short(2) , int(4 , 기본형) , long(8)
		//   - 실수 : float(4) , double(8 , 기본형)
		//   - 문자 : char(2 , 유니코드를 지원)
		//   - 진리형 : boolean(1 , true , false 값을 저장)
		//   - 문자열 : String 클래스를 사용
		
		// 4바이트 크기의 정수를 저장할 수 있는 변수 num을 선언
		// 변수명의 첫글자를 소문자로 작성하는 것이 암묵적인 규칙
		// 여러 단어로 구성된 경우 첫단어의 첫글자는 소문자, 두번째 단어부터는 첫글자를 대문자로 작성
		int num;
		
		// 변수에 값을 할당하기 위해서 대입 연산자(=)을 사용
		num = 101;
		
		//변수의 값을 추출하려는 경우 변수명을 사용가능
		System.out.printf("num = %d",num);

	}

}
