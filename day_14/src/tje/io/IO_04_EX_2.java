package tje.io;

import java.io.IOException;

public class IO_04_EX_2 {

	public static void main(String[] args) throws IOException {
		// System.in ��ü�� ����Ͽ� ���ϱ� ������ �����ϴ�
		// ���α׷��� �ۼ��ϼ���.
		// ù��° ���� : 123
		// �ι�° ���� : 2
		// ��� : 123 + 2 = 125
		
		// ù��° ���ڿ� ���� ���ڰ��� �����ϱ� ���� byte �迭
		byte[] inputNum1 = new byte[10];
		// �ι�° ���ڿ� ���� ���ڰ��� �����ϱ� ���� byte �迭
		byte[] inputNum2 = new byte[10];

		
		int size;
		System.out.print("ù ��° ���� : ");
		size = System.in.read(inputNum1);
		
		int n1 = 0;
		for(int i = size-3, multiple = 1 ; i >= 0 ; i--, multiple *= 10)
			n1 += (inputNum1[i] - '0') * multiple;
		
		System.out.print("ù ��° ���� : ");
		size = System.in.read(inputNum1);
		int n2 = 0;
		for(int i = size-3, multiple = 1 ; i >= 0 ; i--, multiple *= 10)
			n2 += (inputNum2[i] - '0') * multiple;


		System.out.printf("%d + %d = %d",n1,n2,n1+n2);
	}
}
