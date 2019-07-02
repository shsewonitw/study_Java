package tje.io;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

// ��Ģ������ ����� ������ �� �ִ�
// CalculatorResult Ŭ������ �ۼ��ϼ���
// CalculatorResult Ŭ������ ���꿡 ���� ����, ������ ����
// ������ ��ȣ, ������ ����� ������ �� �ֽ��ϴ�.
// CalculatorResult Ŭ������ toString �޼ҵ带 ���ؼ�
// ����İ� ����� ����� �� �ֽ��ϴ�.

class CalculatorResult implements Serializable{
	private int num1;
	private int num2;
	private char operator;
	private double result;
	
	public CalculatorResult(int num1, char operator, int num2, double result) {
		this.num1 = num1;
		this.operator = operator;
		this.num2 = num2;
		this.result = result;
	}
	
	@Override
	public String toString() {
		return String.format("%d %c %d = %.2f\n", num1, operator, num2, result);
	}
}


public class IO_21 {

	public static void main(String[] args) throws Exception {
		// ����ڿ��� ���� 2���� ���Ŀ� ���� ��ȣ�� �Է¹޾�
		// ����� ����ϼ���
		// ����� CalculatorResult Ŭ������ ��ü�� �����Ͽ�
		// ������ ��, toString �޼ҵ带 ����Ͽ� ����ϼ���.
		
		int num1, num2;
		char operator;
		double result=0;
		char isExit;
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		
		
		// �ݺ����� Ȱ���Ͽ� ����ڰ� ���Ḧ ���� ������ ����� �����ϰ�
		// �Ʒ��� history �÷��ǿ�
		// ������ ����� �����ϴ� CalculatorResult ��ü�� �����ϼ���
		ArrayList<CalculatorResult> history = new ArrayList<CalculatorResult>();
		
		
		do {
			System.out.print("���꿡 ����� ����1 �Է�: ");
			num1 = Integer.parseInt(br.readLine());
			System.out.print("������ �Է�: ");
			operator = (char)br.read(); br.skip(2);
			System.out.print("���꿡 ����� ����2 �Է�: ");
			num2 = Integer.parseInt(br.readLine());
			
			if(operator == '+')
				result = num1 + num2;
			else if(operator == '-') 
				result = num1 - num2;
			else if(operator == '*') 
				result = num1 * num2;
			else if(operator == '/')
				try {
					result = (double)num1 / num2;
				} catch (ArithmeticException e) {
					System.out.println("0���� ������ �����ϴ�.");
					return;
				}
			else if(operator == '%') 
				try {
					result = num1 % num2;
				} catch (ArithmeticException e) {
					System.out.println("0���� ������ �����ϴ�.");
					return;
				}
			else {
				System.out.println("�����ڸ� �߸��Է��߽��ϴ�.");
				return;
			}
	
			CalculatorResult cr = new CalculatorResult(num1, operator, num2, result);
			history.add(cr);
			System.out.println(cr);
			System.out.println("����? (y/n) : ");
			isExit = (char)br.read(); br.skip(2);
		} while(isExit != 'y' && isExit != 'Y');
		
		System.out.println("��� ���� ���");
		
		for(int i = 0 ; i < history.size(); i++) {
			System.out.println(history.get(i));
		}
		
		
		// history �� ��ϵ� ��ü���� �����ϼ���.
		// ���ϸ��� �⵵_��_��_�ð�_��.dat �� �����ϼ���.
		// D:\\Student\\dev\\java_se\\file_log ��ο� �����ϼ���
		// ex) 2019_03_15_12_54.dat
		
		
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();
		String format = "yyyy_MM_dd_hh_mm";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		String dirPath = "D:\\Student\\dev\\java_se\\file_log";
		String fileName = sdf.format(now)+".dat";
		File dir = new File(dirPath);
		File file = new File(dir, fileName);
		
		ObjectOutputStream out = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(file)));
		
		out.writeObject(history);
		out.flush();
		out.close();
	}

}