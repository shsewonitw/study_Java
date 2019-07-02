import java.util.Scanner;
public class BankApplication {

	private static Account20[] accountArray = new Account20[100];
	static int index =0;
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------");
			System.out.print("����> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {
		System.out.println("-----------");
		System.out.println("���»���");
		System.out.println("-----------");
		System.out.print("���¹�ȣ: ");
		String ano = sc.next();
		System.out.print("������: ");
		String owner = sc.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = sc.nextInt();
		Account20 ac = new Account20(ano,owner,balance);
		accountArray[index] = ac;
		index++;
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
		System.out.println();
		System.out.println();
		
	}
	
	private static void accountList() {
		System.out.println("----------");
		System.out.println("���¸��");
		System.out.println("----------");
		for(int i = 0 ; i < index ; i ++) {
			System.out.printf("%10s %5s %10d\n",accountArray[i].getAno(),accountArray[i].getOwner(),accountArray[i].getBalance());
		}
		System.out.println();
		System.out.println();
	}
	
	private static void deposit() {
		System.out.println("----------");
		System.out.println("����");
		System.out.println("----------");
		System.out.print("���¹�ȣ: ");
		String ano = sc.next();
		System.out.print("���ݾ�: ");
		int balance = sc.nextInt();
		if(findAccount(ano) != null) {
			Account20 ac = findAccount(ano);
			ac.setBalance(ac.getBalance()+balance);
		}else {
			System.out.println("�������� �ʴ� �����Դϴ�");
		}
	}
	
	private static void withdraw() {
		System.out.println("----------");
		System.out.println("���");
		System.out.println("----------");
		System.out.print("���¹�ȣ: ");
		String ano = sc.next();
		System.out.print("��ݾ�: ");
		int balance = sc.nextInt();
		if(findAccount(ano) != null) {
			Account20 ac = findAccount(ano);
			if(ac.getBalance()-balance >=0 ) {
				ac.setBalance(ac.getBalance()-balance);
			} else {
				System.out.println("�ܾ��� �����մϴ�");
			}
		}else {
			System.out.println("�������� �ʴ� �����Դϴ�");
		}
	}
	
	private static Account20 findAccount(String ano) {
		for(int i = 0 ; i < index ; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
}
