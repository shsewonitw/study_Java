import java.util.*;

public class ControlStatement_DO_WHILE_03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
				
		do {
			System.out.print("���α׷��� �����Ϸ��� 100�� �Է��ϼ��� : ");
		} while( sc.nextInt() != 100 );
		
		sc.close();
				
		System.out.println("���α׷� ����");
	}

}