import java.util.Scanner;
public class Exercise07 {

	public static void main(String[] args) {

		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------");
			System.out.print("����> ");
			
			switch(sc.nextInt()) {
				case 1:
					System.out.print("���ݾ�> ");
					balance += sc.nextInt();
					break;
				case 2:
					System.out.print("��ݾ�> ");
					balance -= sc.nextInt();
					break;
				case 3:
					System.out.println("�ܰ�> "+balance);
					break;
				case 4:
					run = false;
					break;
				default :
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			
		}
		sc.close();

		System.out.println("���α׷� ����");
	}

}