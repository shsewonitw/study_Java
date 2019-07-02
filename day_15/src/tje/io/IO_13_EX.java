package tje.io;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class IO_13_EX {

	public static void main(String[] args) throws IOException {
		// Java JDK가 설치된 디렉토리 내부의
		// THIRDPARTYLICENSEREADME.txt 파일을 읽어오세요.
		// 파일 내부에 공백을 기준으로 사용된 각 단어의 카운트를 계산하고 출력
		// StringTokenizer 클래스를 사용하여 문자열을 공백으로 기준으로 추출
		// HashMap 클래스를 사용하여 각 단어별 카운팅을 계산
		
		
		String dirPath = "C:\\Program Files\\Java\\jdk1.8.0_202";
		File dir = new File(dirPath);
		String fileName = "THIRDPARTYLICENSEREADME.txt";
		File file = new File(dir,fileName);
		
		BufferedReader in = 
				new BufferedReader(
						new FileReader(file));
		
		String input;
		String data="";
		
		HashMap<String,Integer> hm = new HashMap<>();
		while((input = in.readLine())!=null)
			data += input;
		data = data.toLowerCase();
		StringTokenizer stData = new StringTokenizer(data," .-\",:()[]?`'\\!@#$%^&;*_+=<>/`~");
		while(stData.hasMoreTokens()) {
			String temp =stData.nextToken();
			if(hm.get(temp) == null)
				hm.put(temp,1);
			else
				hm.put(temp, hm.get(temp).intValue()+1);
		}

		for(String str :hm.keySet()) {
			System.out.println(str + " 단어는 "+ hm.get(str)+ "개 존재합니다.");
		}
	}
}
