

// �޼ҵ� �������̵�
// �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� ������ �ϴ� ����
// ��Ģ
// 1. �޼ҵ��� ������ �����ؾ���(���ϰ��� Ÿ��, �޼ҵ��, �Ű�����)
// 2. ������������ ������ ��ҵ� �� �����ϴ�. 
//    (�θ�Ŭ������ ���۷��� ������ ����Ͽ� ���ٵ� �� �ֱ� ������
//     �θ�Ŭ������ ���۷����� �����ϰ� �ִ� ���ٹ����� ����� �� ����)
// 3. �θ�Ŭ������ �޼ҵ忡�� throws �ϴ� ����ó�� Ŭ�������� 
//    ����Ŭ������ throws �� �� �����ϴ�.

class Super {
	public void print() throws NullPointerException {
		System.out.println("�θ� �޼ҵ� ����");
	}
}

class Sub extends Super {
	public void print() throws NullPointerException {
		System.out.println("�ڽ� �޼ҵ� ����");
	}
}
public class Exception_14 {

	public static void main(String[] args) {
		Super s = new Sub();
		s.print();
		
		
		// �θ�Ŭ������ ���۷��� ������ �����ϴ� ���
		// NullPointerException e = s.print();
		// NullPointerException e = throws new NullPointerException();
		
		// ���� ����Ǵ� ���
		// �ڽ� Ŭ������ ���۷����� �θ�Ŭ������ ��ü�� �����ϴ� ���°� �ǹǷ�
		// �ڽ� Ŭ�������� �������̵� �ϴ� �޼ҵ�� �θ�Ŭ�������� throws �ϴ� 
		// ����Ŭ�������� ���� Ŭ������ throws �� �� �����ϴ�.
		// NullPointerException e = throws new Exception();

	}

}
