package lessons12899;

class Solution {
	public String solution(int n) {
		String answer = "";
		String temp= "";
		while(true) {
			if(n%3 == 0) {
				temp += 4;
			}
			else {
				temp += n%3;
			}
			
			
			if(n <= 3 )
				break;
			
			n = n/3;
			
		}
		
		return temp;
	}
	
		public static void main(String[] args) {
			Solution sol = new Solution();
			System.out.println(sol.solution(27));
		}
}

/*
temp = 24
20 % 3 = 2
20 / 3 = 6
6 % 3 = 0
6 / 3 = 2
2 % 3 = 2

26 % 3 = 2
26 / 3 = 8
8 % 3 = 2
8 / 3 = 2
2 % 3 = 2


1->  1			2-> 2		3-> 4     	1 2 7
4->  11	(10)	5-> 12		6-> 14		1 2 7
7->  21	(10)	8-> 22		9-> 24		1 2 17
10-> 41	(20)	11-> 42		12-> 44		1 2 67
13-> 111(70)	14-> 112	15-> 114	1 2 7
16-> 121(10)	17-> 122	18-> 124	1 2 17
19-> 141(20)	20-> 142	21-> 144	1 2 67
22-> 211(70)	23-> 212	24-> 214	1 2 7
25-> 221(10)	26-> 222	27-> 224
28-> 241(20)
31-> 411(170)
	 421(10)
	 441(20)
	 1111(670)
	
	31 % 3 = 1
	31 / 3 = 10
	10 % 3 = 1
	10 / 3 = 3
	3 % 3 = 4
	3 / 3 = 1
	
	26 % 3 = 2
	26 / 3 = 8
	8 % 3 = 2
	8 / 3 = 2
	2 % 3 = 2
	2 / 3 = 0
*/