
class GetSetTest {
	// Ŭ������ ����ʵ� ����
	// ��� ����ʵ���� private���� �����ϴ� ���
	// �ܺο����� ������ ���ѵ˴ϴ�.
	// �̷��� ��� ������ ����ʵ忡 ���ؼ� ���� �����ϰų�
	// ���� Ȯ���� �� �ִ� �߰����� �޼ҵ带 �����ؾ��մϴ�.
	// �ڹٿ����� Setter, Getter �޼ҵ带 ����Ͽ�
	// �̸� ó���� �� �ֽ��ϴ�.
	// Setter �޼ҵ� : Ư�� ����ʵ��� ���� ������ �� �ִ� �޼ҵ�
	// Setter �޼ҵ��� �۸��Ģ : void set����ʵ����̸�(����ʵ��� ù���ڴ� �빮��)
	// Getter �޼ҵ� : Ư�� ����ʵ��� ���� ��ȯ�� �� �ִ� �޼ҵ�
	// Getter �޼ҵ��� �۸��Ģ : ����ʵ���Ÿ�� get����ʵ����̸�(����ʵ��� ù���ڴ� �빮��)
	private int n1;
	private int n2;
	private double d;
	private float f;
	private char c;
	private boolean b;
	private String s;

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public float getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

}

public class Class_05_GettersAndSetters {

	public static void main(String[] args) {
		GetSetTest obj = new GetSetTest();
		// private ���� ������ ����� �ܺο����� ������ ���ܵ˴ϴ�.
		// obj.n1=10;
		obj.setN1(100);
		System.out.println(obj.getN1());

	}

}
