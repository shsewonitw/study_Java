
public class MovieThread10 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("�������� ����մϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
