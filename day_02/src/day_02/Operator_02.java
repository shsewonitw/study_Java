package day_02;

public class Operator_02 {

	public static void main(String[] args) {
		// ���迬����
		// ���װ� ������ ũ�⸦ ���Ͽ� true/false ���� ��ȯ�ϴ� ������
		// > , < , >= , <= , == , !=
		// ������� ���ǰ� �ùٸ� ��� true�� ��ȯ�ǰ�
		// Ʋ�� ��� false �� ��ȯ��
		int n1 = 10;
		int n2 = 5;
		boolean result;
		
		result = n1 > n2;
		// printf �޼ҵ��� %b �� boolean Ÿ���� ���� �����
		System.out.printf("%d %s %d = %b\n",n1,">",n2,result);
		
		result = n1 < n2;
		System.out.printf("%d %s %d = %b\n",n1,"<",n2,result);
		
		result = n1 >= n2;
		System.out.printf("%d %s %d = %b\n",n1,">=",n2,result);
		
		result = n1 <= n2;
		System.out.printf("%d %s %d = %b\n",n1,"<=",n2,result);
		
		result = n1 == n2;
		System.out.printf("%d %s %d = %b\n",n1,"==",n2,result);
		
		result = n1 != n2;
		System.out.printf("%d %s %d = %b\n",n1,"!=",n2,result);
	}

}
