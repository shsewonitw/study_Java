
class SuperD {
	private int num_super;
	
	public SuperD(int num_super) {
		this.num_super = num_super;
	}
}

class SubD extends SuperD {
	private int num_sub;
	
	public SubD() {
		// 자식클래스의 생성자 메소드 1번째 실행코드는
		// this, super 만 가능합니다.
		//  - 부모클래스의 생성자 호출을 단 1번만 하기 위해서...
		super(10);
		System.out.println("자식클래스의 디폴트 생성자 실행");
	}
	public SubD(int num_sub) {
		// super(10);
		// 아래와 같이 자식클래스의 생성자에서 this 키워드를 사용한 
		// 생성자 호출이 정의되면 컴파일러는 super() 를 추가하지 않습니다.
		this();
		System.out.println("자식클래스의 매개변수가 선언된 생성자 실행");
	}
}

public class Class_31_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
