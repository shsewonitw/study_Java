// �θ�Ŭ������ ����
class Student {
	public void study() {
		System.out.println("������ �����մϴ�.");
	}
}
class Student_A extends Student {
	public void study() {
		System.out.println("10�а� �����ٰ� ������ �����մϴ�.");
	}
}
class Student_B extends Student {
	public void study() {
		System.out.println("20�а� �����ٰ� ������ �����մϴ�.");
	}
}
class Student_C extends Student {
	public void study() {
		System.out.println("���Ϻ��� ������ �����մϴ�.");
	}
}

public class Class_40_MethodOverriding {
	public static void main(String[] args) {		
		Student_A a1 = new Student_A();
		Student_B b1 = new Student_B();
		Student_C c1 = new Student_C();
		
		a1.study();
		b1.study();
		c1.study();
		
		// �θ�Ŭ������ �迭 ����
		// �θ�Ŭ������ ���۷��� ������
		// �ڽ�Ŭ������ ��ü�� ������ �� �����Ƿ�
		// ��� �ڽ�Ŭ������ ��ü���� ������ �� �ִ�
		// Ÿ���� �˴ϴ�.
		Student [] students = new Student[3];
		students[0] = a1;
		students[1] = b1;
		students[2] = c1;
		
		for( int i = 0 ; i < students.length ; i++ )
			students[i].study();
	}
}











