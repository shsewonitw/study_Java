import java.util.Scanner;

public class ControlStatement_WHILE_03 {

	public static void main(String[] args) {
	
		// while문을 이용한 구구단 출력
		
		int i=2;
		
		while(i<=9) {
			int j=1;
			while(j<=9) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
