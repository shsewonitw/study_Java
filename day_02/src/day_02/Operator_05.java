package day_02;

public class Operator_05 {

	public static void main(String[] args) {
		// ���� / ���� ������ ( ���� / ���� )
		// ++ / --
		// ���� / ���� �����ڴ� ����Ǵ� ��ġ�� ���� ���� / ���� ��Ű�� ������ �����.
		// �������� �տ� ���Ǵ� ��츦 ����
		// �������� �ڿ� ���Ǵ� ��츦 ����

		// ���� ����/���� �����ڴ� �������� ���� ������ 1�� �ʰ� �����մϴ�.
		// �Ʒ��� �ڵ�� n2 ������ n1�� ���� ������ ��, n1�� ���� ���߿� ������Ŵ
		int n1 = 10;
		int n2 = n1++;
		System.out.printf("n1 -> %d , n2 -> %d\n",n1,n2);
		
		int n3 = 30;
		System.out.printf("n3 -> %d\n",n3++);
		System.out.printf("n3 -> %d\n",n3);
		
		
		// ���� ����/���� �����ڴ� ��� �����մϴ�.
		int n4 = 10;
		int n5 = ++n4;
		System.out.printf("n4 -> %d, n5 -> %d\n",n4,n5);
		
		int temp = 10;
		System.out.printf("%d %d %d %d %d\n",temp++,++temp,temp--,++temp,temp++);
	}

}
