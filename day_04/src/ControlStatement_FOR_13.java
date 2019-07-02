
public class ControlStatement_FOR_13 {

	public static void main(String[] args) {
		// 중첩된 구조의 반복문에서의 break, continue
		// break : IF문을 제외한 첫번째 영역을 빠져나가는 명령
		// continue : IF문을 제외한 첫번째 영역의 종료 지점으로 이동하는 명령


		// 중첩된 반복문을 종료하기 위한 라벨 jdk1.5이후로 사용가능
		out:
		for (int i = 1; i <= 3; i++) {
			
			in:
			for (int j = 1; j <= 3; j++) {
				
				// i 의 값이 2이고, j 의 값이 3일때 반복을 종료
				if(i == 2 && j == 2) { 		
					// out 영역을 빠져나가는 명령
					// break out;
					
					// out 영역의 종료지점으로 이동하는 명령
					// continue out;
				}
				
				System.out.printf("i -> %d, j -> %d\n",i,j);
			}
			System.out.println();
		}
	}

}
