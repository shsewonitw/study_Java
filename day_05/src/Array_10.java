import java.util.Scanner;
public class Array_10 {

	public static void main(String[] args) {
		// �迭�� ũ��� ���α׷����� �߿��� �����Դϴ�.
		// �迭�� ũ�⿡ ���� �ݺ��� Ƚ����, Ư�� �ε����� ���� 
		// �����ϴ°��� ���÷� �ٲ�� �����Դϴ�.
		// �迭�� �̷��� ������ �ذ��ϱ� ���� length ��� �Ӽ��� �����մϴ�.
		// �迭���̸�.length -> �迭�� ũ�Ⱑ ���� Ÿ������ ����
		
		// 3 ������ ������ �Է¹޾�, ������ ����� ���
		// (�迭�� Ȱ���Ͽ� ó��)
		Scanner sc = new Scanner(System.in);
		// ���������� �����ϱ� ���� �迭 ����
		int [] scores = new int[2];
		
		int tot = 0;
		
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.printf("%d��° ����: ",i+1);
			scores[i] = sc.nextInt();
			tot += scores[i];
		}
		double avg = (double)tot/scores.length;
		
		System.out.printf("���� : %d��, ��� : %.2f��\n",tot,avg);
	}

}
