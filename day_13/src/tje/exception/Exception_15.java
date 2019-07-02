package tje.exception;

// ����� ���� ����ó�� Ŭ������ ����
// throw �� throws Ű���带 ����Ͽ� Ư�� ��ɿ�
// ������ ������ �߻��� ��� ������ ���ܸ� �߻���ų �� ����
// �Ϲ������� Exception, RuntimeException �����
// �ٸ�, �̷� ��� ��� ������ ���ܰ� �߻��Ǿ����� ���������� �Ǵ��� �� ����
// �̷� ������ �ذ��ϱ� ���ؼ� �������� �̸��� ����� 
// ����� ���� ����ó�� Ŭ������ �ۼ��Ͽ� ��������� ��� ������ �߻��Ǿ�����
// ������ �� ����


// ����� ���� ����ó�� Ŭ������ ����
// Exception, RuntimeException Ŭ������ ��ӹ޴� Ŭ����
// Exception : ��ӹ޴� ��� �ݵ�� ����ó���� �ؾ��ϴ� Ŭ����
// RuntimeException : ��ӹ޴� ��� ����ó���� ���������� �� �� �ִ� Ŭ����
class LoginFailException extends RuntimeException {
	private String id;
	private String pw;
	public LoginFailException(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public String getMessage() {

		return String.format("�α��ο� �����߽��ϴ�.(%s,%s)",this.id,this.pw);
	}
	
	 
}

public class Exception_15 {

	// ����� ���� ����ó�� Ŭ������ throws �� �� �ֽ��ϴ�.
	public static void login(String id, String pw) throws LoginFailException{
		// �α��� ó��
		if( id.equals(pw))
			System.out.println("�α��� ����");
		else
			// �α��ο� �����ϴ� ��� ���ܸ� �߻�����
			// ���� �޼ҵ带 ȣ���� �������� ��ȯ��
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
