import java.util.Scanner;

public class ControlStatement_SWITCH_04 {

	public static void main(String[] args) {
		// ����ڿ��� ���� ���� 3���� �Է¹޾� 
		// ������ ����� ȭ�鿡 ����ϼ���.
		// ��� ������ �������� ����� ����ϼ���.
		// (����� switch ���� ����Ͽ� ó���ϼ���)
		Scanner kb = new Scanner(System.in);
		
		// 1. �Է�
		int s1, s2, s3;
		
		System.out.print("1��° ���� : ");
		s1 = kb.nextInt();
		System.out.print("2��° ���� : ");
		s2 = kb.nextInt();
		System.out.print("3��° ���� : ");
		s3 = kb.nextInt();
		kb.close();
		
		// 2. ó��
		int tot;
		double avg;
		
		tot = s1 + s2 + s3;
		avg = (double)tot / 3;
		
		// 3. ��� �� ����
		System.out.printf("���� : %d, ��� : %.2f\n", tot, avg);
		
		// ������ �򰡸� ����ϱ� ���� �ڵ�
		// 1. �Է�
		// - ����
		
		// 2. ó��
		char grade;
		
		// ��������� �����ϰ� �ִ� avg ������ �Ǽ���(double)�̹Ƿ�
		// switch ���� ���޵� �� �����ϴ�.
		// ���� ����ȯ�� ���ؼ� ���������� ������ �� switch ������ 
		// �����մϴ�.
		// ��� ������ ������ ���� �ۼ��ϱ⿡ ����Ƿ� ������ ���
		// ��� ������ ���������� ��ȯ�� ��, / 10�� �Ͽ� 10�� �ڸ��� ����
		// ��������� 0 ~ 10���� ����
		// 99 / 10 -> 9
		// 9 / 10 -> 0
		switch( avg > 100 || avg < 0 ? -1 :(int)avg / 10 ) {
			// 100���� 90������ �򰡸� �Ѱ����� ó�� 
			case 10 :
			case 9 :	grade = 'A'; break;
			case 8 :	grade = 'B'; break;
			case 7 :	grade = 'C'; break;
			case 6 :	grade = 'D'; break;
			// 50, 40, 30, 20, 10, 0�� ���� �򰡸� �Ѱ����� ó��
			case 5 :
			case 4 :
			case 3 :
			case 2 :
			case 1 :
			case 0 :	grade = 'F'; break;	
			default :
				grade = '?';
		}	
		
		if(grade != '?')
			System.out.printf("���� �򰡴� '%c' �Դϴ�.\n", grade);
		else
			System.out.printf("(ERROR)���� ������ Ȯ���ϼ���(%.2f)\n", avg);
	}

}
