package tje.util;

public class String_03 {

	public static void main(String[] args) {
		// StringBuffer / StringBuilder Ŭ����
		// String Ŭ������ �ٸ��� ���ڿ��� �����Ͽ�
		// ������ �� �ִ� Ŭ����

		// StringBuffer/ StringBuilder Ŭ������ ������
		// ��Ƽ������ ȯ�濡�� ���� ������ �������� ���� -> StringBuffer Ŭ����
		// ��Ƽ������ ȯ���� �������� ���� -> StringBuilder
		// (������ ����ȭ�� ���� ����)

		// �⺻ ������ ����Ͽ� 16���ڸ� ������ �� �ִ� ��ü�� ����
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();

		// StringBuffer / StringBuilder Ŭ������ capacity �޼ҵ�
		// ���ڿ��� �ִ� ������ �� �ִ� ũ�Ⱚ�� ��ȯ (�⺻���� 16)
		// capacity�� �������� �þ �� �ֽ��ϴ�.
		// (16���� �̻��� �߰��Ǹ� capacity�� Ȯ���� ���ο� ������ �Ҵ�)
		// capacity�� �������� �Ű������� ���ؼ� ������ �� �ֽ��ϴ�.
		// new StringBuffer(1000), new StringBuilder(1000)
		System.out.printf("buffer��ü�� ��뷮 : %d\n", buffer.capacity());
		System.out.printf("builder��ü�� ��뷮 : %d\n", builder.capacity());

		// ���ڿ��� �߰��� �� �ִ� append �޼ҵ�
		// (���� ������ ��ġ�� ���ڿ��� �߰�)
		buffer.append("First, ");
		builder.append("First, ");
		System.out.printf("buffer.capacity : %d, buffer.length : %d\n", buffer.capacity(), buffer.length());
		System.out.printf("builder.capacity : %d, builder.length : %d\n", builder.capacity(), builder.length());

		buffer.append("Second, ");
		builder.append("Second, ");
		System.out.printf("buffer.capacity : %d, buffer.length : %d\n", buffer.capacity(), buffer.length());
		System.out.printf("builder.capacity : %d, builder.length : %d\n", builder.capacity(), builder.length());

		// capacity�� ũ�⸦ ��� ���ڿ��� �߰��ǹǷ�
		// capacity�� Ȯ��� �������� �̵��ϰ� ��.
		buffer.append("Third, ");
		builder.append("Third, ");
		System.out.printf("buffer.capacity : %d, buffer.length : %d\n", buffer.capacity(), buffer.length());
		System.out.printf("builder.capacity : %d, builder.length : %d\n", builder.capacity(), builder.length());

		System.out.println(buffer);
		System.out.println(builder);

		buffer.insert(0, "Zero, ");
		builder.insert(0, "Zero, ");
		System.out.printf("buffer.capacity : %d, buffer.length : %d\n", buffer.capacity(), buffer.length());
		System.out.printf("builder.capacity : %d, builder.length : %d\n", builder.capacity(), builder.length());

		System.out.println(buffer);
		System.out.println(builder);

		System.out.printf("Hello`s index : %d\n", buffer.indexOf("Hello"));
		System.out.printf("Hello`s index : %d\n", buffer.indexOf("Third"));

		int search = -1;
		while ((search = buffer.indexOf(", ")) != -1) {
			// ", " �� ����
			buffer.delete(search, search + ", ".length());
			// "-" �� �߰�
			buffer.insert(search, "-");
		}
		System.out.println(buffer);

		// ���� ����� ���ڼ��� capacity�� ���� ����
		buffer.trimToSize();
		builder.trimToSize();

		System.out.printf("buffer.capacity : %d, buffer.length : %d\n", buffer.capacity(), buffer.length());
		System.out.printf("builder.capacity : %d, builder.length : %d\n", builder.capacity(), builder.length());

	}

}
