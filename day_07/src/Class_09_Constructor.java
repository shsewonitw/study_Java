
class D {
	private int age;
	
	// �����ڴ� �޼ҵ��̹Ƿ� �Ű������� ����� �� �ֽ��ϴ�.
	// �������� �Ű������� Ȱ���ϴ� ���
	// ������ ��ü���� ���� �ٸ� ���� ���� �� �ֽ��ϴ�.
	public D(int input_age) {
		System.out.println("�Ű������� ����ϴ� ������ ����");
		age = input_age;
	}
	public void setAge(int input_age) {
		age = input_age;
	}
	
	public int getAge() {
		return age;
	}
}

public class Class_09_Constructor {

	public static void main(String[] args) {
		// ���� Ŭ������ �����ڸ� ����ڰ� ���� �ۼ��ϴ� ���
		// �����Ϸ��� ����Ʈ �����ڸ� �������� �ʽ��ϴ�.
		// D d = new D();
		
		// �Ű������� ������ �����ڸ� ���ؼ� ��ü�� �����ϴ� �ڵ�
		D d1 = new D(10);
		D d2 = new D(22);
		D d3 = new D(33);
		
		System.out.println(d1.getAge());
		System.out.println(d2.getAge());
		System.out.println(d3.getAge());
	}

}
