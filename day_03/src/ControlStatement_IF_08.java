import java.util.Scanner;

public class ControlStatement_IF_08 {

	public static void main(String[] args) {
		// 로그인을 처리하는 프로그램을 구현하세요
		// ID와 PASSWORD는 모두 정수, ID는 nID 변수 / PASSWORD는 nPassword에 저장(키보드 입력)
		// 입력된 ID와 PASSWORD의 합이 3 또는 5의 배수인 경우 로그인 성공
		// 아니라면 로그인 실패

		Scanner sc = new Scanner(System.in);
		
		int nID, nPassword;
		int sum;
		
		System.out.print("ID를 입력하세요 : ");
		nID = sc.nextInt();
		System.out.print("PASSWORD를 입력하세요 : ");
		nPassword = sc.nextInt();
		
		sc.close();
		
		sum = nID + nPassword;
		
		if( sum%3 == 0 || sum%5 == 0 )
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		
		
	}

}
