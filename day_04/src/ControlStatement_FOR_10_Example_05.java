import java.util.*;
public class ControlStatement_FOR_10_Example_05 {

	public static void main(String[] args) {
		// ��ø�� �ݺ����� Ȱ���Ͽ� �л��� ������ 
		// ó���ϴ� ���α׷��� �ۼ��ϼ���
		// <����>
		// �л����� �Է��ϼ��� : 3
		// ������� �Է��ϼ��� : 3
		// 1��° �л��� 1��° ������ �Է��ϼ��� : 100
		// 1��° �л��� 2��° ������ �Է��ϼ��� : 100
		// 1��° �л��� 3��° ������ �Է��ϼ��� : 100
		// 1��° �л��� ������ 300 ��, ����� 100.00 �� �Դϴ�. 
		// 2��° �л��� 1��° ������ �Է��ϼ��� : 90
		// 2��° �л��� 2��° ������ �Է��ϼ��� : 90
		// 2��° �л��� 3��° ������ �Է��ϼ��� : 90
		// 2��° �л��� ������ 270 ��, ����� 90.00 �� �Դϴ�.
		// ... 

		Scanner sc = new Scanner(System.in);
		
		int student, subject, sum = 0;
		double avg;
		System.out.print("�л� ���� �Է��ϼ��� : ");
		student = sc.nextInt();
		
		System.out.print("���� ���� �Է��ϼ��� : ");
		subject = sc.nextInt();
		
		for(int i=1 ; i<=student ; i++) {
			for(int j=1 ; j<=subject ; j++) {
				System.out.printf("%d��° �л��� %d��° ������ �Է��ϼ��� : ",i,j);
				sum += sc.nextInt();
			}
			avg = (double)sum / subject;
			System.out.printf("%d��° �л��� ������ %d��, ����� %.2f�� �Դϴ�.\n\n",i,sum,avg);
			sum = 0;
		}
		sc.close();
	}

}
