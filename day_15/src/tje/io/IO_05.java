package tje.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class IO_05 {

	public static void main(String[] args) throws IOException {
		// ���� ��Ʈ��
		// ��Ʈ�����κ��� 2����Ʈ�� �����͸� �о�鿩 ���ڷ� ��ȯ�ϴ� ��Ʈ��
		
		// �Ϲ������� ���� ��Ʈ���� ���� ��Ʈ�� Ŭ������ ��ü�� �����Ͽ� �Է��� ����
		// �ݸ�, System.in �� ���� ������ �����Ǿ� �ִ� ����Ʈ ��Ʈ���� 
		// �����ϴ� ��� �ش� ����Ʈ ��Ʈ���� ��ü�� ����Ͽ� 
		// ���ڽ�Ʈ������ ��ȯ�� �� ����
		
		// ����Ʈ ��Ʈ�� ��ü�� ���� ��Ʈ������ ��ȯ�ϴ� ���
		// InputStreamReader Ŭ������ ���
		// InputStreamReader Ŭ������ ����Ʈ ��Ʈ���� ��ü�� ��������
		// �Ű������� ���޹޾� �ش� ����Ʈ ��Ʈ���� ���� ��Ʈ������ ��ȯ
		
		// �⺻�Է� ����Ʈ ��Ʈ���� ���� ��Ʈ������ ��ȯ�ϴ� ����
		// �Ʒ��� ���� ���, isr ������ ����Ͽ� Ű����κ��� ���ڰ��� �о�� �� ����
		InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.print("�����Է�:");
		char ch = (char)isr.read();
		
		System.out.printf("�Էµ� ���ڴ� %c �Դϴ�\n",ch);
		
		// ����, ������ �Է¿��� ó������ ���� ����Ű ���� �����ϴ� ��� 
		// �Ʒ��� ���� �ذ��� �� ����
		// skip�޼ҵ�� ��Ʈ���� ������ ��, �Ű������� �ش�Ǵ� ������ŭ
		// �����ϴ� ����� �����մϴ�.
		isr.skip(2);
		
		char [] msg = new char[20];
		System.out.print("�޼��� �Է�:");
		int size = isr.read(msg);
		
		System.out.printf("�Էµ� ���ڼ��� %d �Դϴ�\n",size);
		
		for(int i = 0 ; i < size ; i++) {
			System.out.printf("%c",msg[i]);
		}
	}

}
