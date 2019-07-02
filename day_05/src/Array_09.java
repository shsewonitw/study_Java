import java.util.Scanner;
public class Array_09 {

	public static void main(String[] args) {
		// 3 과목의 성적을 입력받아, 총점과 평균을 출력
		// (배열을 활용하여 처리)
		Scanner sc = new Scanner(System.in);
		// 성적점수를 저장하기 위한 배열 선언
		int [] scores = new int[5];
		
		int tot = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("%d번째 성적: ",i+1);
			scores[i] = sc.nextInt();
			tot += scores[i];
		}
		double avg = (double)tot/5;
		
		System.out.printf("총점 : %d점, 평균 : %.2f점\n",tot,avg);
	}

}
