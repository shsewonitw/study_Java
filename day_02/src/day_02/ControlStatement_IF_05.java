package day_02;

import java.util.Scanner;

public class ControlStatement_IF_05 {

	public static void main(String[] args) {
		// Ű���� �Է±���� ����Ͽ�
		// ����ڿ��� 3���� ���� ������ �Է¹�������.
		// �Էµ� ���� ������ ����Ͽ� ������ ����� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		int score1, score2, score3;
		int sum;
		double avg;
		
		System.out.println("1��° ������ �Է��ϼ��� : ");
		score1 = sc.nextInt();
		
		System.out.println("2��° ������ �Է��ϼ��� : ");
		score2 = sc.nextInt();
		
		System.out.println("3��° ������ �Է��ϼ��� : ");
		score3 = sc.nextInt();
		
		sum = score1 + score2 + score3;
		avg = (double)sum/3;
		System.out.printf("������ %d��, ����� %.2f�� �Դϴ�.",sum,avg);
		
		// Ű���� �Է� ó���� ����
		sc.close();
		
	}

}
