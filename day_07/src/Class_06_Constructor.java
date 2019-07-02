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
		
		// 객체를 생성한 후, 멤버필드의 값을 추출하면
		// HEAP 메모리의 특성에 따라 0(또는 null) 값으로 초기화됩니다.
		System.out.println(a.getAge());

		// 만약 객체의 멤버필드의 임의의 값으로 초기화를 하고자 한다면
		// 클래스의 객체를 생성한 후, 객체가 포함하고있는
		// 멤버필드의 값을 설정할 수 있는 setter 메소드를 호출해야 합니다.
		a.setAge(22);
		System.out.println(a.getAge());
	}

}
