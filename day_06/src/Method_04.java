
public class Method_04 {
	// Call By Reference ����� �޼ҵ� ȣ��
	// �޼ҵ��� �Ű������� ���������� ���� �Ѱ��ִ� ���(�迭 ����, Ŭ������ ��ü)
	// ȣ��� �޼ҵ忡�� �������� ����� ���� �����ϰ� �Ǹ�
	// ȣ���� ���� ����Ű�� ���� �޸𸮿� ���� �ݿ��˴ϴ�.
	public static void updateValue(int [] arr) {
		// main �޼ҵ��� arr �迭�� �����ϴ�  �迭�� �����ϴ� �ڵ�
		arr[1] = 100;
		System.out.println("updateValue �޼ҵ�");
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.printf("arr[%d] = %d\n",i,arr[i]);
		}
	}

	public static void main(String[] args) {
		
		int [] arr = { 1,2,3 };
		System.out.println("main �޼ҵ�");
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.printf("arr[%d] = %d\n",i,arr[i]);
		}
		
		// �迭�� ���� ���� �Ѱ��ִ� �޼ҵ� ȣ��!!
		// updateValue �޼ҵ忡�� ���޹��� �������� ����Ͽ�
		// ���� ����������, main �޼ҵ��� arr �迭������ ����ؼ���
		// ������ ���� Ȯ���� �� �ֽ��ϴ�.
		updateValue(arr);
		
		System.out.println("main �޼ҵ�");
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.printf("arr[%d] = %d\n",i,arr[i]);
		}
	}

}
