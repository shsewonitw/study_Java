//interface Action {
//	void work();
//}
//
//
//public class ActionExample {
//
//	public static void main(String[] args) {
//		
//		Action action = new Action() {
//			public void work() {
//				System.out.println("���縦�մϴ�");
//			}
//		};
//				
//		action.work();
//
//	}
//}


abstract class A {
	void a() { System.out.println("gd");}
}

public class ActionExample {
	public static void main(String[] args) {
		A a = new A() {
			public void a() {
				System.out.println("1111");
			}
		};
		a.a();
	}
}