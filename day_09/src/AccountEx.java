import java.util.Scanner;

public class AccountEx {
	
	private static Account [] accounts = new Account[100];
	
	public static void printMenu() {
		System.out.println("1. ���»���");
		System.out.println("2. ���¸�� ��ȸ");
		System.out.println("3. �Ա�");
		System.out.println("4. ���");
		System.out.println("5. ���� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("���� : ");
	}
	
	public static boolean checkExit(Scanner kb) {
		System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
		char isExit = kb.next().charAt(0);
		return isExit == 'y'|| isExit == 'Y' ? true : false;
	}
	
	// �迭�� ����� Account Ŭ������ ��ü ������ Ȯ���ϴ� �޼ҵ�
	// ��ȯ�ϴ� ���� ��ü ����
	public static int getAccountSize() {
		int index;
		for( index = 0 ; index < accounts.length ; index++ ) {
			if( accounts[index] == null )
				break;
		}
		return index;
	}
	
	public static boolean checkAccountNumber(String accountNumber) {
		// �迭�� ����� ��� Account Ŭ������ ��ü���� ��ȸ�ϸ�
		// ������ ���¹�ȣ�� ������ �Ǵ��Ͽ� ��ȯ�ϴ� �޼ҵ�
		int lastIndex = getAccountSize();
		for( int i = 0 ; i < lastIndex ; i++ ) {
			// ���ڿ� ���� �񱳸� ���� equals �޼ҵ�
			// ���ڿ�����.equals(���ҹ��ڿ�) -> ������ ���ڿ� true, 
			// �������� ���� ���ڿ��� ��� false
			if( accounts[i].getAccountNumber().equals(accountNumber) )
				return true;
		}
		
		return false;
	}
	
	public static void create(Scanner kb) {
		System.out.println("���� ���� ������ �����մϴ�.");	
		
		String accountNumber = null;
		do {
			if( accountNumber != null )
				System.out.println("�ߺ��� ���¹�ȣ�� �Է��ϼ̽��ϴ�.");
			
			System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
			accountNumber = kb.next();
		} while( checkAccountNumber(accountNumber) );
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = kb.next();
		
		System.out.print("�ʱ� �Աݾ� �Է��ϼ��� : ");
		double balance = kb.nextDouble();
		
		Account account = new Account(accountNumber, name, balance);
		accounts[getAccountSize()] = account;		
	}
	
	public static void select() {
		System.out.println("��ü ���� ������ ����մϴ�.");
		
		for( int i = 0, lastIndex = getAccountSize() ; i < lastIndex ; i++ ) 
			accounts[i].printInfo();
	}
	
	// ���¹�ȣ�� ����Ͽ� �ش� ���°� ����� �迭��
	// �ε����� ��ȯ�ϴ� �޼ҵ�
	public static int searchAccount(String accountNumber) {
		int index, lastIndex = getAccountSize();
		
		for( index = 0 ; index < lastIndex ; index++ ) {
			if( accounts[index].getAccountNumber().equals(accountNumber) )
				break;
		}
		
		return index;
	}
	
	public static void deposit(Scanner kb) {
		System.out.println("�Ա� ������ �����մϴ�.");	
		
		String accountNumber = null;
		do {
			if( accountNumber != null )
				System.out.println("�������� �ʴ� ���¹�ȣ�� �Է��ϼ̽��ϴ�.");
			
			System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
			accountNumber = kb.next();
		} while( !checkAccountNumber(accountNumber) );
		
		System.out.print("�Աݾ��� �Է��ϼ��� : ");
		double balance = kb.nextDouble();
		
		accounts[searchAccount(accountNumber)].printInfo();
		accounts[searchAccount(accountNumber)].deposit(balance);
		accounts[searchAccount(accountNumber)].printInfo();
	}
	
	public static void withraw(Scanner kb) {
		System.out.println("��� ������ �����մϴ�.");	
		
		String accountNumber = null;
		do {
			if( accountNumber != null )
				System.out.println("�������� �ʴ� ���¹�ȣ�� �Է��ϼ̽��ϴ�.");
			
			System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
			accountNumber = kb.next();
		} while( !checkAccountNumber(accountNumber) );
		
		System.out.print("��ݾ��� �Է��ϼ��� : ");
		double balance = kb.nextDouble();
		
		accounts[searchAccount(accountNumber)].printInfo();
		accounts[searchAccount(accountNumber)].withraw(balance);
		accounts[searchAccount(accountNumber)].printInfo();
	}
	
	public static void delete(Scanner kb) {
		System.out.println("���� ���� ������ �����մϴ�.");	
		
		String accountNumber = null;
		do {
			if( accountNumber != null )
				System.out.println("�������� �ʴ� ���¹�ȣ�� �Է��ϼ̽��ϴ�.");
			
			System.out.print("������ ���¹�ȣ�� �Է��ϼ��� : ");
			accountNumber = kb.next();
		} while( !checkAccountNumber(accountNumber) );
		
		int deleteIndex = searchAccount(accountNumber);
		int lastIndex = getAccountSize();
		for( int i = deleteIndex ; i < lastIndex ; i++ )
			accounts[i] = accounts[i+1];
	}
	
	public static void main(String[] args) {		
		 Scanner kb = new Scanner(System.in);
		 int inputNo;
		 
		 do {
			 printMenu();
			 inputNo = kb.nextInt();
			 
			 switch(inputNo) {
			 	case 1:	create(kb); break;
			 	case 2:	select(); break;
			 	case 3:	deposit(kb); break;
			 	case 4:	withraw(kb); break;
			 	case 5:	delete(kb); break;
			 	
			 	case 0:	
			 		// ���� ���θ� ��Ȯ�� ��,
			 		// ���Ḧ ���ϴ� ��� ���� ����
			 		if( !checkExit(kb) )
			 			inputNo = -1;
			 		break;
			 	default :
			 }			 
		 } while(inputNo != 0);
		 
		 System.out.println("���α׷� ����");
	}
}

















