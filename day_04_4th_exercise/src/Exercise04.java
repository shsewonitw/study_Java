
public class Exercise04 {

	public static void main(String[] args) {
		boolean flag = true;
		do {
			int randNum1 = (int) (Math.random() * 6 + 1);
			int randNum2 = (int) (Math.random() * 6 + 1);
			System.out.printf("(%d,%d)\n", randNum1, randNum2);

			if (randNum1 + randNum2 == 5)
				flag = false;
		} while (flag);
	}

}
