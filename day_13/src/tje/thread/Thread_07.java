package tje.thread;

class Thread_F extends Thread {	
	// ������ ��ü�� �̸��� �����ϴ� ���
	// setName �޼ҵ带 ����Ͽ� �̸��� ������ �� ����
	// ������ �Ϲ������� Thread Ŭ������ ���ڿ��� �Ű�������
	// �޴� �����ڸ� ���
	public Thread_F(String name) {
		// �θ�Ŭ���� Thread Ŭ������ �����ڸ� ����Ͽ�
		// �̸��� �����ϴ� ����
		super(name);
	}
	
	public void run() {
		System.out.printf("���� ���� ���� �������� �̸��� %s �Դϴ�.\n", this.getName());
	}
}
public class Thread_07 {
	public static void main(String[] args) {
		Thread_F t1 = new Thread_F("One");
		Thread_F t2 = new Thread_F("Two");
		Thread_F t3 = new Thread_F("Three");
		
		t1.start();		t2.start();		t3.start();		
	}
}
