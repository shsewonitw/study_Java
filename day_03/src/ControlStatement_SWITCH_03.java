import java.util.Scanner;

public class ControlStatement_SWITCH_03 {

	public static void main(String[] args) {
		// 사용자에게 1~10 사이의 정수를 입력받으세요.
		// 입력된 정수부터 10 사이의 정수를 모두 출력하세요.
		// (SWITCH문을 사용하세요)
		// <예시>
		// 1~10사이의 정수를 입력 : 5
		// <5, 6, 7, 8, 9, 10>
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("1~10사이의 정수를 입력하세요 : ");
		number = sc.nextInt();
		
		String result = "<";
		
		// break 키워드 없는걸 활용
		switch( number ) {
		case 1: result += "1, ";
		case 2: result += "2, ";
		case 3:	result += "3, ";
		case 4:	result += "4, ";
		case 5:	result += "5, ";
		case 6:	result += "6, ";
		case 7:	result += "7, ";
		case 8:	result += "8, ";
		case 9:	result += "9, ";
		case 10: result += "10>"; break;
		default: result += "ERROR! 범위 안의 정수만 입력하세요>";
		}
		
		System.out.println(result);
		

	}

}