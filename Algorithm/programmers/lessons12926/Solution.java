package lessons12926;

class Solution {
	  public String solution(String s, int n) {
	      String answer = "";

	      for(int i = 0 ; i < s.length() ; i++) {
	    	  char currentChar = s.charAt(i);
	    	  if(currentChar == ' ') {
	    		  answer += ' ';
	    		  continue;
	    	  }
	    	  
	    	  if(currentChar >= 'a' && currentChar <= 'z' && (currentChar+n) > 'z') {
	    		  answer += (char)(currentChar+n-('z'-'a')-1);
	    	  }
	    	  else if(currentChar >= 'A' && currentChar <= 'Z' && (currentChar+n) > 'Z') {
	    		  answer += (char)(currentChar+n-('Z'-'A')-1);
	    	  }
	    	  else
	    		  answer += (char)(s.charAt(i)+n);
	      }
	      
	      return answer;
	  }
	  
	  public static void main(String[] args) {
		Solution sol = new Solution();
		String answer = sol.solution("a B z", 4);
		System.out.println(answer);
	}
}
