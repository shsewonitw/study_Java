
public class ControlStatement_FOR_11 {

	public static void main(String[] args) {
		// ��ø�� ������ �ݺ��������� break, continue
		// break : IF���� ������ ù��° ������ ���������� ���
		// continue : IF���� ������ ù��° ������ ���� �������� �̵��ϴ� ���


		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				
				// i �� ���� 2�̰�, j �� ���� 3�϶� �ݺ��� ����
				if(i == 2 && j == 3) 
					// �Ʒ��� break�� ������ �ݺ����� ���������� ���
					// ��ü �ݺ����� ������ �� ����..
					break;
				
				
				System.out.printf("i -> %d, j -> %d\n",i,j);
			}
			System.out.println();
		}
	}

}
