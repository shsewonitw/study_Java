
public class Array_12 {

	public static void main(String[] args) {
		// �迭�� ����
		int[] arr = { 50, 10, 5, 20, 7 };

		// arr �迭�� ������������ ����

		// ������ ��ġ�� �ε����� �����ϴ� �ܺ��� �ݺ���
		// �迭�� ���ۺ��� (������-1)�� ���� �ݺ�
		for (int i = 0; i < arr.length - 1; i++) {

			// ������ġ�� ���� �ε����� ����
			// ���� ������ġ�� 0�̶�� 1~���������
			// ���� ������ġ�� 3�̶�� 4~���������
			for (int j = i + 1; j < arr.length; j++) {
				// ������ġ�� ���� ���� �������� �Ǿ� �ϹǷ�
				// �񱳴�󺸴� ū ��� ���� ��ȯ�մϴ�.
				if (arr[i] < arr[j]) {
					// SWAP ����
					// �� ������ ���� ��ȯ�ϴ� ���
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d " ,arr[i]);
		}
	}

}
