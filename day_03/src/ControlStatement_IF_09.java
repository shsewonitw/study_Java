import java.util.Scanner;

public class ControlStatement_IF_09 {

	public static void main(String[] args) {
		// �α����� ó���ϴ� ���α׷��� �����ϼ���
		// ID�� PASSWORD�� ��� ����, ID�� nID ���� / PASSWORD�� nPassword�� ����(Ű���� �Է�)
		// �Էµ� ID�� PASSWORD�� 3 �Ǵ� 5�� ����� ��� �α��� ����
		// �ƴ϶�� �α��� ����

		Scanner sc = new Scanner(System.in);
		
		int nID, nPassword;
		
		System.out.print("ID�� �Է��ϼ��� : ");
		nID = sc.nextInt();
		System.out.print("PASSWORD�� �Է��ϼ��� : ");
		nPassword = sc.nextInt();
		
		sc.close();
		
		
		
		
		// ID üũ
		boolean flag_id = nID % 3 ==0 || nID % 5 == 0;
		boolean flag_password = nPassword % 3 ==0 || nPassword % 5 == 0;
		boolean result = flag_id && flag_password;
		
		if ( flag_id ) {
			// ����� ��ø�� ���
			// �ڹ��� ����� ���ο� �Ǵٸ� ����� ������ �� �ִ�
			if ( flag_password ) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ���� - �н����带 Ȯ���ϼ���");
			}
		} else {
			System.out.println("�α��� ���� - ���̵� Ȯ���ϼ���");
		}
			
		
		// ID �Ǵ� PASSWORD �� �� ��������� ������ �߻��ߴ��� Ȯ���� �� ����
		/* if( result )
			System.out.println("�α��� ����");
			else
			System.out.println("�α��� ����");
		*/
		
	}

}
