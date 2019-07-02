package tje.thread;


// Ŀ�Ǽ� Ŭ����
class CoffeeShop {
	// ������ �Ǹ� ������ �����ϴ� ����
	private int count;
	// Ŀ�� �Ǹ� �޼ҵ�
	public void buy(double price) {
		// ������� ������ ���ð����� �������ֱ� ������
		// �޼ҵ� ������ ������ ����� ������ �ʴ´�
		System.out.printf("%s ���� %.2f �ݾ��� Ŀ�Ǹ� �����߽��ϴ�.\n",Thread.currentThread().getName(), price);
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ����ȭ ������ ������ ���� ����ȭ ó��
		// Ư�� �޼ҵ��� Ư�� ���� �ڵ常 ����ȭ�� ó���ϱ� ���� ���
		// �޼ҵ� ��ü�� ����ȭ �ϴ� ��� ��ȿ�������� ó���� �� �� �ֱ� ������
		// �޼ҵ� ������ ����ȭ�� �ʿ��� �����ڵ�(����ʵ��� ���� �����ϴ� �ڵ�)�� ����ȭ�ϴ� ���
		synchronized (this) {
			this.count++;	
		}
	}
	
	@Override
	public String toString() {
		return String.format("������ �Ǹ� ������ %d�� �Դϴ�.\n", this.count);
	}
}

class CoffeeShopCustomer extends Thread {
	private CoffeeShop shop;
	private double price;
	
	public CoffeeShopCustomer(String name, CoffeeShop shop, double price) {
		super(name);
		this.shop = shop;
		this.price = price;
	}
	
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			this.shop.buy(price);
		}
	}
}

public class Thread_14 {

	public static void main(String[] args) {
		CoffeeShop shop = new CoffeeShop();
		CoffeeShopCustomer c1 = new CoffeeShopCustomer("C1", shop, 3000);
		CoffeeShopCustomer c2 = new CoffeeShopCustomer("C2", shop, 7000);
		CoffeeShopCustomer c3 = new CoffeeShopCustomer("C3", shop, 5000);
		
		c1.start(); c2.start(); c3.start();
		
		try {
			c1.join(); c2.join(); c3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(shop);
		
	}

}
