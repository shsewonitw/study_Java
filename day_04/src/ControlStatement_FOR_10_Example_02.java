
public class ControlStatement_FOR_10_Example_02 {

	public static void main(String[] args) {
		// ��ø�� ������ �ݺ����� ����
		// ������ ¦���� �ܸ� ���

		for (int i = 2; i <= 9; i++) {

			// continue�� ����Ͽ�
			// Ȧ�� ���� ��� ���� �ݺ����� �̵���
			if (i % 2 == 1)
				continue;

			System.out.printf("%d���� ����մϴ�.\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}

	}

}
