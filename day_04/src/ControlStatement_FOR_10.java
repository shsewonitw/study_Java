
public class ControlStatement_FOR_10 {

	public static void main(String[] args) {
		// ��ø�� ������ �ݺ����� ����
		// ������ ���
		
		// �ܺ��� �ݺ���
		// �ܼ��� �����ϴ� �ݺ���( 2 ~ 9 ���� �ݺ� )
		for(int i = 2 ; i <= 9 ; i++) {
			
			// ������ �ݺ���
			// �ܼ��� �������� ���� �����ϴ� �ݺ��� ( 1~9 ���� �ݺ� )
			for( int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}

	}

}
