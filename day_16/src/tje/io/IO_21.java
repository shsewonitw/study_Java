package tje.io;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

// 사칙연산의 결과를 저장할 수 있는
// CalculatorResult 클래스를 작성하세요
// CalculatorResult 클래스는 연산에 사용된 좌항, 우항의 정보
// 연산자 부호, 연산의 결과를 저장할 수 있습니다.
// CalculatorResult 클래스는 toString 메소드를 통해서
// 연산식과 결과를 출력할 수 있습니다.

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
		// 사용자에게 정수 2개와 계산식에 사용될 부호를 입력받아
		// 결과를 출력하세요
		// 결과는 CalculatorResult 클래스의 객체를 생성하여
		// 저장한 후, toString 메소드를 사용하여 출력하세요.
		
		int num1, num2;
		char operator;
		double result=0;
		char isExit;
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		
		
		// 반복문을 활용하여 사용자가 종료를 원할 때까지 계산을 수행하고
		// 아래의 history 컬렉션에
		// 계산식의 결과를 저장하는 CalculatorResult 객체를 저장하세요
		ArrayList<CalculatorResult> history = new ArrayList<CalculatorResult>();
		
		
		do {
			System.out.print("연산에 사용할 정수1 입력: ");
			num1 = Integer.parseInt(br.readLine());
			System.out.print("연산자 입력: ");
			operator = (char)br.read(); br.skip(2);
			System.out.print("연산에 사용할 정수2 입력: ");
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
					System.out.println("0으로 나눌수 없습니다.");
					return;
				}
			else if(operator == '%') 
				try {
					result = num1 % num2;
				} catch (ArithmeticException e) {
					System.out.println("0으로 나눌수 없습니다.");
					return;
				}
			else {
				System.out.println("연산자를 잘못입력했습니다.");
				return;
			}
	
			CalculatorResult cr = new CalculatorResult(num1, operator, num2, result);
			history.add(cr);
			System.out.println(cr);
			System.out.println("종료? (y/n) : ");
			isExit = (char)br.read(); br.skip(2);
		} while(isExit != 'y' && isExit != 'Y');
		
		System.out.println("계산 내역 출력");
		
		for(int i = 0 ; i < history.size(); i++) {
			System.out.println(history.get(i));
		}
		
		
		// history 에 기록된 객체들을 저장하세요.
		// 파일명은 년도_월_일_시간_분.dat 로 저장하세요.
		// D:\\Student\\dev\\java_se\\file_log 경로에 저장하세요
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