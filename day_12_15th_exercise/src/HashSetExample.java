import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"�垮瘚�"));
		set.add(new Student(2,"褐辨掏"));
		set.add(new Student(1,"褻團辦"));
		set.add(new Student(2,"褻團辦"));
		set.add(new Student(3,"褻團辦"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
}
