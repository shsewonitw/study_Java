// +,- 기능을 가지고 있는 PlusMinusCalculator 클래스를 선언한 후
// main 메소드에서 테스트하세요.
// 1번째 정수를 입력 : 10
// 2번째 정수를 입력 : 5
// 부호를 입력하세요 : +
// 10 + 5 = 15

import java.util.Scanner;

class PlusMinusCalculator {
	
	public void plus(int n1, int n2) {
		System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
	}
	
	public void minus(int n1, int n2) {
		System.out.printf("%d - %d = %d\n",n1,n2,n1-n2);
	}
}

// PlusMinusCalculator 클래스를 상속받는 Calculator 클래스를 선언하세요.
// Calculator 클래스는 사칙연산과 나머지 연산을 제공할 수 있도록 구현하세요.

class Calculator extends PlusMinusCalculator {
	
	public void multi(int n1, int n2) {
		System.out.printf("%d * %d = %d\n",n1,n2,n1*n2);
	}
	
	public void div(int n1, int n2) {
		System.out.printf("%d / %d = %.2f\n",n1,n2,(double)n1/n2);
	}
	
	public void mod(int n1, int n2) {
		System.out.printf("%d %% %d = %d\n",n1,n2,n1%n2);
	}
}

public class Class_33_Extends {

	public static void main(String[] args) {
		// PlusMinusCalculator pmc = new PlusMinusCalculator();
		Calculator cal = new Calculator();
		// 입력과정...
		int n1, n2;
		char c;
		// 부호 입력과정...
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력: ");
		n1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력: ");
		n2 = sc.nextInt();
		System.out.print("부호를 입력: ");
		c = sc.next().charAt(0);
		
		// 부호의 값에 따라서 
		if(c=='+')
			cal.plus(n1,n2);
		else if(c=='-')
			cal.minus(n1,n2);
		else if(c=='*')
			cal.multi(n1, n2);
		else if(c=='/')
			cal.div(n1, n2);
		else if(c=='%')
			cal.mod(n1, n2);
		else
			System.out.println("부호를 잘못입력하셨습니다.");
	}

}
