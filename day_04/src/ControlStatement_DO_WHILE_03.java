import java.util.*;

public class ControlStatement_DO_WHILE_03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
				
		do {
			System.out.print("프로그램을 종료하려면 100을 입력하세요 : ");
		} while( sc.nextInt() != 100 );
		
		sc.close();
				
		System.out.println("프로그램 종료");
	}

}