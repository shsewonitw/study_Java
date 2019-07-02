package tje.thread;

class Thread_G extends Thread {
	public Thread_G(String name) {
		super(name);
	}
	public void run() {
		// Thread.sleep() �޼ҵ�
		// �������� Thread �� ��� ������ �� �ִ� �������
		// �޼ҵ��� �Ű������� �и������ʸ� �Է��մϴ�.
		// Thread.sleep(1000) -> 1�� ���� �����ϴ� sleep �޼ҵ�
		// ���ͷ�Ʈ Exception �� ó���� ����մϴ�.
		for ( int i = 0 ; i < 10 ; i++ ) {
			System.out.printf("%s -> i = %d\n", this.getName(),i);
			
			try {
				// sleep �޼ҵ�� �Ű������� ������ �ð�����
				// ������ ��, �ٽ� �����˴ϴ�.
				// ����, sleep ������ ������ ��ü�� ���ؼ�
				// interrupt �޼ҵ尡 ȣ��Ǹ�
				// ��� �ῡ�� ���� �����մϴ�.
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.printf("%s �����尡 �ῡ�� ������ ���\n",this.getName());
			}
		}
	}
}

public class Thread_09 {

	public static void main(String[] args) {
		Thread_G t1 = new Thread_G("Sleep-1");
		Thread_G t2 = new Thread_G("Sleep-2");
		Thread_G t3 = new Thread_G("Sleep-3");
		Thread_G t4 = new Thread_G("Sleep-4");
		Thread_G t5 = new Thread_G("Sleep-5");
		
		t1.start(); t2.start(); t3.start(); t4.start(); t5.start(); 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// sleep ������ t4 ������ ��ü�� ��� �����ϰ� �ϴ� �ڵ�
		t4.interrupt();
	}

}
