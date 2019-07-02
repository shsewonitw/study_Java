package tje.inner;

//Ŭ������ ���� ����
//1. �Ϲ����� Ŭ������ ����
//- ���� ���ο� class Ű���带 ����Ͽ� Ŭ������ ����
//2. �͸�(����) Ŭ����
//- �̸��� ���� Ŭ����
//3. ��ø Ŭ����
//- �ٸ� Ŭ������ ���ο� ����Ǵ� Ŭ����

// ��ø Ŭ����
// Ŭ���� ���ο� ����� Ŭ����
//  - �ܺ��� ��� ����� �����Ӱ� ������ �� �ִ� Ư¡

class Outer {
	private int out_num;
	public Outer(int out_num, int in_num) {
		this.out_num = out_num;
		// ���� Ŭ������ ��ü ����
		// �ܺ� Ŭ������ ���� Ŭ������ ��ü�� ������ �� ����
		// (Ŭ������ �ܺο����� ���� Ŭ������ ��ü�� ������ �� ����)
		// �Ʒ��� Inner Ŭ������ Outer Ŭ���������� ����� �� �ִ�
		Inner inner = new Inner(in_num);
		inner.printInfo();
	}
	class Inner {
		private int in_num;
		public Inner(int in_num) {
			this.in_num = in_num;
		}
		public void printInfo() {
			// �ܺ� Ŭ������ private ������� ������ ����
			System.out.printf("out_num = %d , in_num = %d\n",out_num,in_num);
		}
	}
}
public class InnerClass_02 {

	public static void main(String[] args) {
		Outer outer = new Outer(10, 20);
		// ������ Ŭ������ �ܺ� Ŭ������ ������ ����� ��ü�� ������ �� �����ϴ�. 
		// Outer.Inner inner = new Outer.Inner(10);
		
		// ���� Ŭ������ ��ü�� �ܺ� Ŭ������ ��ü�� ����ϴ� ���
		// ������ �� ����.
		Outer.Inner inner = outer.new Inner(777);
		inner.printInfo();
	}

}
