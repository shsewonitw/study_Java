import java.util.*;

public class ControlStatement_FOR_06_Example {

	public static void main(String[] args) {
		// ����ó���� ���� ���α׷��� �ۼ��մϴ�.
		// 3������ ������ �Է¹޾� ����, ����� ����Ͽ� ���
		// ����ڰ� ���Ḧ ���Ҷ����� �ݺ�
		Scanner sc = new Scanner(System.in);
			
		int sum=0;
		double avg;
		
		for(;;) {
			for(int i=1 ; i<=3 ; i++) {
				System.out.printf("%d��° ������ �Է��ϼ��� :",i);
				sum += sc.nextInt(); 
			}
			avg = sum/3.0;
			System.out.printf("���� : %d��, ��� : %.2f��\n",sum,avg);
			System.out.print("����? (y/n) : ");
			if(sc.next().charAt(0)=='y') {
				System.out.println("���α׷� ����");
				sc.close();
				break;
			} else {
				sum =0; avg =0;
			}
		}
	}
}
