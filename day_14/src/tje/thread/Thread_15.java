package tje.thread;

// ���� ��ü Ŭ����
class Store {
	private static final int MAX_PRODUCT = 10;
	private int productCount = 5;
	
	// ��ǰ�� ����� �޼ҵ�
	//  - ���� �����忡 ���ؼ� ����Ǵ� �޼ҵ�
	public void make() {
		this.productCount++;
		System.out.printf("������ ��ǰ������ %d ���� ������Ŵ\n",this.productCount);
	}
	
	// ��ǰ�� �Ǹ��ϴ� �޼ҵ�
	//  - �� �����忡 ���ؼ� ����Ǵ� �޼ҵ�
	public void buy() {
		this.productCount--;
		System.out.printf("���� ��ǰ������ %d ���� ���ҽ�Ŵ\n",this.productCount);
	}
}

class Emp extends Thread {
	private Store store;
	private int sleepTime;
	
	public Emp(Store store,int sleepTime) {
		this.store = store;
		this.sleepTime = sleepTime;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(this.sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.store.make();
		}
	}
}

class Customer extends Thread {
	private Store store;
	private int sleepTime;
	
	public Customer(Store store,int sleepTime) {
		this.store = store;
		this.sleepTime = sleepTime;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(this.sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.store.buy();
		}
	}
}

public class Thread_15 {

	public static void main(String[] args) {
		// ������ ���� �����ϴ� ���� ��ü�� ����
		Store store = new Store();
		
		// ���� ������ ��ü�� ����
		Emp emp = new Emp(store,500);
		// �� ������ ��ü�� ����
		Customer customer = new Customer(store,1500);
		
		emp.start();
		customer.start();
		
	}

}
