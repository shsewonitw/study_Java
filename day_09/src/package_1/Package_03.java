package package_1;

// ������ ��Ű�� ������ Ŭ��������
// ���� ���� ������ �����մϴ�.

public class Package_03 {
	public static void main(String[] args) {
		// ������ ��Ű�� ������ Ŭ������ ����Ͽ�
		// ��ü�� �����ϴ� �ڵ�
		Package_02_Resource resource = new Package_02_Resource();

		// private ����� Ŭ������ �ܺ� ������ ���ѵ˴ϴ�.
		// resource.n1 = 10;
		
		// public ����� ��ġ�� ������� ����� ������ �� �ֽ��ϴ�.
		resource.n2 = 20;
		
		// ����Ʈ ���������ڰ� ����� ����� 
		// ������ ��Ű���� Ŭ���������� publicó��
		// ������ �� �ֽ��ϴ�.
		resource.n3 = 30;
	}

}
