import java.util.*;

public class ControlStatement_DO_WHILE_02 {

	public static void main(String[] args) {
		// do ~ while �ݺ����� Ȱ���� ���� ����
		
		// 1. �Է�
		Scanner sc = new Scanner(System.in);
		// ��꿡 ����� ���� �ΰ��� ������ ����
		int n1, n2;
		// ��꿡 ����� ��ȣ�� ������ ���ڷ� ����
		char operator;
		// ���α׷��� ���Ḧ ������ ����
		char isEnd;
		
		// 2. ó��
		do {
			System.out.print("1��° ������ �Է� : ");
			n1 = sc.nextInt();
			System.out.print("����ȣ�� �Է� : ");
			operator = sc.next().charAt(0);
			System.out.print("2��° ������ �Է� : ");
			n2 = sc.nextInt();
			
			double result;
			// char Ÿ���� ������ �������̹Ƿ�
			// switch �������� ó���� �� �ֽ��ϴ�.
			switch( operator ) {
				case '+':
					result = n1 + n2; break;
				case '-':
					result = n1 - n2; break;
				case '*':
					result = n1 * n2; break;
				case '/':
					result = (double)n1 / n2; break;
				case '%':
					result = n1 % n2; break;
				default :
					operator = '$';
					result = 0;
			}
			if( operator != '$')
				System.out.printf("%d %c %d = %.2f\n",n1,operator,n2,result);
			else
				System.out.println("��ȣ�� ���� ��Ȯ�� �Է����ּ���");
			
			// ���α׷� ���� ó��
			System.out.print("���α׷� ����? (y/n) : ");
			isEnd = sc.next().charAt(0);
			sc.close();
		} while( isEnd == 'n' || isEnd =='N' );
		
	}

}