package tje.abstract_;

// 추상 클래스
// 상속을 통한 다형성의 구현에 강제성을 부여하기 위한 클래스
//  - 추상메소드를 포함할 수 있는 클래스
// 추상메소드 : 메소드의 원형만 존재하고 실제 내용이 없는 메소드

// 추상메소드의 작성방법
// 접근지정자 abstract 리턴값의타입 메소드명 ( 매개변수 );

// 추상클래스의 작성방법
// abstract class 클래스명 {}


abstract class Animal {
	// 메소드 오버라이딩을 통한
	// 다형성 구현을 위한 메소드의 선언
	// (부모클래스의 sound 메소드는 형태만 선언됨)
	public abstract void sound();
}

// 부모클래스의 추상 메소드 sound를 오버라이딩한 강아지 클래스
// 추상메소드는 자식클래스에서 새롭게 재정의 될 수 있습니다.
// 추상메소드를 오버라이딩한 자식클래스는 일반클래스로
// 사용될 수 있습니다.
class Dog extends Animal {	
	public void sound() {
		System.out.println("멍멍~!");
	}
}

// 부모클래스의 추상 메소드 sound를 오버라이딩하지 않으면
// 자식 클래스에서 컴파일 에러가 발생됩니다.
// 추상메소드를 상속받았기 때문에 해당 메소드로 인해서
// 자식클래스도 추상클래스가 됩니다.
// (객체를 생성할 수 없는 클래스)
abstract class Cat extends Animal {
	
}

public class Abstract_02 {
	public static void main(String[] args) {		
		// 추상 클래스는 자신의 객체를 생성할 수 없습니다.
		// 추상 메소드를 포함할 수 있기 때문에
		// (추상클래스는 상속만을 위해서 사용되는 클래스)
		// Animal animal = new Animal();
		
		Animal [] animals = new Animal[3];
		
		// 추상클래스는 컴파일 수준에서
		// 다형성의 구현을 확인할 수 있는 구현방법입니다.
		animals[0] = new Dog();
		// 추상 클래스를 부모클래스로 사용하여
		// 다형성을 구현하는 경우 자식클래스에서
		// 올바르게 기능을 구현했는지 여부를 컴파일러 수준에서
		// 확인할 수 있다.
		// (추상메소드를 오버라이딩 하지 않는 경우 객체의 생성이 불가능)
		// animals[1] = new Cat();
		animals[2] = new Dog();
		for(int i = 0 ; i < animals.length ; i+=2) {
			// 다형성을 통한 메소드 실행
			// 실제 객체의 타입에 따라서 서로 다른 동작을 실행
			// 강아지 : 멍멍~!
			// 고양이 : ?
			animals[i].sound();
		}

	}
}
