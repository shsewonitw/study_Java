import java.util.*;

public class Array_13 {

	public static void main(String[] args) {
		// ����ڿ��� �迭�� ũ�⸦ �Է¹޾� �迭�� �����ϰ�,
		// �� ��ҿ� ���� �Է¹޾� �Էµ� ������ ������� ���� ����ϼ���.

		// ����� ����� ��, ����ڿ��� ���� ����� �Է¹�������
		// �������� : 1, �������� : 2
		// ����ڰ� ������ ���� ������� �迭�� ������ �� ����ϼ���

		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d��° ������ �Է��ϼ��� : ", i + 1);
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.print("\n�����ϼ��� (��������:1 / ��������:2) : ");
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
