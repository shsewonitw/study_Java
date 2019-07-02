
public class Student {
	public int studentNum;
	public String name;
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student st = (Student)obj;
		boolean flag_age = this.studentNum == st.studentNum;
		if((obj instanceof Student) && flag_age) {
			return true;
		}
		else {
			return false;
		}
	}	
}
