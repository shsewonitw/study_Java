import java.util.Scanner;
public class ControlStatement_SWITCH_02 {
	public static void main(String[] args) {		
		Scanner kb = new Scanner(System.in);
		
		int menu;
		System.out.println("1.라면  2.김밥  3.만두");
		System.out.print("원하는 메뉴를 선택하세요 : ");
		menu = kb.nextInt();
		kb.close();
		
		// break 키워드
		// if 문을 제외한 첫 번째 영역을 빠져나가는 명령
		// switch, 반복문에서 사용
		// switch 문에서는 해당 case 실행한 후, switch문을
		// 종료하기 위해서 사용
		
		// switch 문은 입력된 정수의 값을 각 case 정의된 값과 비교하면서
		// 동일한 값이 정의된 case 의 실행문을 실행합니다.
		// 이때, break 키워드를 만나거나, switch문이 종료될 때까지 실행
		switch( menu ) {			
			case 1:
				System.out.println("오늘의 라면은 신라면");
				if( true ) {
					break;
				}  
			case 2:
				System.out.println("오늘의 김밥은 치즈김밥");
			case 3:
				System.out.println("오늘의 만두는 소고기김밥");
			default :
				System.out.println("잘못된 번호를 선택했습니다.");
		}   
	}
}













