package day_02;

// ���
//  - ���� �ڵ��� �帧�� ������ �� �ִ� ����
// 1. �б⹮
//  - ���ǽ��� ����� ���� ���๮�� ���� ���θ� �����ϴ� ����
//  - if, switch
// 2. �ݺ���
//  - ���ǽ��� ����� ���� ���๮�� �ݺ� ���θ� �����ϴ� ����
//  - for, while, do ~ while
public class ControlStatement_IF_01 {

	public static void main(String[] args) {
		// if��
		// ���ǽ��� �������� ���� ���� ������ ����� ������ �б��� �� �ִ� ����
		// ���׿����ڴ� ���ǽ��� ����� ���� ���� ����
		// if���� ��쿡�� ���ǽ��� ����� ���� ���๮�� ���� ���ΰ� ����

		// ����
		// if( ���ǽ� - true/false�� ������ �и��Ǵ� �� )
		// ���ǽ��� ���� ����� ���๮;

		int number = 10;

		if (number % 2 == 0)
			System.out.printf("¦�� �Դϴ�\n");

		if (number % 2 == 1)
			System.out.printf("Ȧ�� �Դϴ�\n");

		// �ֹε�Ϲ�ȣ�� 7��° �ڸ��� ����
		int gender = 4;
		if (gender == 1 || gender == 3)
			System.out.println("�����Դϴ�\n");

		if (gender == 2 || gender == 4)
			System.out.println("�����Դϴ�\n");
	}

}
