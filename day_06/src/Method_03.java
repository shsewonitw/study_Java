
public class Method_03 {

	// Call By Value 방식의 메소드 호출
	// 메소드를 호출할 때 전달하는 매개변수가 값인 경우을 의미(int, float, double)
	// 아래의 setNum 메소드를 실행하기 위해
	// main 메소드의 num 변수가 가진 10을 넘겨주고, setNum 메소드에서
	// 해당 값을 777으로 수정했지만, main 메소드 num 변수의 값을 변경되지 않습니다.
	// 값만을 전달하는 메소드 호출이었기 때문에...(STACK 메모리의 구조를 참고)
	
	// 1. 메소드의 매개변수는 지역변수입니다.
	// 2. 서로다른 메소드에서는 동일한 이름의 변수를 생성하는 것이 가능
	
	public static void setNum(int num) {
		num = 777;
		System.out.printf("(setNum) num = %d\n",num);
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		System.out.printf("(main) num = %d\n",num);
		setNum(num);
		System.out.printf("(main) num = %d\n",num);
		System.out.println("프로그램 종료");
	}

}
