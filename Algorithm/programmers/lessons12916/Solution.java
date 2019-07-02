package lessons12916;

public class Solution {
	boolean solution(String s) {
		boolean answer = true;

		int countP = 0;
		int countY = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == 'p' || c == 'P')
				countP++;
			
			if(c == 'y' || c == 'Y')
				countY++;
		}

		answer = (countP == countY);
		return answer;
	}
	
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		boolean bool = sol.solution("Pyy");
		System.out.println(bool);
	}
}
