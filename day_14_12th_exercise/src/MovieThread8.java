
public class MovieThread8 extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("�������� ����մϴ�.");
			
			if(Thread.interrupted())
				break;
		}
	}
}
