package day_02;

public class Operator_02 {

	public static void main(String[] args) {
		// 관계연산자
		// 좌항과 우항의 크기를 비교하여 true/false 값을 반환하는 연산자
		// > , < , >= , <= , == , !=
		// 관계식의 정의가 올바른 경우 true가 반환되고
		// 틀린 경우 false 가 반환됨
		int n1 = 10;
		int n2 = 5;
		boolean result;
		
		result = n1 > n2;
		// printf 메소드의 %b 는 boolean 타입의 값을 출력함
		System.out.printf("%d %s %d = %b\n",n1,">",n2,result);
		
		result = n1 < n2;
		System.out.printf("%d %s %d = %b\n",n1,"<",n2,result);
		
		result = n1 >= n2;
		System.out.printf("%d %s %d = %b\n",n1,">=",n2,result);
		
		result = n1 <= n2;
		System.out.printf("%d %s %d = %b\n",n1,"<=",n2,result);
		
		result = n1 == n2;
		System.out.printf("%d %s %d = %b\n",n1,"==",n2,result);
		
		result = n1 != n2;
		System.out.printf("%d %s %d = %b\n",n1,"!=",n2,result);
	}

}
