package lessons12982;

public class Solution {
	  public int solution(int[] d, int budget) {
	      int answer = 0;
	      int temp;
	      for(int i = 0 ; i < d.length-1 ; i++) {
	    	  for(int j = i+1 ; j < d.length ; j++) {
	    		  if(d[i] > d[j]) {
	    			  temp = d[i];
	    			  d[i] = d[j];
	    			  d[j] = temp;
	    		  }  
	    	  }
	      }
	      
	      int sum=0;
	      for(int i : d) {
	    	  sum += i;
	    	  if(sum <= budget)
	    		  answer++;
	      }
	    
	      return answer;
	  }
	  
	  public static void main(String[] args) {
		Solution sol = new Solution();
		int[] d = {1,3,2,5,4};
		int answer = sol.solution(d, 9);
		System.out.println(answer);
	}
}


     