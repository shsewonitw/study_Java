
import java.util.Scanner;

public class ControlStatement_IF_06 {

	public static void main(String[] args) {
		// ���ǽ��� �ټ����� ����� if�� Ȱ����
		Scanner keyboard = new Scanner(System.in);
		
		int menu;
		System.out.println("1.���  2.���  3.����");
		System.out.print("���ϴ� �޴��� �����ϼ��� : ");
		menu = keyboard.nextInt();
		
//		System.out.println(menu);
		
		keyboard.close();
		
		// ����ڰ� �Է��� �޴��� ���� ������ ����
		// if ���� ����Ͽ� ó���ϴ� ��� ��� ���ǽ��� �Ź� �񱳵ȴ�.(���� if ������ ������ �Ǿ �񱳰� ����)
		if( menu == 1 )
			System.out.println("��� �Է�");
		if( menu == 2 )
			System.out.println("��� �Է�");
		if( menu == 3 )
			System.out.println("���� �Է�");
		
		// �ټ����� ���ǽ��� ���Ǵ� ����� if ��
		/*
		 * if ( 1��° ���ǽ� )
		 * 		1��° ���ǽ��� ���� ����� ���๮
		 * else if ( 2��° ���ǽ� )
		 * 		2��° ���ǽ��� ���� ����� ���๮
		 * ...
		 * else
		 * 		��� ���ǽ��� ������ ����� ���๮
		 */
		
		if( menu == 1 )
			System.out.println("��� �Է�");
		else if( menu == 2 )
			System.out.println("��� �Է�");
		else if( menu == 3 )
			System.out.println("���� �Է�");	
	}

}
