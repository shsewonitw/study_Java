
class Account {
	// �ܾ� ������ �����ϴ� ����ʵ�
	double balance;
	
	void initBalance(double money) {
		balance = money;
	}
	
	void withraw(double money) {
		balance -= money;
	}
	
	void deposit(double money) {
		balance += money;
	}
	
	void display() {
		System.out.printf("���� �ܾ��� %.2f�� �Դϴ�.\n",balance);
	}
}

public class Class_03_Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		// �ܾ� �ʱ�ȭ
		account.initBalance(10000);
		account.display();
		
		// ���
		account.withraw(5000);
		account.display();
		
		// �Ա�
		account.deposit(30000);
		account.display();
		
		
		// Ŭ������ ����ʵ�/�޼ҵ�� ���������ڿ� ���ؼ�
		// �ܺο����� ������ ������ �� �ֽ��ϴ�.
		// ���������ڸ� ������� �ʴ� ���
		// �Ʒ��� ���� ������ ������ ����ʵ��� ����
		// ������ ������ �� �ֽ��ϴ�.
		account.balance = 100000000;
	}

}
