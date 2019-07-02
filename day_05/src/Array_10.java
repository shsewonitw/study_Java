import java.util.Scanner;
public class Array_10 {

	public static void main(String[] args) {
		// 배열의 크기는 프로그램에서 중요한 정보입니다.
		// 배열의 크기에 따라 반복의 횟수나, 특정 인덱스의 값을 
		// 참조하는것이 수시로 바뀌기 때문입니다.
		// 배열은 이러한 문제를 해결하기 위해 length 라는 속성을 제공합니다.
		// 배열의이름.length -> 배열의 크기가 정수 타입으로 리턴
		
		// 3 과목의 성적을 입력받아, 총점과 평균을 출력
		// (배열을 활용하여 처리)
		Scanner sc = new Scanner(System.in);
		// 성적점수를 저장하기 위한 배열 선언
		int [] scores = new int[2];
		
		int tot = 0;
		
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.printf("%d번째 성적: ",i+1);
			scores[i] = sc.nextInt();
			tot += scores[i];
		}
		double avg = (double)tot/scores.length;
		
		System.out.printf("총점 : %d점, 평균 : %.2f점\n",tot,avg);
	}

}
