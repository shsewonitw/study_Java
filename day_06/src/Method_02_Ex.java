import java.util.*;

public class Method_02_Ex {

	public static void gugudan_one(int num) {
		System.out.printf("\n%d��\n", num);
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d * %d = %d\n", num, j, num * j);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// ���� �Ѱ��� �Ű������� ���޹޾�
		// �ش� ������ �������� ����� �� �ִ� �޼ҵ带 �����ϼ���
		// (�޼ҵ�� : gugudan_one)
		// ����ڿ��� ������ �Է¹޾� �ռ� ������ gugudan_one �޼ҵ带 ����Ͽ� �ش� ������ �������� ���

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9 ������ �Է� : ");
		num = sc.nextInt();
		gugudan_one(num);
	}

}
