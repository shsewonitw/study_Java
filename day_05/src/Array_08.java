import java.util.Scanner;
public class Array_08 {

	public static void main(String[] args) {
		// 3 과목의 성적을 입력받아, 총점과 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		int s1, s2, s3;
		
		System.out.printf("1번째 성적: ");
		s1 = sc.nextInt();
		System.out.printf("2번째 성적: ");
		s2 = sc.nextInt();
		System.out.printf("3번째 성적: ");
		s3 = sc.nextInt();
		
		int tot = s1 + s2 + s3;
		double avg = (double)tot/3;
		
		System.out.printf("총점 : %d점, 평균 : %.2f점\n",tot,avg);
	}

}
