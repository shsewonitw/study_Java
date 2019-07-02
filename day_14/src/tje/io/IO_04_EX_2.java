package tje.io;

import java.io.IOException;

public class IO_04_EX_2 {

	public static void main(String[] args) throws IOException {
		// System.in 객체를 사용하여 더하기 연산을 수행하는
		// 프로그램을 작성하세요.
		// 첫번째 정수 : 123
		// 두번째 정수 : 2
		// 결과 : 123 + 2 = 125
		
		// 첫번째 숫자에 대한 문자값을 저장하기 위한 byte 배열
		byte[] inputNum1 = new byte[10];
		// 두번째 숫자에 대한 문자값을 저장하기 위한 byte 배열
		byte[] inputNum2 = new byte[10];

		
		int size;
		System.out.print("첫 번째 정수 : ");
		size = System.in.read(inputNum1);
		
		int n1 = 0;
		for(int i = size-3, multiple = 1 ; i >= 0 ; i--, multiple *= 10)
			n1 += (inputNum1[i] - '0') * multiple;
		
		System.out.print("첫 번째 정수 : ");
		size = System.in.read(inputNum1);
		int n2 = 0;
		for(int i = size-3, multiple = 1 ; i >= 0 ; i--, multiple *= 10)
			n2 += (inputNum2[i] - '0') * multiple;


		System.out.printf("%d + %d = %d",n1,n2,n1+n2);
	}
}
