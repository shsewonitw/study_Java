
// if �� : ���ǽ��� ����� ���� ���๮�� ������ ����
// switch �� : ���� �Ǵ� ������ ��ȯ�ϴ� ���� ����� ����Ͽ� 
//             ���๮�� �б��ϴ� ���
/*
	switch( ����/������ ��ȯ�ϴ� ��/���� ) {
		case ��1 :	// if( �Է°� == ��1 )
			���๮;
			break;
		case ��2 :	// else if( �Է°� == ��2 )
			���๮;
			break;
		...
		default :	// else
			���๮;
	}
*/

import java.util.Scanner;
public class ControlStatement_SWITCH_01 {
	public static void main(String[] args) {		
		Scanner kb = new Scanner(System.in);
		
		int menu;
		System.out.println("1.���  2.���  3.����");
		System.out.print("���ϴ� �޴��� �����ϼ��� : ");
		menu = kb.nextInt();
		kb.close();
		
		switch( menu ) {
			// menu ������ ���� 1�ΰ�� ����Ǵ� ����
			case 1:	// if( menu == 1 )
				System.out.println("������ ����� �Ŷ��");
				break;
			// menu ������ ���� 2�ΰ�� ����Ǵ� ����
			case 2:	// else if( menu == 2 )
				System.out.println("������ ����� ġ����");
				break;
			// menu ������ ���� 3�ΰ�� ����Ǵ� ����
			case 3:	// else if( menu == 3 )
				System.out.println("������ ���δ� �Ұ����");
				break;
			// menu ������ ��� case�� �ش���� �ʴ� ��� ����Ǵ� ����
			default :	// else
				System.out.println("�߸��� ��ȣ�� �����߽��ϴ�.");
		}
	}
}













