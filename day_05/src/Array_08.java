import java.util.Scanner;
public class Array_08 {

	public static void main(String[] args) {
		// 3 ������ ������ �Է¹޾�, ������ ����� ���
		
		Scanner sc = new Scanner(System.in);
		int s1, s2, s3;
		
		System.out.printf("1��° ����: ");
		s1 = sc.nextInt();
		System.out.printf("2��° ����: ");
		s2 = sc.nextInt();
		System.out.printf("3��° ����: ");
		s3 = sc.nextInt();
		
		int tot = s1 + s2 + s3;
		double avg = (double)tot/3;
		
		System.out.printf("���� : %d��, ��� : %.2f��\n",tot,avg);
	}

}
