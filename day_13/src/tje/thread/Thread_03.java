package tje.thread;

//���α׷��� ���� �� ���ÿ� ó���ϰ��� �ϴ� �۾��� ������ ����
//java.lang.Thread Ŭ������ ����� �� �ֽ��ϴ�.

//Thread
//���α׷� ������ �帧�� �б��� �� �ִ� ����� �����ϴ� Ŭ����
//ex) OS�� ��Ƽ�½�ŷ

//�������
//1. Thread Ŭ������ ��ӹ޴� ���
//1-1. Thread Ŭ������ ��ӹ޾� public void run() �޼ҵ带 �������̵�
//   �մϴ�.
//	    public void run() : �����尡 �����Ǿ� ������ �۾��� �����ϴ� �޼ҵ�
//1-2. �ش� Ŭ������ ��ü�� �����ϰ�, start �޼ҵ带 �����մϴ�.
//		�������̵��� run �޼ҵ带 ȣ���ϸ�, �����尡 �����Ǵ� ���� �ƴ�
//   �Ϲ� �޼ҵ带 �����մϴ�.

//2. Runnable �������̽��� �����ϴ� ���

class Thread_C_1 extends Thread {
	public void run() {
		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.printf("Thread_C_1 -> i = %d\n", i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}
class Thread_C_2 extends Thread {
	public void run() {
		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.printf("Thread_C_2 -> i = %d\n", i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}

public class Thread_03 {
	public static void main(String[] args) {
		
		Thread_C_1 c1 = new Thread_C_1();
		Thread_C_2 c2 = new Thread_C_2();
		
		// Thread Ŭ������ start �޼ҵ�� ���� ��ü��
		// ����Ͽ� �����带 ������ ��, run �޼ҵ带 ȣ���Ͽ�
		// �ش� �����尡 ������ �� �ֵ��� �����ϴ� �޼ҵ�
		c1.start();
		
		c2.start();

		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.printf("main -> i = %d\n", i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}













