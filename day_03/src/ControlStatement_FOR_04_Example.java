import java.util.Scanner;

public class ControlStatement_FOR_04_Example {

	public static void main(String[] args) {
		// ���ڿ��ڿ��� 3���� ������ �Է¹޾�
		// �Էµ� ������ �հ�, ���, �ִ밪, �ּҰ��� ����ϼ���

		Scanner sc = new Scanner(System.in);
		
		int sum = 0, min = 0, max = 0;
		double avg;

		for (int i = 1; i <= 3; i++) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			sum += num;
			
			
			// �ִ밪�� �ּҰ��� ���ϱ� ���ؼ���
			// �ԷµǴ� �� �� ���ʷ� ���� ������
			// �ʱ�ȭ�� �����ؾ� �Ѵ�.
			if (i == 1) {
				max = min = num;
			} else {
				if (num > max)
					max = num;

				if (min > num)
					min = num;
			}
		}

		sc.close();
		avg = (double) sum / 3;

		System.out.printf("�հ�: %d, ���: %.2f, �ִ밪: %d, �ּҰ�: %d\n", sum, avg, max, min);
	}

}
