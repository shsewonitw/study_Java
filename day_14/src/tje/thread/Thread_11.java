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
				System.out.printf("%s 님이 %d 번째 바퀴를 통과했습니다.\n", this.getName(), i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("%s 님 완주!!\n", this.getName());

	}
}

public class Thread_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("참가 인원수를 입력하세요 : ");
		int num = sc.nextInt();
		
		ArrayList<ThreadGameWithJoin> list = new ArrayList<>();
		
		for(int i=0;i<num;i++) {
			System.out.printf("%d 번째 이름을 입력하세요: ",i+1);
			list.add(new ThreadGameWithJoin(sc.next()));
		}
		
		for(ThreadGameWithJoin t : list) {
			t.start();
		}
		
		sc.close();
		
		
		// main 쓰레드는 하위 쓰레드(main 에서 생성된 쓰레드 객체들)들이
		// 동작하는 상태에서 먼저 종료될 수 있습니다.
		// 만약 main 쓰레드가 다른 하위 쓰레드들이 모두 종료될 때까지
		// 대기하고자 하는 경우 join 메소드를 사용
		
		// Thread 클래스의 join 메소드
		// 특정 쓰레드가 다른 쓰레드에 종속되어 다른 쓰레드가 종료할 때까지 대기하는 메소드
		for(int i = 0 ; i < num ; i++) {
			
			try {
				// main 쓰레드는 리스트 내부에 존재하는 
				// 각각의 쓰레드가 종료될 때까지
				// 현재 코드에서 대기합니다.
				list.get(i).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 모든 쓰레드 객체들의 run 메소드가 종료된 이후
		// 실행되는 코드
		System.out.println("프로그램 종료");
	}
}
