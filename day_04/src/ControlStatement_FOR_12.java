
public class ControlStatement_FOR_12 {

	public static void main(String[] args) {
		// ��ø�� ������ �ݺ��������� break, continue
		// break : IF���� ������ ù��° ������ ���������� ���
		// continue : IF���� ������ ù��° ������ ���� �������� �̵��ϴ� ���


		// ��ø�� �ݺ����� �����ϱ� ���� ���غ���
		boolean flag = false;
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				
				// i �� ���� 2�̰�, j �� ���� 3�϶� �ݺ��� ����
				if(i == 2 && j == 3) { 
					// �ݺ����� �����ϱ� ���� ���� ������ ���� ����
					flag = true;
					break;
				}
				
				System.out.printf("i -> %d, j -> %d\n",i,j);
			}
			// �ܺ��� �ݺ��� �������� ���� ���θ� Ȯ���� ���� break�� ����
			if (flag)
				break;
			System.out.println();
		}
	}

}
