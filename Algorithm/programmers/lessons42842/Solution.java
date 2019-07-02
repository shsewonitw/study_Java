package lessons42842;

public class Solution {
    public int[] solution(int brown, int red) {
        int[] answer = {};
        
        int sum = brown + red;
        
        // i => 가로, j => 세로
        out:
        for(int i = 3 ; true ; i++) {
        	for(int j = 3 ; j<=i ; j++){
        		if(i*j == sum && (i-2)*(j-2)==red) {
        			answer = new int[] {i,j};
        			break out;
        		}
        	}
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		Solution sol = new Solution();
		int[] answer = sol.solution(24,24);
		System.out.println(answer[0]+","+ answer[1]);
	}
}
