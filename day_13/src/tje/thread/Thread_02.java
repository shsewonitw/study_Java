package tje.thread;

// ���α׷��� ���� �� ���ÿ� ó���ϰ��� �ϴ� �۾��� ������ ����
// java.lang.Thread Ŭ������ ����� �� �ֽ��ϴ�.


// Thread
// ���α׷� ������ �帧�� �б��� �� �ִ� ����� �����ϴ� Ŭ����
// ex) OS�� ��Ƽ�½�ŷ

// �������
// 1. Thread Ŭ������ ��ӹ޴� ���
// 1-1. Thread Ŭ������ ��ӹ޾� public void run() �޼ҵ带 �������̵� �մϴ�.
//		public void run() : �����尡 �����Ǿ� ������ �۾��� �����ϴ� �޼ҵ�
// 1-2. �ش� Ŭ������ ��ü�� �����ϰ�, start �޼ҵ带 �����մϴ�.
//		�������̵��� run �޼ҵ带 ȣ���ϸ�, �����尡 �����Ǵ� ���� �ƴ� �Ϲ� �޼ҵ带 �����Ѵ�

class Thread_B_1 extends Thread {
	public void run() {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.printf("Thread_B_1 -> %d\n",i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread_B_2 extends Thread {
	public void run() {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.printf("Thread_B_2 -> %d\n",i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Thread_02 {

	public static void main(String[] args) {
		
		Thread_B_1 b1 = new Thread_B_1();
		Thread_B_2 b2 = new Thread_B_2();
		b1.run();
		b2.run();

		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.printf("main -> %d\n",i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
