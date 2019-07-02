class A {
	private int age;

	public void setAge(int input_age) {
		age = input_age;
	}
	
	public int getAge() {
		return age;
	}
	
}
public class Class_06_Constructor {

	public static void main(String[] args) {
		A a = new A();
		
		// ��ü�� ������ ��, ����ʵ��� ���� �����ϸ�
		// HEAP �޸��� Ư���� ���� 0(�Ǵ� null) ������ �ʱ�ȭ�˴ϴ�.
		System.out.println(a.getAge());

		// ���� ��ü�� ����ʵ��� ������ ������ �ʱ�ȭ�� �ϰ��� �Ѵٸ�
		// Ŭ������ ��ü�� ������ ��, ��ü�� �����ϰ��ִ�
		// ����ʵ��� ���� ������ �� �ִ� setter �޼ҵ带 ȣ���ؾ� �մϴ�.
		a.setAge(22);
		System.out.println(a.getAge());
	}

}
