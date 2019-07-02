import java.util.*;

public class Array_24 {

	public static void main(String[] args) {
		// 사용자에게 임의의 정수 5개를 입력받아 배열에 저장하세요.
		// 배열을 복사하여 입력된 정수를 오름차순으로 정렬한 후,
		// 원본 배열과 정렬된 배열의 값을 출력하세요.

		int[] arr = new int[5];
		int[] arr_copy = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.printf("%d번째 정수를 입력 : ", i + 1);
			arr[i] = sc.nextInt();
		}

		sc.close();

		arr_copy = arr.clone();

		int temp;
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				if(arr_copy[i] > arr_copy[j]) {
					temp = arr_copy[j];
					arr_copy[j] = arr_copy[i];
					arr_copy[i] = temp;
				}
			}
		}
		
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.printf("arr[%d] = %d\n", i , arr[i]);
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.printf("arr_copy[%d] = %d\n", i , arr_copy[i]);
		}
		
	}

}
