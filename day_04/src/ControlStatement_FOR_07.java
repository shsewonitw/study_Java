
public class ControlStatement_FOR_07 {

	public static void main(String[] args) {
		// continue 키워드
		// if 문을 제외한 첫번째 영역의 종료 지점으로 이동하는 명령
		// 이동하는 명령 (빠져나가는 것이 아님)
		// 반복문에서만 사용할 수 있음
		// 반복문 내부에서 continue 키워드를 사용하면
		// 현재 반복을 중지하고 다음 반복으로 이동(건너뜀)할 수 있음
		
		for(int i = 1 ; i <= 10 ; i++) {
			if(i % 2 == 0)
				continue;
			
			System.out.printf("i = %d\n",i);
			
		}

	}

}
