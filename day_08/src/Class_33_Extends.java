// +,- ����� ������ �ִ� PlusMinusCalculator Ŭ������ ������ ��
// main �޼ҵ忡�� �׽�Ʈ�ϼ���.
// 1��° ������ �Է� : 10
// 2��° ������ �Է� : 5
// ��ȣ�� �Է��ϼ��� : +
// 10 + 5 = 15

import java.util.Scanner;

class PlusMinusCalculator {
	
	public void plus(int n1, int n2) {
		System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
	}
	
	public void minus(int n1, int n2) {
		System.out.printf("%d - %d = %d\n",n1,n2,n1-n2);
	}
}

// PlusMinusCalculator Ŭ������ ��ӹ޴� Calculator Ŭ������ �����ϼ���.
// Calculator Ŭ������ ��Ģ����� ������ ������ ������ �� �ֵ��� �����ϼ���.

class Calculator extends PlusMinusCalculator {
	
	public void multi(int n1, int n2) {
		System.out.printf("%d * %d = %d\n",n1,n2,n1*n2);
	}
	
	public void div(int n1, int n2) {
		System.out.printf("%d / %d = %.2f\n",n1,n2,(double)n1/n2);
	}
	
	public void mod(int n1, int n2) {
		System.out.printf("%d %% %d = %d\n",n1,n2,n1%n2);
	}
}

public class Class_33_Extends {

	public static void main(String[] args) {
		// PlusMinusCalculator pmc = new PlusMinusCalculator();
		Calculator cal = new Calculator();
		// �Է°���...
		int n1, n2;
		char c;
		// ��ȣ �Է°���...
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է�: ");
		n1 = sc.nextInt();
		System.out.print("�� ��° ������ �Է�: ");
		n2 = sc.nextInt();
		System.out.print("��ȣ�� �Է�: ");
		c = sc.next().charAt(0);
		
		// ��ȣ�� ���� ���� 
		if(c=='+')
			cal.plus(n1,n2);
		else if(c=='-')
			cal.minus(n1,n2);
		else if(c=='*')
			cal.multi(n1, n2);
		else if(c=='/')
			cal.div(n1, n2);
		else if(c=='%')
			cal.mod(n1, n2);
		else
			System.out.println("��ȣ�� �߸��Է��ϼ̽��ϴ�.");
	}

}
