package tje.thread;

// ����ȭ
// �ټ����� �����带 Ȱ���Ͽ� ���α׷����� ó���ϴ� ���
// �ذ��Ͼ߸� �ϴ� ���� (��Ƽ ������ ȯ��)

// �ټ����� �����尡 �ϳ��� �����ڿ��� ����ϴ� ��� �߻��ϴ� ����

// ĥ�� Ŭ����
class WhiteBoard {
	private int total;
	public WhiteBoard(int total) {
		this.total = total;
	}
	public void update() {
		this.total++;
	}
	
	@Override
	public String toString() {
		return String.format("total = %d",total);
	}
}

class Student extends Thread {
	private WhiteBoard board;
	public Student(String name, WhiteBoard board) {
		super(name);
		this.board = board;
	}
	public void run() {
		for(int i = 0 ; i < 10000 ; i++) {
			this.board.update();
		}
	}
}


public class Thread_12 {
	public static void main(String[] args) {
		// ���� �ڿ� ��ü ����
		// �ټ����� �л����� �����ϴ� ĥ���� ����
		WhiteBoard board = new WhiteBoard(1);
		
		// �ϳ��� ĥ���� �����ϰ� �ִ� �л� ������ ��ü
		Student s1 = new Student("S1", board);
		Student s2 = new Student("S2", board);
		Student s3 = new Student("S3", board);
		
		s1.start(); s2.start(); s3.start();
		try {
			s1.join(); s2.join(); s3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println(board);
		System.out.println("���α׷� ����");
	}

}
