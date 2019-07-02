package lessons17681;

public class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		for(int i = 0 ; i < n ; i++) {
			String str = Integer.toBinaryString(arr1[i] | arr2[i]);
			answer[i] = "";
			if(str.length() != n) {
				for(int j=0 ; j < n-str.length() ; j++)
					answer[i] += ' ';
			}
			
			for(int j = 0 ; j < str.length() ; j++) {
				if(str.charAt(j) == '1')
					answer[i] += '#';
				else
					answer[i] += ' ';
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] array1 = {46,33,33,22,31,50};
		int[] array2 = {27,56,19,14,14,10};
		String[] answer = sol.solution(6,array1,array2);
		for(int i =0 ; i < answer.length ; i++) {
			
				System.out.println(answer[i]);
			
		}
	}
}
