package lessons12930;

import java.util.*;

class Solution {
//	public String solution(String s) {
//		String answer = "";
//		char ch = 'a';
//		StringTokenizer st = new StringTokenizer(s," ");
//		while(st.hasMoreTokens()) {
//			String str = st.nextToken();
//			str = str.toLowerCase();
//			for(int i = 0 ; i < str.length() ; i++) {
//				if(i%2==0)
//					answer += (char)(str.charAt(i) - ('a'-'A'));
//				else
//					answer += str.charAt(i);
//			}
//			if(!st.hasMoreTokens())
//				break;
//			answer += " ";
//		}
//		
//		return answer;
//	}

//	public String solution(String s) {
//		String answer = "";
//		int count = 0;
//		s = s.toLowerCase();
//		for (int i = 0; i < s.length(); i++) {
//			if(s.charAt(i) == ' ') {
//				answer += ' ';
//				count=0;
//			}
//			else if(count%2==0){
//				answer += (char)(s.charAt(i) - ('a'-'A'));
//				count++;
//			}
//			else {
//				answer += s.charAt(i);
//				count++;
//			}
//							
//		}
//
//		return answer;
//	}

	public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
	public static void main(String[] args) {
		Solution sol = new Solution();
		String str = sol.solution("GooD   Morning A b C d E");
		System.out.println(str);
	}
}