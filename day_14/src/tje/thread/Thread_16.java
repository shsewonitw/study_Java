package tje.thread;

// ���� ��ü Ŭ����
class StoreWithSync {
	private static final int MAX_PRODUCT = 10;
	private int productCount = 5;

	// ��ǰ�� ����� �޼ҵ�
	// - ���� �����忡 ���ؼ� ����Ǵ� �޼ҵ�

	// �����ڿ����� ���Ǵ� Ŭ������ �޼ҵ� ���ο���
	// wait / notify �޼ҵ尡 ȣ��Ǵ� ���
	// �ش� �޼ҵ�� �ݵ�� ����ȭ�� �����Ǿ�߸� �մϴ�.
	public synchronized void make() {
		this.productCount++;
		System.out.printf("������ ��ǰ������ %d ���� ������Ŵ\n", this.productCount);

		// ����ϰ� �ִ� ������ �˸�
		this.notify();

		if (this.productCount == MAX_PRODUCT) {
			System.out.println("��ǰ�� �� ������ �� ��� ������ �޽� �ð��� ����");

			// ���� �����带 ���� ���� ��ü���� �������·� ����
			// wait ���¿� ������ ������� ���� ������(��)�� ���ؼ�
			// notify �޼ҵ尡 ȣ��Ǿ�߸� �ٽ� Ȱ��ȭ �� �� ����
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("���� ȣ���Ͽ� �ٽ� ������ ����� ������");
		}
	}

	// ��ǰ�� �Ǹ��ϴ� �޼ҵ�
	// - �� �����忡 ���ؼ� ����Ǵ� �޼ҵ�
	public synchronized void buy() {

		if (this.productCount == 0) {
			System.out.println("��ǰ�� ������ �� ��� ���� �����¿� ��");

			// �� �����带 ���� ���� ��ü���� �������·� ����
			// wait ���¿� ������ ������� ���� ������(����)�� ���ؼ�
			// notify �޼ҵ尡 ȣ��Ǿ�߸� �ٽ� Ȱ��ȭ �� �� ����
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("��ǰ�� �غ�Ǿ� ���� ���Ÿ� ������");
		}

		this.productCount--;
		System.out.printf("���� ��ǰ������ %d ���� ���ҽ�Ŵ\n", this.productCount);

		// ����ϰ� �ִ� �������� �˸�
		this.notify();
	}
}

class EmpWithSync extends Thread {
	private StoreWithSync store;
	private int sleepTime;

	public EmpWithSync(StoreWithSync store, int sleepTime) {
		this.store = store;
		this.sleepTime = sleepTime;
	}

	public void run() {
		while (true) {
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

class CustomerWithSync extends Thread {
	private StoreWithSync store;
	private int sleepTime;

	public CustomerWithSync(StoreWithSync store, int sleepTime) {
		this.store = store;
		this.sleepTime = sleepTime;
	}

	public void run() {
		while (true) {
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

public class Thread_16 {

	public static void main(String[] args) {
		// ������ ���� �����ϴ� ���� ��ü�� ����
		StoreWithSync store = new StoreWithSync();

		// ���� ������ ��ü�� ����
		EmpWithSync emp = new EmpWithSync(store, 1000);
		// �� ������ ��ü�� ����
		CustomerWithSync customer = new CustomerWithSync(store, 500);

		emp.start();
		customer.start();

	}

}
