package lessons42862;
/*
class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int count = 0;

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (reserve[j] == lost[i]) {
					reserve[j] = -1;
					lost[i] = -1;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (reserve[j] == lost[i] - 1) {
					reserve[j] = -1;
					lost[i] = -1;
				} else if (reserve[j] == lost[i] + 1) {
					reserve[j] = -1;
					lost[i] = -1;
				}
			}

		}

		for (int i = 0; i < lost.length; i++) {
			if (lost[i] != -1)
				count++;
		}
		answer = n - count;
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] lost = { 1, 2 };
		int[] reserve = { 2, 3 };
		System.out.println(sol.solution(3, lost, reserve));
	}
}
*/

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n;

        for(int i = 0; i < lost.length; i++) {
            boolean rent = false;
            int j = 0;
            while(!rent) {
                if(j == reserve.length)                   break;
                if(lost[i] == reserve[j])                {reserve[j] = -1; rent=true;}
                else if(lost[i] - reserve[j] == 1 )      {reserve[j] = -1; rent=true;}
                else if(lost[i] - reserve[j] == -1)      {reserve[j] = -1; rent=true;}
                else                                     {j++;                      }
            }
            if(!rent) answer--;
        }
        return answer;
    }
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] lost = { 1, 2 };
		int[] reserve = { 2, 3 };
		System.out.println(sol.solution(3, lost, reserve));
	}
}