package tje.io;

import java.io.IOException;

public class IO_04_EX_1 {

	public static void main(String[] args) throws IOException {
		// Ű���� �Է½�Ʈ�����κ��� ��� �����͸�
		// �о�� ������ �ݺ��� �����ϴ� �ڵ�
		byte[] input = new byte[20];
		int size;
		
		do {
			System.out.printf("Ű���� �Է��� �����ϼ���: ");
			size = System.in.read(input);
			for(int i = 0 ; i < input.length ; i++)
				System.out.printf("%d ",input[i]);
			System.out.println();
			
			// Ű���� �Է��� ó���ϴ� ��� ���� ���ڸ� ���޹޾ƾ߸�
			// -1 ���� ���޹��� �� ����(�ý��ۿ� ���� �ٸ��� �Ϲ������� Ctrl+z)
		} while(size != -1);
		
		System.out.println("���α׷� ����");
	}
}