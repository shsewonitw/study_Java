
public class PrintMethods {

	public static void main(String[] args) {
		// 기본출력 객체의 출력 메소드
		// 1. print 메소드
		//   - 매개변수를 화면에 출력하고, 자동으로 개행하지 않는 메소드
		// 매개변수 : 메소드의 소괄호 내부에 정의된 값
		System.out.print("Hello ");
		System.out.print("Java~!");
		
		// 강제로 개행을 하고자 하는 경우 개행문자(\n)를 사용
		System.out.print("Hello \n");
		System.out.print("Java~!\n");
		
		// sysout -> ctrl+space = System.out.println();
		
		// 2. println 메소드
		//   - 매개변수를 화면에 출력하고, 자동으로 개행하는 메소드
		//   - 매개변수를 사용하지 않는 경우 개행만 실행됩니다.
		System.out.println();
		System.out.println("Hello");
		System.out.println("Java~!");
		
		// 3. printf 메소드
		//   - 매개변수로 전달된 문자열을 사용하여
		//     형식에 맞춰 출력할 수 있는 메소드
		//   - 자동개행 지원 X
		//   - printf("형식문자열",값1, ... , 값N);
		//   - 형식문자열 내부에 사용할 수 있는 서식
		//     %d : 10진수의 정수값을 출력할 수 있는 서식
		//     %f : 부동소수점 값을 출력할 수 있는 서식
		//     %s : 문자열을 출력할 수 있는 서식
		//     %c : 하나의 문자 값을 출력할 수 있는 서식
		System.out.printf("%d + %d = %d\n", 10,7,10+7);
		System.out.printf("제 이름은 %s 입니다.\n", "신석우");
		System.out.printf("원주율의 값은 %f 입니다.\n", 3.14);
		// %c를 사용하여 문자를 출력하는 경우 작음따옴표('')를 사용
		System.out.printf("오늘은 %c 요일입니다.\n",'월');
	}

}
