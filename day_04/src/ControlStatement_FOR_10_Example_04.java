
public class ControlStatement_FOR_10_Example_04 {

	public static void main(String[] args) {
		// ��ø�� ������ �ݺ����� ����
		// 2��                   3��                 .... 
		// 2 * 1 = 2   3 * 1 = 3
		// 2 * 2 = 4   3 * 2 = 6
		// ....
/*
		for(int i=2;i<=9;i++)
			System.out.printf("%d��                     ",i);
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %-2d   ", j, i, j * i);
			}
			System.out.println();
		}
*/
		
		for (int i = 0; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (i == 0) {
					// ������ ����� ���
					System.out.printf("%-15s\t", j + " ��");
				} else {
					System.out.printf("%d * %d = %2d\t", j, i, j * i);
				}
			}
			System.out.println();
		}
	}

}
