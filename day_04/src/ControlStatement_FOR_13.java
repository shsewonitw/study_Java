
public class ControlStatement_FOR_13 {

	public static void main(String[] args) {
		// ��ø�� ������ �ݺ��������� break, continue
		// break : IF���� ������ ù��° ������ ���������� ���
		// continue : IF���� ������ ù��° ������ ���� �������� �̵��ϴ� ���


		// ��ø�� �ݺ����� �����ϱ� ���� �� jdk1.5���ķ� ��밡��
		out:
		for (int i = 1; i <= 3; i++) {
			
			in:
			for (int j = 1; j <= 3; j++) {
				
				// i �� ���� 2�̰�, j �� ���� 3�϶� �ݺ��� ����
				if(i == 2 && j == 2) { 		
					// out ������ ���������� ���
					// break out;
					
					// out ������ ������������ �̵��ϴ� ���
					// continue out;
				}
				
				System.out.printf("i -> %d, j -> %d\n",i,j);
			}
			System.out.println();
		}
	}

}
