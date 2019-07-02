import java.util.Scanner;
public class Array_11 {

	public static void main(String[] args) {
		// 사용자에게 배열의 크기를 입력받아 배열을 생성하고,
		// 각 요소에 값을 입력받아 입력된 정수/총점/평균을 출력하세요/
		// 최대값, 최소값을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int [] scores = new int[sc.nextInt()];
		
		int sum=0, max=0, min=0;
		double avg;
		
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.printf("%d번째 정수 : ",i+1);
			scores[i] = sc.nextInt();
			sum += scores[i];
			
			if(i==0)
				max = min = scores[i];
			else {
				if(scores[i]>max)
					max = scores[i];
				if(scores[i]<min)
					min = scores[i];
			}
		}
		avg = (double)sum/scores.length;
		
		System.out.print("입력된 정수 : < ");
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.print(scores[i]+" ");
		}
		System.out.println(">");
		System.out.printf("총점 : %d, 평균 : %.2f, 최대 : %d, 최소 : %d\n",sum,avg,max,min);
		
	}

}
