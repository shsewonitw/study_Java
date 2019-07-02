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
				System.out.printf("%s 님이 %d 번째 바퀴를 통과했습니다.\n", this.getName(), i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("%s 님 완주!!\n", this.getName());

	}
}

public class Thread_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("참가 인원수를 입력하세요 : ");
		int num = sc.nextInt();
		
		ArrayList<Thread_run> list = new ArrayList<>();
		
		for(int i=0;i<num;i++) {
			System.out.printf("%d 번째 이름을 입력하세요: ",i+1);
			list.add(new Thread_run(sc.next()));
		}
		
		for(Thread_run t : list) {
			t.start();
		}
		
		sc.close();
		
		// main 쓰레드는 하위 쓰레드들이 동작하는 상태에서 먼저 종료될 수 있습니다.
		System.out.println("프로그램 종료");
	}

}
