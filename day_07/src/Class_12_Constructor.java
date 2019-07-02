import java.util.*;

class Student {
	private String name;
	private int[] scores;
	// ��� �ʵ�� ����� ���ÿ� �ʱ�ȭ�� �����մϴ�.
	// (��� ��ü�� ������ ���� ������ �˴ϴ�.)
	private String[] subjects = { "����", "����", "����" };
	private int tot;
	private double avg;
	private char grade;

	public Student(String input_name) {
		// �����ڿ� ���޵� ���ڿ� ���� �̿��Ͽ� name�� �ʱ�ȭ
		name = input_name;
		// Ŭ������ ��� �ʵ� ��, ��ü Ÿ���� �����ϴ� ��� �ݵ�� �����ڿ��� null �̿��� ������ �ʱ�ȭ
		// (�����ڿ��� �迭�� ����)
		scores = new int[subjects.length];
	}

	public void input() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < subjects.length; i++) {

			do {
				System.out.printf("%s ������ �Է�: ", subjects[i]);
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
			System.out.println("���� ������ 0~100 ���̸� �Է����ּ���");
			return false;
		} else
			return true;
	}

	// Ŭ���� ���ο����� ����� ������ �޼ҵ���
	// private ���� ������ ���� �ֽ��ϴ�.
	// �Ʒ��� setGrade �޼ҵ�� ������ �ԷµǾ�߸�
	// ������ �� �����Ƿ�, private���� ������
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
		System.out.printf("%s �л��� ���� ������ ����մϴ�.\n", name);
		System.out.printf("����: %d, ���: %.2f\n", tot, avg);
		System.out.printf("���: %c\n", grade);
		System.out.println("---------------------------");
	}
}

public class Class_12_Constructor {

	public static void main(String[] args) {
		// �Ʒ��� �ڵ尡 ����� �� �ֵ��� Ŭ������ �ۼ��ϼ���.
		// ���� ���
		// ���� ������ �Է� : 100
		// ���� ������ �Է� : 100
		// ���� ������ �Է� : 100
		// ----------------------------
		// �ƹ��� �л��� ���� ������ ����մϴ�.
		// ���� : 300 ��, ��� 100.00 ��
		// ��� : A
		// ----------------------------
		Student s = new Student("�ƹ���");
		s.input();
		s.output();
	}

}
