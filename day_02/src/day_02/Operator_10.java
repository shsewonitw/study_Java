package day_02;

public class Operator_10 {

	public static void main(String[] args) {
		// ������ ������ �� �ִ� gender ������ �����ϰ�,
		// gender ������ �ֹε�Ϲ�ȣ 7��° �ڸ��� ������ �ʱ�ȭ �ϼ���.
		// gender ������ ���� ���Ͽ�, ������ ����ϼ���.
		// 1~4 ������ ������ �ʱ�ȭ
		
		int gender;
		gender = 3;
		String result = "";
		result = gender==2 || gender==4 ? "����" : result;
		result = gender==1 || gender==3 ? "����" : result;
		System.out.println("������ " + result + "�Դϴ�");

	}

}
