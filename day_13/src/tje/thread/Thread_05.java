package tje.thread;

public class Thread_05 {
	public static void main(String[] args) {
		// �͸� Ŭ������ Ȱ���� ������ ����
		// �͸� Ŭ���� : �޼ҵ带 �������̵��ϸ鼭 ��ü�� �����ϴ� ���
		new Thread() { 
			public void run() {
				for( int i = 1 ; i <= 10 ; i++ ) {
					System.out.printf("�͸�Ŭ���� -> i = %d\n", i);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {				
						e.printStackTrace();
					}
				}
			}
		}.start();
		
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
























