import java.util.Scanner;

public class ControlStatement_IF_08 {

	public static void main(String[] args) {
		// �α����� ó���ϴ� ���α׷��� �����ϼ���
		// ID�� PASSWORD�� ��� ����, ID�� nID ���� / PASSWORD�� nPassword�� ����(Ű���� �Է�)
		// �Էµ� ID�� PASSWORD�� ���� 3 �Ǵ� 5�� ����� ��� �α��� ����
		// �ƴ϶�� �α��� ����

		Scanner sc = new Scanner(System.in);
		
		int nID, nPassword;
		int sum;
		
		System.out.print("ID�� �Է��ϼ��� : ");
		nID = sc.nextInt();
		System.out.print("PASSWORD�� �Է��ϼ��� : ");
		nPassword = sc.nextInt();
		
		sc.close();
		
		sum = nID + nPassword;
		
		if( sum%3 == 0 || sum%5 == 0 )
			System.out.println("�α��� ����");
		else
			System.out.println("�α��� ����");
		
		
	}

}
