package tje.io;
import java.io.*;


public class IO_02 {

	public static void main(String[] args) throws IOException {
		// �Է½�Ʈ���� ���� ���
		// �Է� ��Ʈ���� ��� �����͸� �Է� ���� ���۸� �˻��Ͽ�
		// �ش� ���ۿ� ������ �������� �ʴ� ��� ���ۿ� �����Ͱ�
		// ���� ������ �����(Ű���� �Է��� ��� ����ڰ� �����͸� �Է��ϰ� ����Ű �Է��� ������ ���)
		
		
		// ����� ���ۿ� �����Ͱ� �����ϴ� ���, �ش� ���ۿ���
		// ����Ʈ ��Ʈ���� 1byte�� �����͸� �о����,
		// ���ڽ�Ʈ���� ��� 2byte�� �����͸� �о��
		
		int input;
		
		System.out.print("Ű���� �Է��� �����ϼ���: ");
		input = System.in.read();
		System.out.printf("�Էµ� �� : %d\n",input);		
		System.out.printf("�Էµ� ���� : %c\n",input);

		System.out.print("Ű���� �Է��� �����ϼ���: ");
		input = System.in.read();
		System.out.printf("�Էµ� �� : %d\n",input);
		System.out.printf("�Էµ� ���� : %c\n",input);



		System.out.print("Ű���� �Է��� �����ϼ���: ");
		input = System.in.read();
		System.out.printf("�Էµ� �� : %d\n",input);
		System.out.printf("�Էµ� ���� : %c\n",input);


	}

}
