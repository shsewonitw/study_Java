
public class Account {
	private String accountNumber;
	private String name;
	private double balance;
	
	public Account(String accountNumber, String name, double balance) {	
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public void printInfo() {
		System.out.printf("(%s) %s ���� ���� �ܾ��� %.2f �� �Դϴ�.\n", 
				this.accountNumber, this.name, this.balance);
	}
	
	public void withraw(double balance) {
		if( this.balance < balance ) {
			System.out.println("(ERROR)�ܾ��� �����մϴ�.");
			return;
		}
		
		this.balance -= balance;		
	}

	public void deposit(double balance) {
		if( balance <= 0 ) {
			System.out.printf("(ERROR)�Ա��� �ݾ��� Ȯ���ϼ��� - %.2f\n", balance);
			return;
		}
		
		this.balance += balance;		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
