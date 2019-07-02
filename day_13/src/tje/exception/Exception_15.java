package tje.exception;

// 사용자 정의 예외처리 클래스의 선언
// throw 와 throws 키워드를 사용하여 특정 기능에
// 논리적인 문제가 발생한 경우 강제로 예외를 발생시킬 수 있음
// 일반적으로 Exception, RuntimeException 사용함
// 다만, 이런 경우 어떠한 문제로 예외가 발생되었는지 직관적으로 판단할 수 없음
// 이런 문제를 해결하기 위해서 직관적인 이름을 사용한 
// 사용자 정의 예외처리 클래스를 작성하여 명시적으로 어떠한 문제가 발생되었는지
// 전달할 수 있음


// 사용자 정의 예외처리 클래스의 선언
// Exception, RuntimeException 클래스를 상속받는 클래스
// Exception : 상속받는 경우 반드시 예외처리를 해야하는 클래스
// RuntimeException : 상속받는 경우 예외처리를 선택적으로 할 수 있는 클래스
class LoginFailException extends RuntimeException {
	private String id;
	private String pw;
	public LoginFailException(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public String getMessage() {

		return String.format("로그인에 실패했습니다.(%s,%s)",this.id,this.pw);
	}
	
	 
}

public class Exception_15 {

	// 사용자 정의 예외처리 클래스는 throws 될 수 있습니다.
	public static void login(String id, String pw) throws LoginFailException{
		// 로그인 처리
		if( id.equals(pw))
			System.out.println("로그인 성공");
		else
			// 로그인에 실패하는 경우 예외를 발생시켜
			// 현재 메소드를 호출한 지점으로 반환함
			throw new LoginFailException(id, pw);
	}
	
	public static void main(String[] args) {
		try {
			login("Hello", "Hellao");
		}catch(LoginFailException e){
			System.out.println(e.getMessage());
		}
	}

}
