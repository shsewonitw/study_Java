
class C {
	private int age;
	
	// ���� Ŭ������ �����ϸ鼭 �����ڸ� �ۼ����� ���� ���
	// �ڹ� �����Ϸ��� ���ؼ� �Ʒ��� ���� ������ �ڵ尡 �߰��˴ϴ�.
	// ����Ʈ ������ : �Ű������� ����, �����ڵ尡 ���� �⺻ ������
	// public C() {}
	
	public void setAge(int input_age) {
		age = input_age;
	}
	
	public int getAge() {
		return age;
	}
}

public class Class_08_Constructor {

	public static void main(String[] args) {
		// ����Ʈ �����ڸ� ���ؼ� ��ü�� �����Ǵ� ����
		C c = new C();

	}

}
