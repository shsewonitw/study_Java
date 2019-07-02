// static Ű����
// Ŭ����, ��� �޼ҵ�, ��� �ʵ忡 ����� �� �ִ� Ű����
// static �� ���ǵ� ����� ���� ����� �����ϰ� ��

// �ڹ����α׷��� ���� ����
// 1. JVM�� ���ؼ� ������ ��� Ŭ���� ��,
//	  static �޼ҵ�, static ����ʵ带 �޸𸮿� �ε�
//	  (���α׷��� ����(main�޼ҵ��� ����) ���� �޸� ����)
// 2. �޸𸮿� �ε��� static �޼ҵ� ��, main �̸��� �˻�
// 3. main �޼ҵ尡 �˻��Ǿ��ٸ� JVM�� �ش� main �޼ҵ带 ȣ���Ͽ� ���α׷��� ����


// static �ʵ�/�޼ҵ��� Ư¡
// ���α׷��� ���� ������ �޸𸮸� Ȯ���ϰ� �ִ� ���!!!
class StaticA {
	int n1;
	// static ��� �ʵ�� ���α׷��� ���� ������
	// �޸𸮿� �ε��Ǵ� �����ν�, ��� ��ü����
	// �����ϰ� �Ǵ� ����. ( �� �ϳ��� ������ )
	static int n2;
}

public class Class_18_Static {

	public static void main(String[] args) {
		
		StaticA s1 = new StaticA();
		StaticA s2 = new StaticA();
		
		s1.n1 = 10;	s1.n2 = 20;
		s2.n1 = 100; s2.n2 = 200;
		
		System.out.printf("s1.n1 = %d, s1.n2 = %d\n",s1.n1,s1.n2);
		System.out.printf("s2.n1 = %d, s2.n2 = %d\n",s2.n1,s2.n2);
		
		// static ����� ����� ����, �޼ҵ�� ��ü�� ���� ���� 
		// Ŭ������ �̸����� ������ �����ϴ�
		System.out.printf("StaticA.n2 = %d\n",StaticA.n2);
	}

}
