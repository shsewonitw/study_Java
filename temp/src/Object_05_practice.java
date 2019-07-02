
class Lotto {
	private static final int LOTTO_SIZE = 4; 
	private static final int LOTTO_MIN_NUMBER = 1;
	private static final int LOTTO_MAX_NUMBER = 20;
	private int [] numbers;
	
	private Lotto() {
		numbers = new int[LOTTO_SIZE];
	}
	
	public void generate() {
		for(int i = 0 ; i < LOTTO_SIZE ; i++) {
			int randNum = (int)(Math.random() * LOTTO_MAX_NUMBER + LOTTO_MIN_NUMBER);
			if( !isOverlap(i,randNum))
				numbers[i] = randNum;
			else
				i--;
		}
		
		sort();
	}
	
	private void sort() {
		
	}
	
	private boolean isOverlap(int index , int target) {
		for(int i = 0 ; i < index ; i++) {
			if(numbers[index] == target)
				return true;
		}
		return false;	
	}
}

public class Object_05_practice {
	public static void main(String[] args) {
		
	}
}
