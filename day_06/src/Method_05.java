
public class Method_05 {
	// ���ϵǴ� ���� �����ϴ� �޼ҵ��� ����
	// ���� �� : �޼ҵ��� ���� ���� ����, ȣ���� ��������
	// ���� ��ȯ�ϴ� ��
	// �޼ҵ��� ����ο� ��ȯ�ϰ��� �ϴ� ���� Ÿ���� ������ �� ����

	// ���ϰ��� Ÿ���� ������ �޼ҵ�� �޼ҵ��� ���ο���
	// �ݵ�� return Ű����� �Բ� ��ȯ�� ���� �����ؾ߸� �մϴ�.

	// ���� �Ѱ��� �Ű������� ���޹޾�
	// ������ ���� ��ȯ�ϴ� squar �޼ҵ� ����
	public static int squar(int num) {
		// return Ű����
		// �޼ҵ��� ������ ������ �� �ִ� ���
		// �޼ҵ��� ���ο��� return Ű���尡 ���Ǹ�
		// �ش� ��ġ���� �޼ҵ��� ������ ����˴ϴ�.
		// ���ϰ��� �����ϴ� �޼ҵ��� ��� return Ű����� �Բ�
		// ��ȯ�� ���� ������ �� �ֽ��ϴ�.
		// ������ �� : ���ϰ��� Ÿ�Կ� ���ǵ� �ڷ������θ� ��ȯ�� �� ����
		return num * num;
	}

	public static void returnTest(int num) {
		// Ư�� �޼ҵ��� ������ �����ϰ� ȣ���� ��������
		// ���ư��� ���� return Ű����
		// (��ȯ���� ��� ����� �� ����)
		if (num % 2 == 1)
			return;

		System.out.println("returnTest �޼ҵ� ����~!");
		System.out.printf("�Ű����� num�� ���� %d �Դϴ�.\n", num);
	}

	// 3���� ������ �Ű������� ���޹޾�
	// ���� ū ���� ��ȯ�ϴ� max �޼ҵ带 �����ϰ�
	// main �޼ҵ忡�� �׽�Ʈ�ϼ���.
	public static int max(int n1, int n2, int n3) {
		int max = n1;
		max = n2 > max ? n2 : max;
		max = n3 > max ? n3 : max;
		return max;
	}

	// �������� 1���� �迭�� �Ű������� ���޹޾�
	// �ش� �迭�� ��� ��Ҹ� ������ �迭�� ��ȯ�ϴ� �޼ҵ�
	public static int[] squar_array(int[] source) {
		int[] result = new int[source.length];
		for (int i = 0; i < source.length; i++) {
			result[i] = source[i] * source[i];
		}
		return result;
	}

	public static void main(String[] args) {

		int[] source = { 10, 20, 30 };
		// 100, 400, 900
		int[] squar_result = squar_array(source);
		for(int i = 0 ; i < squar_result.length;i++) {
			System.out.println(squar_result[i]);
		}

		int num = 13;

		// ������ ���� ��ȯ�ޱ� ���ؼ� �޼ҵ带 ȣ���� ��,
		// ������ ����� ��ȯ����
		// (���ϰ��� Ÿ���� ����� �޼ҵ��
		// ������ ����� ȣ���� �������� ��ȯ�� �� �ֽ��ϴ�.)
		int num_squar = squar(num);
		System.out.printf("num_squar = %d\n", num_squar);

		returnTest(num);

		System.out.println(max(999999, 2000, 11122));
	}

}
