package tje.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class IO_22 {

	public static void main(String[] args) throws Exception {
		// D:\\Student\\dev\\java_se\\file_log 경로에 저장된
		// 모든 파일에 대해서 각 파일별 계산 내역을 출력하세요
		
		// 2019년 3월 15일 13시 16분에 기록된 내역
		// 1. ...
		// 2. ...
		// 2019년 ....
		// 1. ...
		// ....
		
		
		

		String dirPath = "D:\\Student\\dev\\java_se\\file_log";
		File dir = new File(dirPath);
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일HH시mm분에 기록된 내역");
		
		
		// File 클래스의 list 메소드를 활용
		// list 메소드는 디렉토리를 참조하고 있는 File 객체에 사용할 수 있으며,
		// 해당 디렉토리 내부에 존재하는 모든 파일/디렉토리명을 (배열로) 반환
		String [] file_list = dir.list();
		
		for( String fn : file_list) {
			// System.out.println(file);
			
			// 파일명에 기록된 날짜에 해당되는 Date 객체 생성
			// SimpleDateFormat 클래스의 parse 메소드
			// 매개변수로 전달된 문자열을 사용하여 Date 객체를 반환
			// 매개변수인 문자열은 SimpleDateFormat 클래스의 생성자에서 지정된
			// 형식으로 되어있어야함.
			Date date = sdf1.parse(fn.substring(0,fn.indexOf(".dat")));
			String title = sdf2.format(date);
			
			System.out.println(title);
			
			File file = new File(dir,fn);
			
			ObjectInputStream in = 
					new ObjectInputStream(
							new BufferedInputStream(
									new FileInputStream(file)));
			
			ArrayList<CalculatorResult> list = (ArrayList<CalculatorResult>)in.readObject();
			
			for(int i = 0 ; i < list.size() ; i++) {
				System.out.printf("%2d. %s", i+1,list.get(i));
			}
			System.out.println();
			in.close();
		}
	}
}