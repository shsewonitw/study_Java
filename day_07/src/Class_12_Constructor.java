import java.util.*;

class Student {
	private String name;
	private int[] scores;
	// 멤버 필드는 선언과 동시에 초기화가 가능합니다.
	// (모든 객체가 동일한 값을 가지게 됩니다.)
	private String[] subjects = { "국어", "영어", "수학" };
	private int tot;
	private double avg;
	private char grade;

	public Student(String input_name) {
		// 생성자에 전달된 문자열 값을 이용하여 name을 초기화
		name = input_name;
		// 클래스의 멤버 필드 중, 객체 타입이 존재하는 경우 반드시 생성자에서 null 이외의 값으로 초기화
		// (생성자에서 배열을 생성)
		scores = new int[subjects.length];
	}

	public void input() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < subjects.length; i++) {

			do {
				System.out.printf("%s 성적을 입력: ", subjects[i]);
				scores[i] = sc.nextInt();
			} while (!checkScore(i));
			tot += scores[i];
		}
		sc.close();

		avg = (double) tot / 3;
		setGrade();
	}

	private boolean checkScore(int index) {
		if (scores[index] < 0 || scores[index] > 100) {
			System.out.println("성적 점수는 0~100 사이만 입력해주세요");
			return false;
		} else
			return true;
	}

	// 클래스 내부에서만 사용할 목적의 메소드라면
	// private 으로 지정할 수도 있습니다.
	// 아래의 setGrade 메소드는 성적이 입력되어야만
	// 실행할 수 있으므로, private으로 지정함
	private void setGrade() {
		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'D';
		else
			grade = 'F';
	}

	public void output() {
		System.out.println("---------------------------");
		System.out.printf("%s 학생의 성적 정보를 출력합니다.\n", name);
		System.out.printf("총점: %d, 평균: %.2f\n", tot, avg);
		System.out.printf("등급: %c\n", grade);
		System.out.println("---------------------------");
	}
}

public class Class_12_Constructor {

	public static void main(String[] args) {
		// 아래의 코드가 실행될 수 있도록 클래스를 작성하세요.
		// 실행 모습
		// 국어 성적을 입력 : 100
		// 영어 성적을 입력 : 100
		// 수학 성적을 입력 : 100
		// ----------------------------
		// 아무개 학생의 성적 정보를 출력합니다.
		// 총점 : 300 점, 평균 100.00 점
		// 등급 : A
		// ----------------------------
		Student s = new Student("아무개");
		s.input();
		s.output();
	}

}
