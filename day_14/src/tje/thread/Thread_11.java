package tje.thread;

import java.util.*;

class ThreadGameWithJoin extends Thread {
	public ThreadGameWithJoin(String name) {
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

public class Thread_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� �ο����� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		ArrayList<ThreadGameWithJoin> list = new ArrayList<>();
		
		for(int i=0;i<num;i++) {
			System.out.printf("%d ��° �̸��� �Է��ϼ���: ",i+1);
			list.add(new ThreadGameWithJoin(sc.next()));
		}
		
		for(ThreadGameWithJoin t : list) {
			t.start();
		}
		
		sc.close();
		
		
		// main ������� ���� ������(main ���� ������ ������ ��ü��)����
		// �����ϴ� ���¿��� ���� ����� �� �ֽ��ϴ�.
		// ���� main �����尡 �ٸ� ���� ��������� ��� ����� ������
		// ����ϰ��� �ϴ� ��� join �޼ҵ带 ���
		
		// Thread Ŭ������ join �޼ҵ�
		// Ư�� �����尡 �ٸ� �����忡 ���ӵǾ� �ٸ� �����尡 ������ ������ ����ϴ� �޼ҵ�
		for(int i = 0 ; i < num ; i++) {
			
			try {
				// main ������� ����Ʈ ���ο� �����ϴ� 
				// ������ �����尡 ����� ������
				// ���� �ڵ忡�� ����մϴ�.
				list.get(i).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// ��� ������ ��ü���� run �޼ҵ尡 ����� ����
		// ����Ǵ� �ڵ�
		System.out.println("���α׷� ����");
	}
}
