import java.util.Scanner;

public class ControlStatement_IF_07 {

	public static void main(String[] args) {
		// ����ڷκ��� 3���� ���� ������ �Է¹޾�
		// ������ ����� ����ϼ���.
		// ��������� ����Ͽ� ������ �򰡸� ���
		// 90�� �̻� -> A, 80�� �̻� -> B, 70�� �̻� -> C, 60�� �̻� -> D, 60�� �̸� -> F
		
		Scanner sc = new Scanner(System.in);
		
		int score1, score2, score3;
		int sum;
		double avg;
		
		System.out.print("1��° ���� �Է� : ");
		score1 = sc.nextInt();
		System.out.print("2��° ���� �Է� : ");
		score2 = sc.nextInt();
		System.out.print("3��° ���� �Է� : ");
		score3 = sc.nextInt();
		
		sc.close();
		
		sum = score1 + score2 + score3;
		avg = (double)sum/3;
		
		System.out.printf("������ : %d��, ����� : %.2f��\n",sum,avg);
		
		char grade;
		
		// Ư�� ������ ���Ͽ� if ���� ó���ϴ� ����� ó�����
		// 1. �̻�ġ �����͸� ��
		// 2. ���� ������(���� ������) ������ �񱳸� ����
		if( avg < 0 || avg > 100)
			grade = '?';
		else if( avg >= 90 )
			grade = 'A';
		else if( avg >= 80 )
			grade = 'B';
		else if( avg >= 70 )
			grade = 'C';
		else if( avg >= 60 )
			grade = 'D';
		else
			grade = 'F';
		/*
		if( avg >= 90 && avg <= 100 )
			grade = 'A';
		else if( avg >= 80 && avg < 90 )
			grade = 'B';
		else if( avg >= 70 && avg < 80 )
			grade = 'C';
		else if( avg >= 60 && avg < 70 )
			grade = 'D';
		else
			grade = 'F';
		*/
		
		if(grade != '?')
			System.out.printf("���� �򰡴� '%c' �Դϴ�.\n", grade);
		else
			System.out.printf("(ERROR)���� ������ Ȯ�����ּ���(%.2f)\n",avg);

	}
	
}
