import java.util.Scanner;

public class ControlStatement_SWITCH_05 {

	public static void main(String[] args) {
		// ����ڿ��� 1~12 ������ ������ �Է¹�������
		// �Էµ� ������ �ش�Ǵ� ���� ��¥���� ����ϼ���
		// switch������ �ۼ�
		
		Scanner sc = new Scanner(System.in);
		
		int month, days;
		System.out.print("1 ���� 12 ������ ������ �Է��ϼ��� : ");
		month = sc.nextInt();
		switch( month ) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: days=31; break;
		case 4:
		case 6:
		case 9:
		case 11: days=30; break;
		case 2: days=28; break;
		default: days=-1;
		}

		System.out.println(days==-1?"�߸��Է��ϼ̽��ϴ�.":days);
	}

}
