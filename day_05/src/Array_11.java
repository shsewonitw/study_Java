import java.util.Scanner;
public class Array_11 {

	public static void main(String[] args) {
		// ����ڿ��� �迭�� ũ�⸦ �Է¹޾� �迭�� �����ϰ�,
		// �� ��ҿ� ���� �Է¹޾� �Էµ� ����/����/����� ����ϼ���/
		// �ִ밪, �ּҰ��� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int [] scores = new int[sc.nextInt()];
		
		int sum=0, max=0, min=0;
		double avg;
		
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.printf("%d��° ���� : ",i+1);
			scores[i] = sc.nextInt();
			sum += scores[i];
			
			if(i==0)
				max = min = scores[i];
			else {
				if(scores[i]>max)
					max = scores[i];
				if(scores[i]<min)
					min = scores[i];
			}
		}
		avg = (double)sum/scores.length;
		
		System.out.print("�Էµ� ���� : < ");
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.print(scores[i]+" ");
		}
		System.out.println(">");
		System.out.printf("���� : %d, ��� : %.2f, �ִ� : %d, �ּ� : %d\n",sum,avg,max,min);
		
	}

}
