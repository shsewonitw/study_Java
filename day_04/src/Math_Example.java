
public class Math_Example {

	public static void main(String[] args) {
		// ������ ����� ���� ���� ����
		// 1. Math Ŭ������ random �޼ҵ带 ���
		// 2. java.util.Random Ŭ������ ���
		
		// ���� : �������� ����Ǵ� ������ ��
		// (0 ���� ũ�� 1���� ���� ��)
		// Math.random() �� ����Ͽ� double Ÿ���� ������ ��ȯ���� �� ����

		// ������ ����ؼ� 1 ~ 6 ������ ���� ����
		// ���� * 6 -> 0 ~ 6 ������ ���� ���� ( 0, 6 �� ������ ���� )
		// ���� * 6 + 1 -> 1 ~ 7 ������ ��
		// (int)(���� * 6 + 1)  -> 1~6�� �ش�Ǵ� ������ ��ȯ
		
		for(int i=1;i<=10;i++) {
			int r1, r2;
			r1 = (int)(Math.random()*6+1);
			r2 = (int)(Math.random()*6+1);
			System.out.printf("r1 : %d , r2 : %d\n",r1,r2);
		}

	}

}
