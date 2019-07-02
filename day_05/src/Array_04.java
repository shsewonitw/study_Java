
public class Array_04 {

	public static void main(String[] args) {
		// 배열 (ARRAY)
		// - 동일한 자료형의 연속된 집합
		// - 동일한 타입의 데이터를 다수개 저장할 수 있는 방법을 제공

		// 1. 다수개의 변수들을 손쉽게 선언하여 사용할 수 있음
		// 2. 다수개의 변수들을 하나의 변수명으로 제어할 수 있음
		
		// 배열의 생성방법
		// 자료형 [] 배열변수명 = new 자료형[개수];
		
		// int 타입의 배열 변수를 선언한 후, 초기화를 진행하는 코드
		// 배열변수는 레퍼런스 변수이므로 null 으로 초기화할 수 있음
		int [] arr = null;
		
		// 배열변수는 레퍼런스 변수이므로 
		// HEAP 메모리에 배열을 생성한 후
		// 해당 참조값을 전달받을 수 있습니다. 
		
		// new 연산자 : 동적 메모리를 HEAP메모리에 생성한 후
		// 생선된 위치의 참조값을 반환하는 연산자
		arr = new int[3];
		
		// 배열의 각 요소에 접근하는 방법
		// 인덱스 연산 : 생성된 배열의 각 요소는 숫자값을 사용하여 접근
		// 시작 값 0, 종료값은 배열의 크기 -1이 됩니다.
		// 배열변수명[인덱스값]
		System.out.printf("arr[0] -> %d\n",arr[0]);
		System.out.printf("arr[1] -> %d\n",arr[1]);
		System.out.printf("arr[2] -> %d\n",arr[2]);
		
		// 배열의 인덱스 연산 시 주의사항
		// 범위 벗어난 접근은 허용하지 않음
		// ( ArrayIndexOutOfBoundsException 에러 발생 )
		// System.out.printf("arr[2] -> %d\n",arr[3]);
		
		// 배열의 각 요소에 값을 대입하는 방법
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.printf("arr[0] -> %d\n",arr[0]);
		System.out.printf("arr[1] -> %d\n",arr[1]);
		System.out.printf("arr[2] -> %d\n",arr[2]);
		
	}

}
