
public class ControlStatement_FOR_07 {

	public static void main(String[] args) {
		// continue Ű����
		// if ���� ������ ù��° ������ ���� �������� �̵��ϴ� ���
		// �̵��ϴ� ��� (���������� ���� �ƴ�)
		// �ݺ��������� ����� �� ����
		// �ݺ��� ���ο��� continue Ű���带 ����ϸ�
		// ���� �ݺ��� �����ϰ� ���� �ݺ����� �̵�(�ǳʶ�)�� �� ����
		
		for(int i = 1 ; i <= 10 ; i++) {
			if(i % 2 == 0)
				continue;
			
			System.out.printf("i = %d\n",i);
			
		}

	}

}
