package tje.thread;


class Thread_E extends Thread {	
	public void run() {
		// �������� ��ü�� �̸��� Ȯ��
		// Thread Ŭ������ getName �޼ҵ带 ���
		
		// �������� �̸��� �������� ������ �����Ǵ� ������
		// Thread-0, 1, 2, .... ���� �̸��� ���
		System.out.printf("���� ���� ���� �������� �̸��� %s �Դϴ�.\n", this.getName());
		
	}
}

public class Thread_06 {

	public static void main(String[] args) {

		Thread_E t1 = new Thread_E();
		Thread_E t2 = new Thread_E();
		Thread_E t3 = new Thread_E();

		t1.start(); t2.start(); t3.start();
	}

}
