
public class Array_17 {

	public static void main(String[] args) {
		// 2���� �迭�� �ݺ���
		// 2���� �迭�� ��� ���� ��Ÿ����
		// 2���� �ε����� ����ϴ� �迭
		// 2���� �迭�� �� ��ҿ� �����ϴ� �ݺ�����
		// ��ø�� ���¸� ����մϴ�.
		// �Ϲ������� �ܺ��� �ݺ����� 2���� �迭�� ���� ����
		// ������ �ݺ����� ���� �����մϴ�.
		
		int [][] arr = new int[2][5];

		int value = 10;
		// ���� �ε����� �����ϴ� �ݺ���
		for(int i = 0 ; i < 2 ; i++) {
			
			// ���� �ε����� �����ϴ� �ݺ���
			for(int j = 0 ; j < 5 ; j++) {
				arr[i][j] = value++;
				System.out.printf("arr[%d][%d] -> %d\n",i,j,arr[i][j]);
			}
			System.out.println();
		}
	}

}
