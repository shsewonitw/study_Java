package tje.thread;

import java.util.*;

class Thread_run extends Thread {
	public Thread_run(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			Random ran = new Random();
			int rand_num = ran.nextInt(5) + 1;
			try {
				Thread.sleep(rand_num * 1000);
				System.out.printf("%s ���� %d ��° ������ ����߽��ϴ�.\n", this.getName(), i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("%s �� ����!!\n", this.getName());

	}
}

public class Thread_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� �ο����� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		ArrayList<Thread_run> list = new ArrayList<>();
		
		for(int i=0;i<num;i++) {
			System.out.printf("%d ��° �̸��� �Է��ϼ���: ",i+1);
			list.add(new Thread_run(sc.next()));
		}
		
		for(Thread_run t : list) {
			t.start();
		}
		
		sc.close();
		
		// main ������� ���� ��������� �����ϴ� ���¿��� ���� ����� �� �ֽ��ϴ�.
		System.out.println("���α׷� ����");
	}

}
