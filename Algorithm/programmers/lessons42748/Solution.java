package lessons42748;

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
    	int[] answer = new int[commands.length];

        
        
        for(int i = 0; i < commands.length; i++) {
        	ArrayList<Integer> temp = new ArrayList<>();
            for(int j = commands[i][0] ; j <= commands[i][1] ; j++) {
            	temp.add(array[j-1]);
            }
            Collections.sort(temp);
            int a = temp.get(commands[i][2]-1);
            answer[i] = a;
        }
        return answer;
    }
    
    public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = { {2,5,3}, {4,4,1}, {1,7,3} };
		Solution sol = new Solution();
		int[] answer = sol.solution(array, commands);
		for(int i = 0 ; i < answer.length ; i++ ) {
			System.out.println(answer[i]);
		}
	}
}