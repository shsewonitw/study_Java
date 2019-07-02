package day_02;

public class Variable_02 {

	public static void main(String[] args) {
		// 변수를 선언한 후 사용하는 방법
		// 1. 변수를 선언한 후 , 값을 할당
		int n1;
		n1 = 10;
		n1 = 100;
		System.out.printf("n1 = %d",n1);
		
		// 2. 변수의 선언과 동시에 값을 할당
		int n2 = 20;
		System.out.printf("n2 = %d",n2);		
		
		// 3. 다수개의 변수를 동시에 선언하는 방법
		// 동일한 자료형의 변수를 다수개 선언할 수 있음
		int n3, n4, n5;
		
		// 4. 다수개의 변수를 선언하면서 값을 할당하는 방법
		int n6 = 60 , n7 = 70 , n8 = 80;
		
		// 5. 다수개의 변수를 선언할 때 일부분의 변수만 초기화가 가능
		int n9 = 90, n10 , n11 = 110;
		

	}

}
