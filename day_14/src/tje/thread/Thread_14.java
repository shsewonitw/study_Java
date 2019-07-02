package tje.thread;


// 커피숍 클래스
class CoffeeShop {
	// 금일의 판매 개수를 저장하는 변수
	private int count;
	// 커피 판매 메소드
	public void buy(double price) {
		// 쓰레드는 각각의 스택공간을 가지고있기 때문에
		// 메소드 내부의 변수는 절대로 꼬이지 않는다
		System.out.printf("%s 님이 %.2f 금액의 커피를 구입했습니다.\n",Thread.currentThread().getName(), price);
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 동기화 영역의 선언을 통한 동기화 처리
		// 특정 메소드의 특정 실행 코드만 동기화를 처리하기 위한 방법
		// 메소드 자체를 동기화 하는 경우 비효율적으로 처리가 될 수 있기 때문에
		// 메소드 내부의 동기화가 필요한 실행코드(멤버필드의 값을 수정하는 코드)만 동기화하는 방법
		synchronized (this) {
			this.count++;	
		}
	}
	
	@Override
	public String toString() {
		return String.format("금일의 판매 개수는 %d개 입니다.\n", this.count);
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
