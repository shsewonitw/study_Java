import java.util.Scanner;

public class Method_08 {
	public static int getStudentNumber(Scanner kb) {
		System.out.print("�л� ���� �Է��ϼ��� : ");
		return kb.nextInt();
	}
	public static int getSubjectNumber(Scanner kb) {
		System.out.print("���� ���� �Է��ϼ��� : ");
		return kb.nextInt();
	}
	public static void input(Scanner kb, int [][] scores) {
		// ������ �迭�� ������ �Է¹޴� ����

		
		for( int i = 0 ; i < scores.length ; i++ ) {
			
			System.out.printf("%d��° �л��� ���� �Է��� �����մϴ�.\n", i+1);
			input(kb, scores[i]);
			
		}
	}
	public static void input(Scanner kb, int [] scores) {
		// ������ �迭�� ������ �Է¹޴� ����
		for( int i = 0 ; i < scores.length ; i++ ) {
			do {
			System.out.printf("%d��° ������ �Է��ϼ��� : ", i+1);
			scores[i] = kb.nextInt();
			}while(scores[i]<0||scores[i]>100);
		}
	}
	public static void output(int [][] scores) {
		System.out.println("======================");
		System.out.println("���� ����� �����մϴ�.");
		System.out.println("======================");
		
		for( int i = 0 ; i < scores.length ; i++ ) 
			System.out.printf("%d��° �л��� ���� : %d ��, ��� : %.2f ��, ����� %c �Դϴ�.\n",
					i+1, getTotal(scores[i]), getAverage(scores[i]), getGrade(scores[i]));
		
		
	}
	public static int getTotal(int [] scores) {
		int tot = 0;
		for( int i = 0 ; i < scores.length ; i++ )
			tot += scores[i];
		return tot;
	}
	public static double getAverage(int [] scores) {		
		return (double)getTotal(scores) / scores.length;
	}
	
	public static char getGrade(int [] scores){
		double avg = getAverage(scores);
		char grade;
		if(avg>=90) grade='A';
		else if(avg>=80) grade='B';
		else if(avg>=70) grade='C';
		else if(avg>=60) grade='D';
		else grade='F';
		return grade;
	}
	public static void main(String[] args) {
		// ����ڿ��� �л����� �Է¹��� ��, ������� �Է¹�������
		// �Էµ� �л����� ���缭 ���� ������ �Է¹ް�
		// ������ ����� ����ϼ���.
		Scanner kb = new Scanner(System.in);
		int [][] scores;
		
		scores = new int[getStudentNumber(kb)][getSubjectNumber(kb)];
		// System.out.println(scores.length);
		// System.out.println(scores[0].length);
		
		input(kb, scores);
		output(scores);
		
		kb.close();
		System.out.println("���α׷� ����");
	}

}













