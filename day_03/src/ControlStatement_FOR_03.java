
public class ControlStatement_FOR_03 {

	public static void main(String[] args) {
		// 반복문에서 선언된 변수의 사용 시 주의사항
		// 특정 영역에서 선언된 변수는 해당 영역이 종료되면 소멸되는 변수
		// (특정 영역에서 선언된 변수는 해당 영역에서만 사용할 수 있음)

		// 일반 변수는 동일한 이름으로 다수개의 변수를 선언할 수 없다.
		int num = 10;
		// int num = 20;
		
		// for 문에서 생성된 변수는 for 문이 종료되는 순간 메모리에서 해제됨
		for( int i=1 ; i<=3 ; i++)
			System.out.printf("i = %d\n",i);
		
		// 반복문에서 생선된 변수는 반복문이 종료되면 메모리에서 해제되기 때문에 반복문의 외부에서는 접근할 수 없는 변수입니다.
//		System.out.println(i);
		
		// for 문을 사용할 때 동일한 이름의 기준변수를 사용할 수 있습니다.
		for( int i=1 ; i<=3 ; i++)
			System.out.printf("i = %d\n",i);
	}

}
