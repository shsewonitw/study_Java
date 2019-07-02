import java.util.Scanner;

public class ControlStatement_IF_09 {

	public static void main(String[] args) {
		// 로그인을 처리하는 프로그램을 구현하세요
		// ID와 PASSWORD는 모두 정수, ID는 nID 변수 / PASSWORD는 nPassword에 저장(키보드 입력)
		// 입력된 ID와 PASSWORD가 3 또는 5의 배수인 경우 로그인 성공
		// 아니라면 로그인 실패

		Scanner sc = new Scanner(System.in);
		
		int nID, nPassword;
		
		System.out.print("ID를 입력하세요 : ");
		nID = sc.nextInt();
		System.out.print("PASSWORD를 입력하세요 : ");
		nPassword = sc.nextInt();
		
		sc.close();
		
		
		
		
		// ID 체크
		boolean flag_id = nID % 3 ==0 || nID % 5 == 0;
		boolean flag_password = nPassword % 3 ==0 || nPassword % 5 == 0;
		boolean result = flag_id && flag_password;
		
		if ( flag_id ) {
			// 제어문의 중첩된 사용
			// 자바의 제어문은 내부에 또다른 제어문을 포함할 수 있다
			if ( flag_password ) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 - 패스워드를 확인하세요");
			}
		} else {
			System.out.println("로그인 실패 - 아이디를 확인하세요");
		}
			
		
		// ID 또는 PASSWORD 둘 중 어느곳에서 문제가 발생했는지 확인할 수 없음
		/* if( result )
			System.out.println("로그인 성공");
			else
			System.out.println("로그인 실패");
		*/
		
	}

}
