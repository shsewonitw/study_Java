import java.util.Scanner;

public class ControlStatement_FOR_02_Example {

	public static void main(String[] args) {
		// 사용자에게 2 개의 정수를 입력받아
		// 2개의 정수 중 작은 값부터 시작하여
		// 큰 값까지 홀수만 출력하세요
		
		int num1, num2;
		int small, big;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		
		sc.close();
		
		small = num1<num2?num1:num2;
		big = num1<num2?num2:num1;
		
		big = big %2 ==0? big-1: big;
		for( int i=small ; i<=big ; i++ ) {
			if( i%2 != 0 ) {
				System.out.printf("%d%c ",i,i!=big?',':' ');
			}
		}

	}

}                                                                                                                                                                                                                                   
