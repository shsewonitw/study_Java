import java.util.Scanner;

public class ControlStatement_SWITCH_03 {

	public static void main(String[] args) {
		// ����ڿ��� 1~10 ������ ������ �Է¹�������.
		// �Էµ� �������� 10 ������ ������ ��� ����ϼ���.
		// (SWITCH���� ����ϼ���)
		// <����>
		// 1~10������ ������ �Է� : 5
		// <5, 6, 7, 8, 9, 10>
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("1~10������ ������ �Է��ϼ��� : ");
		number = sc.nextInt();
		
		String result = "<";
		
		// break Ű���� ���°� Ȱ��
		switch( number ) {
		case 1: result += "1, ";
		case 2: result += "2, ";
		case 3:	result += "3, ";
		case 4:	result += "4, ";
		case 5:	result += "5, ";
		case 6:	result += "6, ";
		case 7:	result += "7, ";
		case 8:	result += "8, ";
		case 9:	result += "9, ";
		case 10: result += "10>"; break;
		default: result += "ERROR! ���� ���� ������ �Է��ϼ���>";
		}
		
		System.out.println(result);
		

	}

}