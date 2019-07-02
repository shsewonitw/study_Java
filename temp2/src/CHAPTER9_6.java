

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
		
		// id �� "blue"�� �ƴ϶�� NotExistIDException �߻���Ŵ
		if(!id.equals("blue")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}
		// password�� "12345"�� �ƴ϶��  WrongPaaswordException �߻���Ŵ
		if(!password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
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
