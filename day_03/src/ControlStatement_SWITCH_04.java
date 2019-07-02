import java.util.Scanner;

public class ControlStatement_SWITCH_04 {

	public static void main(String[] args) {
		// 사용자에게 성적 점수 3개를 입력받아 
		// 총점과 평균을 화면에 출력하세요.
		// 평균 점수를 기준으로 등급을 출력하세요.
		// (등급은 switch 문을 사용하여 처리하세요)
		Scanner kb = new Scanner(System.in);
		
		// 1. 입력
		int s1, s2, s3;
		
		System.out.print("1번째 성적 : ");
		s1 = kb.nextInt();
		System.out.print("2번째 성적 : ");
		s2 = kb.nextInt();
		System.out.print("3번째 성적 : ");
		s3 = kb.nextInt();
		kb.close();
		
		// 2. 처리
		int tot;
		double avg;
		
		tot = s1 + s2 + s3;
		avg = (double)tot / 3;
		
		// 3. 출력 및 저장
		System.out.printf("총점 : %d, 평균 : %.2f\n", tot, avg);
		
		// 성적의 평가를 출력하기 위한 코드
		// 1. 입력
		// - 생략
		
		// 2. 처리
		char grade;
		
		// 평균점수를 저장하고 있는 avg 변수는 실수형(double)이므로
		// switch 문에 전달될 수 없습니다.
		// 강제 형변환을 통해서 정수형으로 변경한 후 switch 문으로 
		// 전달합니다.
		// 평균 점수의 범위기 직접 작성하기에 힘드므로 범위를 축소
		// 평균 점수를 정수형으로 변환한 후, / 10을 하여 10의 자리만 추출
		// 평균점수는 0 ~ 10으로 압출
		// 99 / 10 -> 9
		// 9 / 10 -> 0
		switch( avg > 100 || avg < 0 ? -1 :(int)avg / 10 ) {
			// 100점과 90점대의 평가를 한곳에서 처리 
			case 10 :
			case 9 :	grade = 'A'; break;
			case 8 :	grade = 'B'; break;
			case 7 :	grade = 'C'; break;
			case 6 :	grade = 'D'; break;
			// 50, 40, 30, 20, 10, 0점 대의 평가를 한곳에서 처리
			case 5 :
			case 4 :
			case 3 :
			case 2 :
			case 1 :
			case 0 :	grade = 'F'; break;	
			default :
				grade = '?';
		}	
		
		if(grade != '?')
			System.out.printf("성적 평가는 '%c' 입니다.\n", grade);
		else
			System.out.printf("(ERROR)성적 점수를 확인하세요(%.2f)\n", avg);
	}

}
