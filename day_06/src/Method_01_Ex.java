
public class Method_01_Ex {

	public static void gugudan() {
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d��\n",i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// ��ü �������� ����� �� �ִ�
		// gugudan �޼ҵ带 �����ϰ�
		// �ش� �޼ҵ带 ȣ���Ͽ� �������� ��°���� Ȯ���ϼ���
		System.out.println("���α׷� ����");
		gugudan();
		System.out.println("���α׷� ����");

	}

}
