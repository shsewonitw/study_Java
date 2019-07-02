package tje.io;

import java.io.*;
import java.util.*;

// 객체 입출력을 위해서 사용되는 
// ObjectInputStream, ObjectOutputStream 클래스
// 특정 객체 자체를 외부로 출력하거나 입력받을 수 있는 클래스
// ObjectInputStream, ObjectOutputStream 클래스를 사용하여
// 입출력되는 클래스는 반드시 Serializable 인터페이스를 구현해야합니다.
// Serializable 인터페이스는 어떠한 추상 메소드도 제공하지 않습니다.
// (선언만 필요)

class Point implements Serializable{
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("x : %d, Y : %d\n", this.x,this.y);		
	}
}

public class IO_19 {
	public static void main(String[] args) throws Exception {
		
		ArrayList<Point> list = new ArrayList<>();
		
		Random random = new Random();
		for(int i = 500 ; i < 100000 ; i++) {
			Point p = new Point(random.nextInt(i),random.nextInt(i));
			System.out.println(p);
			list.add(p);
		}
		
		String dirPath = "D:\\Student\\dev\\java_se\\file_test";
		File dir = new File(dirPath);
		
		File file = new File(dir, "object_03.dat");
		
		ObjectOutputStream out = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(file)));
		
		// 객체 자체를 출력할 수 있는 writeObject 메소드
		// Object 타입을 매개변수로 전달받아
		// 해당 객체를 스트림을 통해서 출력하는 기능을 제공
		out.writeObject(list);
		// flush를 호출하여 객체를 출력
		out.flush();
		// 스트림 종료
		out.close();
		
		
		/*
		 마지막 5개의 데이터  IO_20 에서 확인하기 위해
		x : 25868, Y : 73395

  		x : 45180, Y : 11138
		
		x : 72710, Y : 48277
		
		x : 92479, Y : 57491
		
		x : 15649, Y : 89507
		 */
		System.out.println("프로그램 종료");
		
	}
}









