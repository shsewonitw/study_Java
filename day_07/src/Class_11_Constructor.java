
class GuGuDan {
	private int dan;
	
	public GuGuDan() {
		dan = 0;
	}
	
	public GuGuDan(int i) {
		dan = i;
	}
	
	
	public void print() {
		if(dan!=0)
			print(dan);
		else {
			for(int i = 2;i<10;i++)
				print(i);
		}
	}
	
	public void print(int d) {
		System.out.printf("%d ���� ����մϴ�. \n",d);
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\n",d,i,d*i);
		}
	}
}

public class Class_11_Constructor {

	public static void main(String[] args) {
		// �Ʒ��� �ڵ尡 ����� �� �ֵ��� Ŭ������ �ۼ��ϼ���
		GuGuDan gugudan_1 = new GuGuDan(5);
		// 5���� �������� ��µǵ��� �ۼ��ϼ���
		gugudan_1.print();

		GuGuDan gugudan_2 = new GuGuDan();
		// 2~9 �ܱ����� ��ü �������� ��µǵ��� �ۼ��ϼ���
		gugudan_2.print();
	}

}
