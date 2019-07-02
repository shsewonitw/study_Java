class SuperE {
	public SuperE() {
		this(1);
		System.out.println("SuperE()");
	}
	public SuperE(int arg) {
		this(1.1);
		System.out.println("SuperE(int)");
	}
	public SuperE(double arg) {
		this("");
		System.out.println("SuperE(double)");
	}
	public SuperE(String arg) {
		System.out.println("SuperE(String)");
	}
}
class SubE extends SuperE {	
	public SubE() {
		this(1);
		System.out.println("SubE()");
	}
	public SubE(int arg) {
		this(1.1);
		System.out.println("SubE(int)");
	}
	public SubE(double arg) {
		this("");
		System.out.println("SubE(double)");
	}
	public SubE(String arg) {
		super();
		System.out.println("SubE(String)");
	}
}


public class Class_32_Extends {
	public static void main(String[] args) {
		SubE s = new SubE();
	}
}
