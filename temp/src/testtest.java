

// Ŭ������ ���� ����
// 1. �Ϲ����� Ŭ������ ����
//  - ���� ���ο� class Ű���带 ����Ͽ� Ŭ������ ����
// 2. �͸�(����) Ŭ����
//  - �̸��� ���� Ŭ����
// 3. ��ø Ŭ����
//  - �ٸ� Ŭ������ ���ο� ����Ǵ� Ŭ����

// 2���� �߻�޼ҵ带 �����ϰ� �ִ� �θ� Ŭ����
abstract class Inner_A {
	public abstract void plus(int n1, int n2);
	public abstract void minus(int n1, int n2);
}

// �ڽ� Ŭ������ ����� �߻� �޼ҵ带 �������̵��� ���� 
class Inner_Sub_A extends Inner_A {
	public void plus(int n1, int n2) {
		System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
	}
	
	public void minus(int n1, int n2) {
		System.out.printf("%d - %d = %d\n",n1,n2,n1-n2);
	}
}

public class testtest {

	public static void main(String[] args) {
		Inner_A a = new Inner_Sub_A();
		a.plus(10, 7);
		a.minus(10, 7);
		
		// �͸� Ŭ���� �Ǵ� ���� Ŭ����
		// ��ü�� �����ϸ鼭 �������̵��� �ϴ� Ŭ����
		// �Ϲ�Ŭ����, �߻�Ŭ����, �������̽� ��ο� ������ �����մϴ�.
		// �������̽��� �߻�Ŭ���� Ÿ���� ��ü�� �����ϸ鼭
		// �߻� �޼ҵ带 �������̵� �� �� �ֽ��ϴ�.
		// ������ ������ �޼ҵ� �������̵� �̶��
		// Ŭ������ ���Ӱ� ����� �Ϳ� ���� �ڵ� �ۼ��� 
		// ȿ���� ���� �� �ֽ��ϴ�.
		Inner_A a2 = new Inner_A() {
			public void plus(int n1, int n2) {
				System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
			}
			
			public void minus(int n1, int n2) {
				System.out.printf("%d - %d = %d\n",n1,n2,n1-n2);
			}
		};
		a2.plus(10, 7);
		a2.minus(10, 7);
	}

}
