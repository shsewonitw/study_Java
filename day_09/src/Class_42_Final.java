import java.util.Scanner;

class Color {
	public static final int WHITE = 1;
	public static final int BLUE = 2;
	public static final int RED = 3;
}

class SharedInfo {
	public static final int ARRAY_SIZE = 100;
}

public class Class_42_Final {
	public static void main(String[] args) {	
		// ���뺯���� ����ϱ� ���ؼ� static ������ ����ϴ� ����
		int [] array = new int[SharedInfo.ARRAY_SIZE];
		// final Ű���带 �߰��Ͽ� ���뺯���� ���� ����Ǵ� ���� ����
		// SharedInfo.ARRAY_SIZE = 1;
		
		Scanner kb = new Scanner(System.in);
		int input;
		
		System.out.println("1. �Ͼ��");
		System.out.println("2. �Ķ���");
		System.out.println("3. ������");
		System.out.print("������ �����ϼ��� : ");
		input = kb.nextInt();
		
		// static final ����� ����Ͽ� switch ���� �ۼ��ϴ� ����
		// �ܼ� ������ ����ϴ� ��캸�� �ǹ̸� ��Ȯ�ϰ� ������ �� ����
		switch( input ) {
			// case 1:	break;
			case Color.WHITE :	break;
			// case 2:	break;
			case Color.BLUE :	break;
			// case 3:	break;
			case Color.RED :	break;
			default :
		}
	}
}







