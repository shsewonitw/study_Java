package lessons12947;

import java.util.ArrayList;

public class Solution {
	public boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		int temp = x;
//		ArrayList<Integer> list = new ArrayList<Integer>();

		while (temp != 0) {
//			list.add(x % 10);
			sum += temp % 10;
			temp = temp / 10;
		}

		if(x % sum == 0)
			answer = true;
		else
			answer = false;
		
		return answer;
	}
}


