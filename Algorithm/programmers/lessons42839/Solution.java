//package lessons42839;
//
//import java.util.*;
//
//public class Solution {
//	public int solution(String numbers) {
//        int answer = 0;
//        String [] nums = new String[numbers.length()];
//		HashSet<Integer> hs = new HashSet<>();
//		
//        for(int i = 0 ; i < numbers.length() ; i++) {
//			nums[i] = String.valueOf(numbers.charAt(i));
//		}
//        
//        String [] temp = nums;
//        
////        125487
////        1 2 5 4 8 7 
////        1 12 15 14 18 17 125 124 128 127 152 154 158 157 
//        
//        for(int i = 0 ; i < temp.length ; i++) {
//        	temp[i]
//        }
//		
//		
//        return answer;
//    }
//	
//	public boolean isPrime(int num) {
//		if(num == 1)
//			return false;
//		for(int i = 2 ; i < num ; i++) {
//			if(num % i == 0) 
//				return false;
//		}
//		return true;
//	}
//	
//	public static void main(String[] args) {
//		HashSet<Integer> hs = new HashSet<>();
//
//		hs.add(1);
//		hs.add(2);
//		hs.add(1);
//		
//		Iterator<Integer> it = hs.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
//	}
//}
