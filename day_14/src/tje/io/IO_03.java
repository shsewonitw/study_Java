package tje.io;

import java.io.IOException;

public class IO_03 {

	public static void main(String[] args) throws IOException {

		// InputStream Ŭ������ read �޼ҵ�
		// read() : �Է� ��Ʈ�����κ��� ���� �տ� ��ġ�� 1����Ʈ�� �о��
		// read(byte []): �Է½�Ʈ���� ���� �պ��� �Ű������� ���޵� �迭�� ũ�⸸ŭ�� ����Ʈ�� �о��
		// read(byte [], int startIndex, int size) : �Է� ��Ʈ���� 
		// ���� �պ��� size ũ�⸸ŭ�� �����͸� �о��. ������ �Ű������� ���޵�
		// �迭�� startIndex ��ġ���� ����
		byte [] input = new byte[20];
		
		System.out.printf("Ű���� �Է��� �����ϼ���: ");
		// Ű���� �Է� ��Ʈ������ ���� 20 byte�� �о���̴� �ڵ�
		// read �޼ҵ��� ������ ����� ��, ������ �о���� byte ���� ��ȯ
		int size = System.in.read(input);
		
		System.out.printf("��Ʈ�����κ��� �о�� ����Ʈ�� ũ��: %d ����Ʈ\n",size);
		
		for(int i = 0 ; i < size ; i++) {
			System.out.printf("%c",input[i]);
		}
		System.out.println("���α׷� ����");
	}

}
