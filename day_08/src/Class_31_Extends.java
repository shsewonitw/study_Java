
class SuperD {
	private int num_super;
	
	public SuperD(int num_super) {
		this.num_super = num_super;
	}
}

class SubD extends SuperD {
	private int num_sub;
	
	public SubD() {
		// �ڽ�Ŭ������ ������ �޼ҵ� 1��° �����ڵ��
		// this, super �� �����մϴ�.
		//  - �θ�Ŭ������ ������ ȣ���� �� 1���� �ϱ� ���ؼ�...
		super(10);
		System.out.println("�ڽ�Ŭ������ ����Ʈ ������ ����");
	}
	public SubD(int num_sub) {
		// super(10);
		// �Ʒ��� ���� �ڽ�Ŭ������ �����ڿ��� this Ű���带 ����� 
		// ������ ȣ���� ���ǵǸ� �����Ϸ��� super() �� �߰����� �ʽ��ϴ�.
		this();
		System.out.println("�ڽ�Ŭ������ �Ű������� ����� ������ ����");
	}
}

public class Class_31_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
