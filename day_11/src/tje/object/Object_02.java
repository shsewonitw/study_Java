package tje.object;

// toString �޼ҵ��� ���
// toString �޼ҵ�� Ŭ������ ��ü ������ ���ڿ��� ��ȯ�ϴ� ���
// ��ü�� Ŭ������ + '@' + �ؽ��ڵ尪(16����)
// ����� ���� Ŭ����(���� ������ Ŭ����)�� toString �޼ҵ带
// �������̵��Ͽ� �����ϰ� Ŭ������ ������ ���ڿ��� ������ �� ����

class Object_B {}


// 2���� ����� ���� ��ǥ�� �����ϴ� Ŭ����
class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString() {
		String result;
		result = "(" + this.hashCode() + ") X : " + this.x + ", Y : " + this.y;
		return result;
	}
}

public class Object_02 {

	public static void main(String[] args) {
		Object_B obj = new Object_B();
		
		System.out.println(obj.toString());
		
		// ��ü�� toString �޼ҵ尡 ȣ��Ǵ� ���
		// 1. ��¸޼ҵ��� �Ű�������
		// ��ü�� ���۷��� ���� �����ϴ� ���
		// (�ش� ��ü�� Object Ÿ������ ���޹޾� 
		//  toString �޼ҵ带 �ڵ����� ����)
		System.out.println(obj);
		
		// 2. ��ü�� ���۷��� ������ ���ؼ�
		// ���ڿ� ������ ����Ǵ� ���
		String msg = "obj = " + obj;
		System.out.println(msg);
		
		// Point Ŭ������ ��ü ���� ��, ��ǥ ������ Ȯ��
		Point p = new Point(53, 17);
		System.out.printf("(%d) X = %d, Y = %d\n",p.hashCode(),p.getX(),p.getY());
		
		// �������̵� �� toString �޼ҵ带 ���ؼ�
		// Ŭ������ ������ Ȯ���� �� ����
		System.out.println(p);
	}

}
