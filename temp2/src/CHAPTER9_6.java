

class NotExistIDException extends Exception{
	String message;
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		this.message= message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
class WrongPasswordException extends Exception {
	String message;
	public WrongPasswordException () {}
	public WrongPasswordException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}

public class CHAPTER9_6 {
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		
		// id 가 "blue"가 아니라면 NotExistIDException 발생시킴
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		// password가 "12345"가 아니라면  WrongPaaswordException 발생시킴
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
	public static void main(String[] args) {
		
		try{
			login("white","12345");}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try{
			login("blue","54321");}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
