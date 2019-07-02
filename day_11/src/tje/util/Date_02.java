package tje.util;

// 싱글턴 패턴으로 구현된 날짜 객체 반환 클래스
import java.util.Calendar;
// 날짜 정보를 저장하기 위한 클래스
import java.util.Date;
// 날짜 정보를 문자열로 처리하기 위한 클래스
// 1. Date 클래스의 객체를 문자열로 반환
// 2. 문자열로 저장된 날짜 정보를 Date 클래스의 객체로 반환
import java.text.SimpleDateFormat;

public class Date_02 {
	public static void main(String[] args) {
		// 현재 시간의 날짜 정보를 처리하는 방법
		// java.util.Calendar를 통해 현재 시간에 관련된
		// Date 객체를 반환받아 처리할 수 있음
		
		// 현재 시간 정보 추출
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();
		
		// Date 클래스의 객체를 문자열로 변환
		String format = "yyyy-MM-dd hh:mm:ss a";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		System.out.println("현재 시간은 " + sdf.format(now));
	}
}
