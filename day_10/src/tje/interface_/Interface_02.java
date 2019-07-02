package tje.interface_;

//인터페이스는 멤버필드로 public static final 멤버만 가질 수 있습니다.
//인터페이스는 멤버메소드로 public abstract 메소드만 가질 수 있습니다.
interface Inter_B {
	public static final int RED = 10;
	// 인터페이스 내부에 선언되는 멤버필드는
	// public static final 을 생략할 수 있습니다.
	int BLUE = 20;
	
	public abstract void test1();
	// 인터페이스 내부에 선언되는 메소드는
	// public abstract 을 생략할 수 있습니다.
	void test2();
}

public class Interface_02 {

	public static void main(String[] args) {

	}

}
