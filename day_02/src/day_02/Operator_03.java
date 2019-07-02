package day_02;

public class Operator_03 {

	public static void main(String[] args) {
		// ��������
		// �ټ����� ������� �����Ͽ�
		// �ϳ��� boolean ���� ��ȯ�� �� �ִ� ������
		// AND(&&) , OR(||) , NOT(!)
		
		// AND ������ (&&)
		// ���װ� ������ ����� ����� ��� ��(true)�� ��� true �� ��ȯ�ϴ� ������
		// ������ ����� false�� ��� ������ ���� ������ �ʴ´�.(���� = Dead code)
		System.out.printf("%-5b && %-5b -> %b\n",false,false,false&&false);
		System.out.printf("%-5b && %-5b -> %b\n",false,true,false&&true);
		System.out.printf("%-5b && %-5b -> %b\n",true,false,true&&false);
		System.out.printf("%-5b && %-5b -> %b\n\n",true,true,true&&true);
		
		// OR ������ (||)
		// ���װ� ������ ����� �� �ϳ��� ����� ��� ��(true)�� ��� true�� ��ȯ�ϴ� ������
		// ������ ����� true�� ��� ������ ���� ������ �ʴ´�.(���� = Dead code)
		System.out.printf("%-5b || %-5b -> %b\n",false,false,false||false);
		System.out.printf("%-5b || %-5b -> %b\n",false,true,false||true);
		System.out.printf("%-5b || %-5b -> %b\n",true,false,true||false);
		System.out.printf("%-5b || %-5b -> %b\n\n",true,true,true||true);
		
		// NOT ������ (!)
		// ���׿�����(�ǿ����ڰ� 1��)
		// ������� ����� �����ϴ� ���� ��ȯ
		// true -> false , false -> true
		System.out.printf("!%-5b -> %b\n",false,!false);
		System.out.printf("!%-5b -> %b\n\n",true,!true);
		
		///////////////////////////////////////////////////////////////////////////
		
		int age = 32;
		int gender = 1; // 1 �Ǵ� 3�� ��� ���� , 2 �Ǵ� 4�� ��� ����
		
		// ���� �� ������ ����Ͽ�
		// ���̰� 20�� �̰�, ������ ������ ��츦 �Ǵ��ϴ� ���� �ۼ��ϰ� ����� Ȯ��
		System.out.printf("%b",age>=20&&age<=29&&(gender==2||gender==4));
		
		// boolean flag_age = age >= 20 && age <30;
		boolean flag_age = age / 10 == 2;
		boolean flag_gender = gender == 2 || gender == 4;
		boolean result = flag_age && flag_gender;
		System.out.println(result);
	}

}
