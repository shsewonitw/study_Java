
class SuperC {
	private int num_super;
	
	
	// ��Ӱ��踦 ����� ����Ʈ ������(���� ������)
	public SuperC() {};
	
	public SuperC(int num_super) {
		this.num_super = num_super;
	}
}

class SubC extends SuperC {
	private int num_sub;
	
	public SubC(int num_sub) {
		// �θ�Ŭ������ ����Ʈ �����ڰ� �������� �ʴ� ���
		// �ݵ�� ��������� �θ�Ŭ������ �Ű������� ������
		// �����ڸ� ȣ���ؾ߸� ������ ������ ������ �� �ֽ��ϴ�.
		
		// �θ�Ŭ������ int Ÿ���� �Ű������� ���޹޴� �����ڸ� 
		// ��������� ȣ���ϴ� ����
		super(1);
		this.num_sub = num_sub;
	}
}

public class Class_30_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
