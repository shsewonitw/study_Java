
public class Array_20 {

	public static void main(String[] args) {
		// ���� �ٸ� ũ���� 1���� �迭�� �����ϴ� 2���� �迭
		// �ڹٿ��� ���Ǵ� ������ �迭�� ���� �ٸ� ũ����
		// ���� �迭�� ������ �� �ֽ��ϴ�.

		// 2���� �迭 ���� ����
		// - 1���� �迭�� �����ϴ� �迭
		int[][] arr;

		// 2���� �迭 ���� arr�� 1���� �迭��
		// 3�� ������ �� �ִ� �迭 ������ �Ҵ�
		arr = new int[3][];

		// 1���� �迭�� �����Ͽ� arr�� �Ҵ��ϴ� �ڵ�
		arr[0] = new int[5];
		arr[1] = new int[3];
		arr[2] = new int[2];

		int value = 100;

		// 2���� �迭�� ��� ��Ҹ� ��ȸ�ϴ� �ݺ����� ����
		for (int i = 0; i < arr.length; i++) {

			// ������ 1���� �迭�� ��� ��Ҹ� ��ȸ�ϴ� �ݺ����� ����
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}
			System.out.println();
		}

	}

}
