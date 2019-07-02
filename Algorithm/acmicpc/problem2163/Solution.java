package problem2163;

import java.util.Scanner;

public class Solution {
	
	public int solution(int N, int M) {
		int result=0;
		
		result = N*M-1;
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		System.out.println(N*M-1);
	}
}
