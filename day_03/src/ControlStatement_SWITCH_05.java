import java.util.Scanner;

public class ControlStatement_SWITCH_05 {

	public static void main(String[] args) {
		// 사용자에게 1~12 사이의 정수를 입력받으세요
		// 입력된 정수에 해당되는 월의 날짜수를 출력하세요
		// switch문으로 작성
		
		Scanner sc = new Scanner(System.in);
		
		int month, days;
		System.out.print("1 부터 12 사이의 정수를 입력하세요 : ");
		month = sc.nextInt();
		switch( month ) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: days=31; break;
		case 4:
		case 6:
		case 9:
		case 11: days=30; break;
		case 2: days=28; break;
		default: days=-1;
		}

		System.out.println(days==-1?"잘못입력하셨습니다.":days);
	}

}
