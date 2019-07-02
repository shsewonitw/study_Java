
// Ư�� Ŭ������ ��ü ���� ���� ĳ����
class StaticC {
	private int num;
	private static int COUNT;
	
	public StaticC(int num) {
		this.num = num;
		COUNT++;
	}
	
	public void showInfo() {
		System.out.printf("num = %d, COUNT = %d\n",num,COUNT);
	}
}

public class Class_20_Static {

	public static void main(String[] args) {
		StaticC c1 = new StaticC(100);
		c1.showInfo();
		StaticC c2 = new StaticC(200);
		c2.showInfo();
		StaticC c3 = new StaticC(300);
		c3.showInfo();
		
		c1.showInfo(); c2.showInfo(); c3.showInfo();
	}

}
