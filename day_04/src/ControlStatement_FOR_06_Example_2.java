import java.util.Scanner;

public class ControlStatement_FOR_06_Example_2 {

	public static void main(String[] args) {
		// ����ڿ��� ���� �Ѱ��� �Է¹޽��ϴ�.
		// - ������ 1000 �̻��� ���� �Է� �޾ƾ߸� �մϴ�.
		// - ���� 1000 �̸��� ���� �Է��ϴ� ��� �ٽ� �Է� �޽��ϴ�.

		Scanner sc = new Scanner(System.in);
		int num;
		for (;;) {
			System.out.print("1000 �̻��� ������ �Է��ϼ���: ");
			num = sc.nextInt();
			if (num >= 1000)
				break;
		}

		// 1000�̻��� ���� �ùٸ��� �Էµ� ���
		// 1���� �Էµ� �������� 3�� ������� �հ踦 ����մϴ�.
		// �׸��� �հ迡 ���� 3�� ����� ������ ����ϼ���.
		int tot = 0, count = 0;
		for (int i = 1; i <= num; i++) {
			if(i % 3 == 0) {
				tot += i;
				count++;
			}
		}
		
		System.out.printf("1���� %d������ 3�� ������� �հ�� %d\n",num,tot);
		System.out.printf("1���� %d������ 3�� ����� ������ %d",num,count);
	}

}
