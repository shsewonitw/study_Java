package day_02;

public class Variable_06 {

	public static void main(String[] args) {
		// 3 과목의 성적이 있습니다.(97, 79, 85)
		// 3 과목의 성적을 변수에 저장한 후,
		// 총점과 평균을 계산하여 출력하시오.

		// 1. 입력 : 키보드 , 파일, 네트워크, 데이터베이스 입력
		// - 입력값을 저장하기 위한 변수의 선언
		int score1 = 97, score2 = 79, score3 = 85;

		// 2. 처리 : 입력된 데이터를 사용하여 계산하는 작업
		// - 처리된 결과를 저장하기 위한 변수를 선언
		int sum = score1 + score2 + score3;
		double avg = (double) sum / 3;

		// 3. 출력/저장
		// - 처리된 결과를 모니터에 출력, 파일에 저장, 네트워크로 전송, 데이터베이스에 저장, 프린터에 출력
		System.out.println("총점 : " + sum + "\n평균 : " + avg);
		// %자리수의 정수값 : 정수값만큼 자리를 차지하여 출력
		// (음수의 값이 입력되는 경우 좌측 정렬로 출력)
		System.out.printf("총점 : %-5d점, 평균 : %.2f점\n", sum, avg);

	}

}
