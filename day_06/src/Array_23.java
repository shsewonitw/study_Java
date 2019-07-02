
public class Array_23 {

	public static void main(String[] args) {
		// 다차원 배열의 복사
		int [][] arr = { {1,2,3} , {4,5,6} };
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
			}
		}
		
		
		// 다차원 배열의 깊은 복사를 구현하는 코드
		// 1. 가장 외부의 배열을 복사
		// (참조값을 가지는 배열을 복사)
		int[][] arr_copy = arr.clone();
		// 2. 복사한 참조값의 배열을 순회하며,
		// 실제 1차원 배열을 다시한번 복사
		for(int i=0; i< arr_copy.length ; i++) {
			arr_copy[i] = arr_copy[i].clone();
		}
		
		System.out.println("==================================");
		for(int i = 0 ; i < arr_copy.length ; i++) {
			for(int j = 0 ; j < arr_copy[i].length ; j++) {
				System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
				System.out.printf("arr_copy[%d][%d] = %d\n",i,j,arr_copy[i][j]);
			}
		}
		
		// 깊은 복사를 한 다차원 배열의 경우
		// 복사된 배열(arr_copy)의 값을 수정해도
		// 원본 배열(arr)의 값은 수정되지 않습니다.
		arr_copy[0][1] = 22222;
		
		System.out.println("==================================");
		for(int i = 0 ; i < arr_copy.length ; i++) {
			for(int j = 0 ; j < arr_copy[i].length ; j++) {
				System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
				System.out.printf("arr_copy[%d][%d] = %d\n",i,j,arr_copy[i][j]);
			}
		}
	}

}
