
public class Array_05 {

	public static void main(String[] args) {
		// �迭 ������ ����� �������
		
		// 1. �迭 ������ ������ ��, ���� �迭 ������ �Ҵ�
		int[] arr_1;
		arr_1 = new int[5];
		
		// 2. �迭 ������ ����� �迭�� ������ ���ÿ� ����
		int[] arr_2 = new int[5];
		
		// 3. �迭�� ������ ������ �ʱ�ȭ�Ͽ� �����ϴ� ���
		// �Ʒ��� �ڵ�� 5���� �迭�� ������ �� 
		// �� ��Ҹ� 10,20,30,40,50���� �ʱ�ȭ �ϴ� �ڵ�
		int[] arr_3 = new int[] {10,20,30,40,50};
		System.out.printf("arr_3[0] = %d\n",arr_3[0]);
		System.out.printf("arr_3[4] = %d\n",arr_3[4]);

		int[] arr_4 = {10,20,30,40,50};
		System.out.printf("arr_4[1] = %d\n",arr_4[1]);
		System.out.printf("arr_4[2] = %d\n",arr_4[2]);
	}

}
