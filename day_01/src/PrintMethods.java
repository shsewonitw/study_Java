
public class PrintMethods {

	public static void main(String[] args) {
		// �⺻��� ��ü�� ��� �޼ҵ�
		// 1. print �޼ҵ�
		//   - �Ű������� ȭ�鿡 ����ϰ�, �ڵ����� �������� �ʴ� �޼ҵ�
		// �Ű����� : �޼ҵ��� �Ұ�ȣ ���ο� ���ǵ� ��
		System.out.print("Hello ");
		System.out.print("Java~!");
		
		// ������ ������ �ϰ��� �ϴ� ��� ���๮��(\n)�� ���
		System.out.print("Hello \n");
		System.out.print("Java~!\n");
		
		// sysout -> ctrl+space = System.out.println();
		
		// 2. println �޼ҵ�
		//   - �Ű������� ȭ�鿡 ����ϰ�, �ڵ����� �����ϴ� �޼ҵ�
		//   - �Ű������� ������� �ʴ� ��� ���ุ ����˴ϴ�.
		System.out.println();
		System.out.println("Hello");
		System.out.println("Java~!");
		
		// 3. printf �޼ҵ�
		//   - �Ű������� ���޵� ���ڿ��� ����Ͽ�
		//     ���Ŀ� ���� ����� �� �ִ� �޼ҵ�
		//   - �ڵ����� ���� X
		//   - printf("���Ĺ��ڿ�",��1, ... , ��N);
		//   - ���Ĺ��ڿ� ���ο� ����� �� �ִ� ����
		//     %d : 10������ �������� ����� �� �ִ� ����
		//     %f : �ε��Ҽ��� ���� ����� �� �ִ� ����
		//     %s : ���ڿ��� ����� �� �ִ� ����
		//     %c : �ϳ��� ���� ���� ����� �� �ִ� ����
		System.out.printf("%d + %d = %d\n", 10,7,10+7);
		System.out.printf("�� �̸��� %s �Դϴ�.\n", "�ż���");
		System.out.printf("�������� ���� %f �Դϴ�.\n", 3.14);
		// %c�� ����Ͽ� ���ڸ� ����ϴ� ��� ��������ǥ('')�� ���
		System.out.printf("������ %c �����Դϴ�.\n",'��');
	}

}
