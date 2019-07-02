
// static Ű����� ��ü���⿡�� ������ ���Ͽ� ����ϰ� Ȱ��Ǵ� ����
// �̱��� ���� : static Ű���带 Ȱ���ϴ� ��ǥ���� ������ ���� 
//  - Ư�� Ŭ������ ��ü�� �ݵ�� 1���� ������ �� �ֵ��� �����ϴ� ����

class SingletonEx {
	
	// ��ü�� ���� �� �ڵ����� ȣ��Ǵ� �޼ҵ�
	//  - ������ �޼ҵ�
	//  - �������� ������ �����ϸ� ��ü�� ������ ������ �� �ֽ��ϴ�.
	//  - public ���� ���ǵ� �����ڴ� ��ü�� ������� ������ �� �ֽ��ϴ�. 
	//  - private ���� ���ǵ� �����ڴ� ��ü�� ������ �ܺο��� �� �� ������ �����մϴ�.
	// public SingletonEx() {}
	private SingletonEx() {
		System.out.println("SingtonEx Ŭ������ ��ü ����");
	}
	
	// ���� Ŭ������ ��ü�� �����ϴ� ����
	private static SingletonEx instance = null;
	
	// ���� Ŭ������ ��ü�� ��ȯ�� �� �ִ� static �޼ҵ��� ����
	public static SingletonEx getInstance() {
		// ��ü�� ������ �� �ѹ��� ������ �� �ֵ��� �����ϴ� �ڵ�
		if( instance == null )
			instance = new SingletonEx();
		
		return instance;
		// private ���� ���ǵ� �����ڴ� Ŭ������ ���ο����� �����Ӱ� ������ �� �ֽ��ϴ�.
		// return new SingletonEx();
	}
}
public class Class_25_Static {

	public static void main(String[] args) {

		// private ���� ���ǵ� �����ڴ� Ŭ������ �ܺο��� ��ü�� ������ �� ������ �����մϴ�.
		// SingletonEx s1 = new SingletonEx();
		// SingletonEx s2 = new SingletonEx();
		// SingletonEx s3 = new SingletonEx();
		
		SingletonEx s1 = SingletonEx.getInstance();
		SingletonEx s2 = SingletonEx.getInstance();
		SingletonEx s3 = SingletonEx.getInstance();
	}

}
