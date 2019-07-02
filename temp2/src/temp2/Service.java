package temp2;

public abstract class Service {
	public void service() {
		System.out.println("Service클래스의 service 메소드");
	}
	
	protected abstract void test();
}
