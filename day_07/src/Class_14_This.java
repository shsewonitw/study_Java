
class ThisB {
	private int num;
	
	public ThisB(int num) {
		// Ŭ������ ����ʵ��� �޼ҵ��� ������������ �����ϴٸ�
		// �޼ҵ��� ���������� �켱�� �˴ϴ�.
		// �Ʒ��� �ڵ�� �������� num�� �������� num�� ���� ����
		// (��ȭ����)
		num = num;
		
		// ���� ��������� Ŭ������ ����ʵ带 ȣ���ϰ��� �ϴ� ���
		// this Ű���带 Ȱ���Ͽ� ó���� �� �ֽ��ϴ�.
		// �Ʒ��� �ڵ�� ���� �����ڸ� �����ϰ� �ִ� ��ü�� ��������
		// ����Ͽ� ����ʵ� num�� �������� num�� ���� ����
		this.num = num;
	}
	
	public void showInfo() {
		System.out.printf("num = %d\n",num);
	}
}

public class Class_14_This {

	public static void main(String[] args) {

		ThisB obj = new ThisB(100);
		obj.showInfo();

	}

}
