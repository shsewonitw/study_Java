import java.util.Scanner;

public class ControlStatement_FOR_02_Example {

	public static void main(String[] args) {
		// ����ڿ��� 2 ���� ������ �Է¹޾�
		// 2���� ���� �� ���� ������ �����Ͽ�
		// ū ������ Ȧ���� ����ϼ���
		
		int num1, num2;
		int small, big;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է� : ");
		num2 = sc.nextInt();
		
		sc.close();
		
		small = num1<num2?num1:num2;
		big = num1<num2?num2:num1;
		
		big = big %2 ==0? big-1: big;
		for( int i=small ; i<=big ; i++ ) {
			if( i%2 != 0 ) {
				System.out.printf("%d%c ",i,i!=big?',':' ');
			}
		}

	}

}                                                                                                                                                                                                                                   
