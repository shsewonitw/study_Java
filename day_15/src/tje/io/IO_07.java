package tje.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_07 {

	public static void main(String[] args) throws IOException {
		// �ټ����� ��Ʈ�� Ŭ�������� ���յ� ��Ʈ�� ��ü ����
		// BufferedReader ��ü ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String input;
		
		// 
		System.out.print("���� �Է�: ");
		input = br.readLine();
		// �Էµ� ���ڿ��� ������ ��ȯ
		int num = Integer.parseInt(input);
		System.out.printf("�Էµ� ����: %d\n",num);
		
		
		System.out.print("�Ǽ� �Է�: ");
		input = br.readLine();
		// �Էµ� ���ڿ��� �Ǽ��� ��ȯ
		double num_double = Double.parseDouble(input);
		System.out.printf("�Էµ� ����: %.2f\n",num_double);
		
		System.out.print("���� �Է�: ");
		/*
		 	char single_ch = (char)br.read();
		 	// ����Ű ���� (\r\n)
		 	br.skip(2);
		 */
		input = br.readLine();
		// �Էµ� ���ڿ��� ���ڷ� ��ȯ
		char single_ch = input.charAt(0);
		System.out.printf("�Էµ� ����: %c\n",single_ch);
		
		br.close();
	}

}
