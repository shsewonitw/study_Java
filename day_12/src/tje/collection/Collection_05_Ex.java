package tje.collection;
import java.util.*;

public class Collection_05_Ex {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0 ; i < 10000 ; i++) {
			list1.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i = 0 ; i < 10000 ; i++) {
			list2.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + "ns");
		
		
		startTime = System.nanoTime();
		for(int i = 0 ; i < 10000 ; i++) {
			list1.remove(0);
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 지우는시간: " + (endTime-startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i = 0 ; i < 10000 ; i++) {
			list2.remove(0);
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 지우는시간: " + (endTime-startTime) + "ns");

	}
}
