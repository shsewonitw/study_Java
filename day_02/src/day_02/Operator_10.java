package day_02;

public class Operator_10 {

	public static void main(String[] args) {
		// 정수를 저장할 수 있는 gender 변수를 선언하고,
		// gender 변수에 주민등록번호 7번째 자리의 값으로 초기화 하세요.
		// gender 변수의 값을 비교하여, 성별을 출력하세요.
		// 1~4 까지의 값으로 초기화
		
		int gender;
		gender = 3;
		String result = "";
		result = gender==2 || gender==4 ? "여자" : result;
		result = gender==1 || gender==3 ? "남자" : result;
		System.out.println("성별은 " + result + "입니다");

	}

}
