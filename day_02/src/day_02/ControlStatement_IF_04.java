package day_02;

// �⺻�Է�(Ű����) ó���ϴ� ���

// Ű���� �Է��� ó���ϱ� ���� ����
import java.util.Scanner;

public class ControlStatement_IF_04 {

	public static void main(String[] args) {
		// Ű���� �Է��� ���� ������ ����
		// Scanner �� ������ ���
		Scanner sc = new Scanner(System.in);

		int intNumber;
		System.out.print("������ �Է��ϼ��� : ");
		// Scanner Ŭ������ nextInt �޼ҵ�
		// �Էµ� ������ int Ÿ������ ��ȯ�ϴ� �޼ҵ�
		intNumber = sc.nextInt();
		System.out.printf("intNumber -> %d\n",intNumber);
		
		
		double doubleNumber;
		System.out.print("�Ǽ��� �Է��ϼ��� : ");
		// Scanner Ŭ������ nextDouble �޼ҵ�
		// �Էµ� ������ double Ÿ������ ��ȯ�ϴ� �޼ҵ�
		doubleNumber = sc.nextDouble();
		System.out.printf("doubleNumber -> %.3f\n",doubleNumber);
		
		
		String strName;
		System.out.print("�̸��� �Է��ϼ��� : ");
		// Scanner Ŭ������ next �޼ҵ�
		// �Էµ� ���ڿ��� String Ÿ������ ��ȯ�ϴ� �޼ҵ�
		strName = sc.next();
		System.out.printf("strName -> %s\n",strName);
		
		
		char chGender;
		System.out.print("������ �Է��ϼ���(M/W) : ");
		// ���ڸ� �Է¹޴� ���
		// Scanner Ŭ������ next �޼ҵ带 ����ؼ� ���ڿ��� �Է¹޴´�.
		// �׸��� �Էµ� ���ڿ����� ���� �տ� �� ���ڸ� �����Ͽ� ������ ����
		// �Էµ� ���ڿ��� String Ÿ������ ��ȯ�ϴ� �޼ҵ�
		// String Ŭ������ charAt �޼ҵ�
		// �Ű������� ���޵� ��ġ�� ���ڰ��� ��ȯ
		chGender = sc.next().charAt(0);
		System.out.printf("%s",chGender=='M'?"����":"����");
	}
}
