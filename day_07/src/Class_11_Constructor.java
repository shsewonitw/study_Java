
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
		System.out.printf("%d 단을 출력합니다. \n",d);
		for(int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\n",d,i,d*i);
		}
	}
}

public class Class_11_Constructor {

	public static void main(String[] args) {
		// 아래의 코드가 실행될 수 있도록 클래스를 작성하세요
		GuGuDan gugudan_1 = new GuGuDan(5);
		// 5단의 구구단이 출력되도록 작성하세요
		gugudan_1.print();

		GuGuDan gugudan_2 = new GuGuDan();
		// 2~9 단까지의 전체 구구단이 출력되도록 작성하세요
		gugudan_2.print();
	}

}
