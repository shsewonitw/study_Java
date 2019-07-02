
public class Array_22 {

	public static void main(String[] args) {
		// ������ �迭�� ����
		int [][] arr = { {1,2,3} , {4,5,6} };
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
			}
		}
		
		
		// �������迭(�������迭)�� clone �޼ҵ��� �����
		// ���� ������ �迭�� �����ϰ� �ִ� 2���� �迭���� �����Ѵ�.
		// (2���� �迭�� ���ο� �ִ� 1���� �迭�� �������� ����)
		// (���¸� ����)
		int[][] arr_copy = arr.clone();
		
		System.out.println("==================================");
		for(int i = 0 ; i < arr_copy.length ; i++) {
			for(int j = 0 ; j < arr_copy[i].length ; j++) {
				System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
				System.out.printf("arr_copy[%d][%d] = %d\n",i,j,arr_copy[i][j]);
			}
		}
		
		// ������ 2���� ������ ����Ͽ� Ư�� ����� ���� ����
		// ���� ���縦 ���� �迭�� ����
		// (���� 1���� �迭�� �и����� ���� ����)
		// arr �迭������ �����ϰ� �ִ� 1���� �迭�� ���� ����
		// ���� ����� ����� arr_copy�� ���� �����ϰ� �Ǹ�
		// arr �迭 �����ε� ������ ���� �����ϰ� �˴ϴ�.
		arr_copy[0][1] = 22222;
		
		System.out.println("==================================");
		for(int i = 0 ; i < arr_copy.length ; i++) {
			for(int j = 0 ; j < arr_copy[i].length ; j++) {
				System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
				System.out.printf("arr_copy[%d][%d] = %d\n",i,j,arr_copy[i][j]);
			}
		}
	}

}
