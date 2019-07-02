import java.util.*;

public class Array_13 {

	public static void main(String[] args) {
		// 사용자에게 배열의 크기를 입력받아 배열을 생성하고,
		// 각 요소에 값을 입력받아 입력된 정수의 순서대로 값을 출력하세요.

		// 출력이 종료된 후, 사용자에게 정렬 방식을 입력받으세요
		// 오름차순 : 1, 내림차순 : 2
		// 사용자가 선택한 정렬 방식으로 배열을 정렬한 후 출력하세요

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 정수를 입력하세요 : ", i + 1);
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\n선택하세요 (오름차순:1 / 내림차순:2) : ");
		int sorting_method = sc.nextInt();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				boolean flag_asc = sorting_method == 1 && arr[i] > arr[j];
				boolean flag_desc = sorting_method == 2 && arr[i] < arr[j];
				
				if (flag_asc || flag_desc) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
