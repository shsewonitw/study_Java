import java.util.*;

public class ControlStatement_FOR_06 {

	public static void main(String[] args) {
		// ����ڰ� 100�� �Է��� ������ ����ؼ� �Է��� ��������
		// ���� 100�� �ԷµǸ� ���α׷��� �����ϼ���

		// 1. �Է�
		Scanner sc = new Scanner(System.in);

		// 2. ó��
		/*
		 * for(int in = -1 ; in != 100 ; ) { System.out.print("������ �Է��ϼ��� : "); in =
		 * sc.nextInt(); }
		 */

		// �Ʒ��� ���� for ���� ���ǽ� ������ �ۼ����� �ʴ� ���
		// �������� �ʴ� �ݺ����� ���� �� �ֽ��ϴ�.(���ѷ���)
		for (;;) {
			System.out.print("������ �Է��ϼ��� : ");
			if (sc.nextInt() == 100)
			// Ű���忡�� �Էµ� ������ 100�� ���� ���
			// break�� �����Ͽ� �ݺ����� ��������
				break;
		}
		// 3. ��� �� ����
		System.out.println("���α׷� ����");

	}

}
