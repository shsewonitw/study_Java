
public class ControlStatement_FOR_02 {

	public static void main(String[] args) {
		// 1 ~ 100 ������ ���� ��, ¦���� ���

		// �ʱ�ȭ���� �������� �����Ͽ� ó��
		/*
		 * for( int i=2;i<=100;i+=2 ) { System.out.println(i); }
		 */

		// ����� ��ø�Ͽ� ¦���� ����ϴ� ����
		// �ݺ��� ���ο��� �ٸ� ����� Ȱ���� �� �ִ�.
		// if, switch, for, while, do ~ while
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.printf("i -> %d\n",i);

		}

	}

}
