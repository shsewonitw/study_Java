package day_02;

public class Operator_05 {

	public static void main(String[] args) {
		// 증가 / 감소 연산자 ( 후위 / 전위 )
		// ++ / --
		// 증가 / 감소 연산자는 선언되는 위치에 따라서 증가 / 감소 시키는 시점이 변경됨.
		// 변수명의 앞에 사용되는 경우를 전위
		// 변수명의 뒤에 사용되는 경우를 후위

		// 후위 증가/감소 연산자는 연산자의 실행 시점을 1번 늦게 실행합니다.
		// 아래의 코드는 n2 변수에 n1의 값을 대입한 후, n1의 값을 나중에 증가시킴
		int n1 = 10;
		int n2 = n1++;
		System.out.printf("n1 -> %d , n2 -> %d\n",n1,n2);
		
		int n3 = 30;
		System.out.printf("n3 -> %d\n",n3++);
		System.out.printf("n3 -> %d\n",n3);
		
		
		// 전위 증가/감소 연산자는 즉시 실행합니다.
		int n4 = 10;
		int n5 = ++n4;
		System.out.printf("n4 -> %d, n5 -> %d\n",n4,n5);
		
		int temp = 10;
		System.out.printf("%d %d %d %d %d\n",temp++,++temp,temp--,++temp,temp++);
	}

}
