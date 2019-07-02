package day_02;

public class Operator_09 {
	
	public static void main(String[] args) {
		// 삼항연산자
		// 조건식의 결과에 따라서 값 또는 식을 분기할 수 있는 연산자
		// 조건식 : 참과 거짓으로 나뉘는 식
		// 조건식은 관계연산자 또는 논리연산자를 조합하여 작성
		// 형식 -> 조건식 ? 조건식이 참일 경우의 값/식 : 조건식이 거짓일 경우의 값/식
		
		int number = 20;
		
		// 짝수 / 홀수 메세지를 저장하는 변수
		String result;
		result = number % 2 == 0 ? "짝수" : "홀수";
		System.out.printf("%d 정수는 %s 입니다.\n",number,result);
	}
}

