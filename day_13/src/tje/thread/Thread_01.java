package tje.thread;

class Thread_A_1 {
	public void run() {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.printf("Thread_A_1 -> %d\n",i);
		}
	}
}

class Thread_A_2 {
	public void run() {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.printf("Thread_A_2 -> %d\n",i);
		}
	}
}

public class Thread_01 {
	public static void main(String[] args) {
		// �Ϲ� ���α׷��� �ϳ��� ���� �帧�� ������,
		// ���α׷� �ڵ带 �����Ű�� ������ �����մϴ�.
		Thread_A_1 a1 = new Thread_A_1();
		Thread_A_2 a2 = new Thread_A_2();
		
		// Thread_A_1�� run �޼ҵ尡 ����
		a1.run();
		
		// Thread_A_1�� run �޼ҵ尡 ����� ����
		// Thread_A_2�� run �޼ҵ尡 ����
		a2.run();
		
		// Thread_A_2�� run �޼ҵ尡 ����� ����
		// main �޼ҵ��� �ݺ��� ����
		for(int i = 1 ; i <=10 ; i++) {
			System.out.printf("main -> i = %d\n",i);
		}

	}

}
