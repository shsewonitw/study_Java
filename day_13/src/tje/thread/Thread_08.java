package tje.thread;

// Java ���α׷��� ���� ����
// 1. static, ��� ������ �޸� �ε�
// 2. static ������ �޼ҵ� ��, public static void main �޼ҵ带 �˻�
// 3. �˻��� main �޼ҵ带 thread Ŭ������ run �޼ҵ� ó�� ����Ͽ�
//    Thread ��ü�� ����(�̸��� main ���� ����)
// 4. main �����带 ����

public class Thread_08 {

	public static void main(String[] args) {
		// Thread Ŭ������ currentThread �޼ҵ��
		// ���� �����ڵ带 �����ϴ� ������ ��ü�� ��ȯ���ִ� �޼ҵ�
		Thread t = Thread.currentThread();
		
		String name = t.getName();
		System.out.printf("���� �������� �������� �̸��� %s �Դϴ�.\n",name);
	}

}
