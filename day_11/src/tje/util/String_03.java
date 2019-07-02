package tje.util;

public class String_03 {

	public static void main(String[] args) {
		// StringBuffer / StringBuilder 클래스
		// String 클래스와 다르게 문자열을 저장하여
		// 수정할 수 있는 클래스

		// StringBuffer/ StringBuilder 클래스의 차이점
		// 멀티쓰레딩 환경에서 값의 수정의 안전함을 보장 -> StringBuffer 클래스
		// 멀티쓰레딩 환경을 지원하지 않음 -> StringBuilder
		// (쓰레드 동기화의 지원 여부)

		// 기본 설정을 사용하여 16글자를 저장할 수 있는 객체를 생성
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();

		// StringBuffer / StringBuilder 클래스의 capacity 메소드
		// 문자열을 최대 저장할 수 있는 크기값을 반환 (기본값은 16)
		// capacity는 동적으로 늘어날 수 있습니다.
		// (16글자 이상이 추가되면 capacity를 확장한 새로운 공간을 할당)
		// capacity는 생성자의 매개변수를 통해서 지정할 수 있습니다.
		// new StringBuffer(1000), new StringBuilder(1000)
		System.out.printf("buffer객체의 허용량 : %d\n", buffer.capacity());
		System.out.printf("builder객체의 허용량 : %d\n", builder.capacity());

		// 문자열을 추가할 수 있는 append 메소드
		// (가장 마지막 위치에 문자열을 추가)
		buffer.append("First, ");
		builder.append("First, ");
		System.out.printf("buffer.capacity : %d, buffer.length : %d\n", buffer.capacity(), buffer.length());
		System.out.printf("builder.capacity : %d, builder.length : %d\n", builder.capacity(), builder.length());

		buffer.append("Second, ");
		builder.append("Second, ");
		System.out.printf("buffer.capacity : %d, buffer.length : %d\n", buffer.capacity(), buffer.length());
		System.out.printf("builder.capacity : %d, builder.length : %d\n", builder.capacity(), builder.length());

		// capacity의 크기를 벗어난 문자열이 추가되므로
		// capacity가 확장된 공간으로 이동하게 됨.
		buffer.append("Third, ");
		builder.append("Third, ");
		System.out.printf("buffer.capacity : %d, buffer.length : %d\n", buffer.capacity(), buffer.length());
		System.out.printf("builder.capacity : %d, builder.length : %d\n", builder.capacity(), builder.length());

		System.out.println(buffer);
		System.out.println(builder);

		buffer.insert(0, "Zero, ");
		builder.insert(0, "Zero, ");
		System.out.printf("buffer.capacity : %d, buffer.length : %d\n", buffer.capacity(), buffer.length());
		System.out.printf("builder.capacity : %d, builder.length : %d\n", builder.capacity(), builder.length());

		System.out.println(buffer);
		System.out.println(builder);

		System.out.printf("Hello`s index : %d\n", buffer.indexOf("Hello"));
		System.out.printf("Hello`s index : %d\n", buffer.indexOf("Third"));

		int search = -1;
		while ((search = buffer.indexOf(", ")) != -1) {
			// ", " 을 제거
			buffer.delete(search, search + ", ".length());
			// "-" 을 추가
			buffer.insert(search, "-");
		}
		System.out.println(buffer);

		// 현재 저장된 글자수로 capacity의 값을 조정
		buffer.trimToSize();
		builder.trimToSize();

		System.out.printf("buffer.capacity : %d, buffer.length : %d\n", buffer.capacity(), buffer.length());
		System.out.printf("builder.capacity : %d, builder.length : %d\n", builder.capacity(), builder.length());

	}

}
