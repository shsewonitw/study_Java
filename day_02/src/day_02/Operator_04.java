package day_02;

public class Operator_04 {

	public static void main(String[] args) {
		// 증가 / 감소 연산자
		// ++ / --
		// 특정 변수의 값을 1씩 증가 / 감소 시킬수 있는 연산자
		// 대입연산자(=)를 사용하지 않고 변수의 값을 수정할 수 있음
		
		int num;
		num = 10;
		
		System.out.printf("num-> %d\n",num);

		// 대입연산자를 사용하여 특정 변수의 값 1 증가
		// 변수명이 중복되서 사용됨
		num = num + 1;
		System.out.printf("num-> %d\n",num);
		
		// 증가연산자를 사용하여 특정 변수의 값 1증가
		num++;
		System.out.printf("num-> %d\n",num);
		
		num--;
		System.out.printf("num-> %d\n",num);
		
		
	}

}
