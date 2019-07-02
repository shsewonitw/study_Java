import java.util.Scanner;
public class BankApplication {

	private static Account20[] accountArray = new Account20[100];
	static int index =0;
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			
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
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("계좌주: ");
		String owner = sc.next();
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();
		Account20 ac = new Account20(ano,owner,balance);
		accountArray[index] = ac;
		index++;
		System.out.println("결과: 계좌가 생성되었습니다.");
		System.out.println();
		System.out.println();
		
	}
	
	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		for(int i = 0 ; i < index ; i ++) {
			System.out.printf("%10s %5s %10d\n",accountArray[i].getAno(),accountArray[i].getOwner(),accountArray[i].getBalance());
		}
		System.out.println();
		System.out.println();
	}
	
	private static void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("예금액: ");
		int balance = sc.nextInt();
		if(findAccount(ano) != null) {
			Account20 ac = findAccount(ano);
			ac.setBalance(ac.getBalance()+balance);
		}else {
			System.out.println("존재하지 않는 계좌입니다");
		}
	}
	
	private static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("출금액: ");
		int balance = sc.nextInt();
		if(findAccount(ano) != null) {
			Account20 ac = findAccount(ano);
			if(ac.getBalance()-balance >=0 ) {
				ac.setBalance(ac.getBalance()-balance);
			} else {
				System.out.println("잔액이 부족합니다");
			}
		}else {
			System.out.println("존재하지 않는 계좌입니다");
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
