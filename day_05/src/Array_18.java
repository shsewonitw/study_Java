import java.util.Scanner;

public class Array_18 {

	public static void main(String[] args) {
		// 3���� �л� ������ ó���� �� �ִ� ���α׷��� �ۼ��ϼ���.
		// ������ 5�����̸�, ����ڰ� �Է��� ������ �����մϴ�.
		// ��� �л��� �Է��� ���� �Ŀ��� �� �л��� ������ ����� ����ϼ���.
		// (2���� �迭�� ����ϼ���!)

		Scanner sc = new Scanner(System.in);

		
		int[][] scores = new int[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d�� �л��� %d��° ���� ���� �Է� : ",i+1,j+1);
				scores[i][j] = sc.nextInt();
			
			}
		}
		
		int sum=0;
		double avg;
		for(int i = 0;i<3;i++) {
			for(int j =0;j<5;j++) {
				sum += scores[i][j];
			}
			avg = (double)sum/5;
			System.out.printf("\n%d��° �л��� ����: %d, ���: %.2f\n",i+1,sum,avg);
			sum=0;
		}

	}

}


