import java.util.Scanner;
public class Array_09 {

	public static void main(String[] args) {
		// 3 ������ ������ �Է¹޾�, ������ ����� ���
		// (�迭�� Ȱ���Ͽ� ó��)
		Scanner sc = new Scanner(System.in);
		// ���������� �����ϱ� ���� �迭 ����
		int [] scores = new int[5];
		
		int tot = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("%d��° ����: ",i+1);
			scores[i] = sc.nextInt();
			tot += scores[i];
		}
		double avg = (double)tot/5;
		
		System.out.printf("���� : %d��, ��� : %.2f��\n",tot,avg);
	}

}
