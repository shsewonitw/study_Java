import java.util.*;

public class Array_24 {

	public static void main(String[] args) {
		// ����ڿ��� ������ ���� 5���� �Է¹޾� �迭�� �����ϼ���.
		// �迭�� �����Ͽ� �Էµ� ������ ������������ ������ ��,
		// ���� �迭�� ���ĵ� �迭�� ���� ����ϼ���.

		int[] arr = new int[5];
		int[] arr_copy = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.printf("%d��° ������ �Է� : ", i + 1);
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
