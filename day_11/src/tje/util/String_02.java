package tje.util;

public class String_02 {

	public static void main(String[] args) {
		// String Ŭ������ �޼ҵ�
		String message = "Hello Java~!";
		
		// charAt �޼ҵ�
		// �ش� ���ڿ��� Ư�� �ε��� ��ġ�� ���ڰ��� ��ȯ
		// ������ 0
		System.out.printf("message ���ڿ� ������ 1��° ���ڴ� %c\n", 
				message.charAt(0));
		// length �޼ҵ�� �ش� ���ڿ��� ��ü ���̸� ��ȯ
		// charAt �޼ҵ�� �����Ͽ� ������ ���ڰ��� �����ϴ� ����
		System.out.printf("message ���ڿ� ������ ������ ���ڴ� %c\n", 
				message.charAt(message.length()-1));
		
		String str1 = "Hello ";
		String str2 = "World~!";
		// concat �޼ҵ�� ���� ��ü�� ���ڿ���
		// �Ű������� ���޵� ���ڿ��� ������ ����� ��ȯ
		// ���� ���ڿ� str1�� Hello  �� ������� �ʰ�
		// Hello �� World~! �� ���յ� ���ο� ���ڿ��� 
		// ������ �� ��ȯ
		String str3 = str1.concat(str2);
		System.out.println(str3);		
		System.out.println(str1);
			
		// replaceAll �޼ҵ�� ���� ���ڿ� ���ο���
		// �Ű������� ���޵� ù��° ���ڿ��� ���� 
		// �ι�° �Ű������� ������ ������ ���ڿ� ������ �� ��ȯ
		// ���� ���ڿ� str3�� Hello World~! �� ������� �ʰ�
		// o �� X �� ������ ���ο� ���ڿ��� ������ �� ��ȯ
		System.out.println(str3.replaceAll("o", "X"));
		System.out.println(str3);

		
		String str4 = "    Hello World~!    ";
		System.out.println(str4);
		
		
		String id_1 = " id_1  23";
		String id_2 = "id_123 ";
		
		if(id_1.equals(id_2))
			System.out.println("������ ���̵� �Դϴ�.");
		else
			System.out.println("�ٸ� ���̵� �Դϴ�.");
		
		// String Ŭ������ trim �޼ҵ�
		// ���ڿ��� �հ� ���� �ִ� ������ ���� �����ϴ� �޼ҵ�
		// ������ ���ŵ� ���ڿ� ���� ��ȯ( ������������ ������ x )
		if(id_1.trim().replaceAll(" ", "").equals(id_2.trim()))
			System.out.println("������ ���̵� �Դϴ�.");
		else
			System.out.println("�ٸ� ���̵� �Դϴ�.");
	}

}
