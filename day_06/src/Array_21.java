
public class Array_21 {

	public static void main(String[] args) {
		// �迭�� ����
		// 1. ���� ����
		// - �迭�� ���¸� ����
		// - ���� �������� ���簡 �Ͼ�� ����
		// 2. ���� ����
		// - �迭�� ���� �� ���� �������� ����

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr[%d] = %d\n", i, arr[i]);

		// clone �޼ҵ带 ����� �迭�� ����
		// �迭��.clone()
		// �ش� �迭������ �����ϰ� �ִ� �迭�� �����Ͽ�
		// ����� ������ ���۷���(����) ���� ��ȯ�ϴ� �޼ҵ�
		int[] arr_copy = arr.clone();

		System.out.println("========================");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
			System.out.printf("arr_copy[%d] = %d\n", i, arr_copy[i]);
		}

		arr_copy[2] = 300;

		// ������ �迭�� ��� ���� ������ �� ��,
		// ���� �����Ϳ� �Բ� ���
		// 1���� �迭�� ��� �������簡 �����Ǳ� ������
		// arr_copy�� ��� ���� �����Ͽ���, arr�� �����Ϳ���
		// ������ ����(���� �и��� ����)
		System.out.println("========================");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
			System.out.printf("arr_copy[%d] = %d\n", i, arr_copy[i]);
		}
	}

}
