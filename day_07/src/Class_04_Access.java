// ����������
// ��� Ŭ������ ����� ���ǿ� �����ϴ� ����� �����ν�, �������� ������ ���Ǵ� �Ͱ�
// ���Ǹ� �ȵǴ� ������ �ֽ��ϴ�.
// ���������ڴ� Ŭ������ ����鿡 ���� ������ �����ϴ� Ű���� �Դϴ�.
// private : Ŭ���� ���ο����� ��밡���� ����� �����ϴ� Ű����
// public : ���ٿ� ������ ���� ����� �����ϴ� Ű����

class AccountWithPermission {
	// ��������
	// Ŭ���� ���ο� ����� ����ʵ���� ���ǿ� �����ϴ� �����
	// ������ �����մϴ�. �Ϲ������� �̷��� �������� ����������
	// �����ؼ��� �ȵ˴ϴ�. �̷��� ������ ��� ����ʵ����
	// private ���� �����ϰ�, ����ʵ���� ������ �� �ִ� �޼ҵ����
	// public ���� �����մϴ�.
	// Ŭ���� �ܺο����� ������ ���ܵ�
	// �ܾ� ������ �����ϴ� ����ʵ�
	private double balance;
	
	public void initBalance(double money) {
		balance = money;
	}
	
	public void withraw(double money) {
		// ���������� �����ϴ� �ڵ�
		// (���������� ����)
		if( balance < money ) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
			
		balance -= money;
	}
	
	public void deposit(double money) {
		// ���������� �����ϴ� �ڵ�
		// (���������� ����)
		if( money < 0 ) {
			System.out.println("�Ա� �ݾ׿� ������ �߻��߽��ϴ�.");
			System.out.println("�����ڿ��� �����ϼ���.");
			return;
		}
		balance += money;
	}
	
	public void display() {
		System.out.printf("���� �ܾ��� %.2f�� �Դϴ�.\n",balance);
	}
}
public class Class_04_Access {

	public static void main(String[] args) {
		AccountWithPermission a = new AccountWithPermission();
		
		// public ���������ڰ� ����� ����ʵ�/�޼ҵ��
		// Ŭ������ �ܺο��� ������ �� �ִ� ��� �Դϴ�.
		a.initBalance(10000);
		a.display();
		
		a.withraw(5000);
		a.display();
		
		a.deposit(500000);
		a.display();
		
		// private ������ ����� Ŭ���� �ܺο����� ������ ���ܵ˴ϴ�.
		// a.balance = 10000;
		

	}

}
