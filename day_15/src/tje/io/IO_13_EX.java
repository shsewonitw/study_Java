package tje.io;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class IO_13_EX {

	public static void main(String[] args) throws IOException {
		// Java JDK�� ��ġ�� ���丮 ������
		// THIRDPARTYLICENSEREADME.txt ������ �о������.
		// ���� ���ο� ������ �������� ���� �� �ܾ��� ī��Ʈ�� ����ϰ� ���
		// StringTokenizer Ŭ������ ����Ͽ� ���ڿ��� �������� �������� ����
		// HashMap Ŭ������ ����Ͽ� �� �ܾ ī������ ���
		
		
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
			System.out.println(str + " �ܾ�� "+ hm.get(str)+ "�� �����մϴ�.");
		}
	}
}
