import java.util.*;

public class ControlStatement_FOR_06_Example {

	public static void main(String[] args) {
		// 성적처리를 위한 프로그램을 작성합니다.
		// 3과목의 성적을 입력받아 총점, 평균을 계산하여 출력
		// 사용자가 종료를 원할때까지 반복
		Scanner sc = new Scanner(System.in);
			
		int sum=0;
		double avg;
		
		for(;;) {
			for(int i=1 ; i<=3 ; i++) {
				System.out.printf("%d번째 성적을 입력하세요 :",i);
				sum += sc.nextInt(); 
			}
			avg = sum/3.0;
			System.out.printf("총점 : %d점, 평균 : %.2f점\n",sum,avg);
			System.out.print("종료? (y/n) : ");
			if(sc.next().charAt(0)=='y') {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			} else {
				sum =0; avg =0;
			}
		}
	}
}
