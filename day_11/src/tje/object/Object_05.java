package tje.object;

import java.util.Scanner;

// Lotto�� ������ ���� �� ����� �� �ִ� 
// Ŭ������ �ۼ��ϼ���.
class Lotto {
	private static final int LOTTO_COUNT = 4;
	private static final int LOTTO_MIN_NUMBER = 1;
	private static final int LOTTO_MAX_NUMBER = 20;
		
	private int [] numbers;
	
	public Lotto() {		
		numbers = new int[LOTTO_COUNT];
	}
	
	public void generate() {
		for( int i = 0 ; i < LOTTO_COUNT ; i++ ) {
			int temp = (int)(Math.random() * LOTTO_MAX_NUMBER + LOTTO_MIN_NUMBER);
			if( !searchNumber(i, temp) )
				numbers[i] = temp;
			else
				i--;
		}
		
		sort();
	}
	
	private boolean searchNumber(int index, int target) {		
		for( int i = 0 ; i < index ; i++ ) {
			if( this.numbers[i] == target )
				return true;
		}
		return false;
	}
	
	private void sort() {
		// ������ �ζ� ��ȣ�� ����(��������)
		for( int i = 0 ; i < LOTTO_COUNT - 1 ; i++ ) {
			for( int j = i + 1 ; j < LOTTO_COUNT ; j++ ) {
				if( this.numbers[i] > this.numbers[j] ) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}		
	}
		
	public String toString() {
		String info = "";
		for( int i = 0 ; i < LOTTO_COUNT ; i++ )
			info += this.numbers[i] + " ";
		return info;	
	}

	public boolean equals(Object obj) {	
		// 1. Ÿ��üũ
		if( !(obj instanceof Lotto) )
			// 2. ������ Ÿ���� �ƴѰ�� false�� ��ȯ
			return false;
		
		// 3. ����ȯ
		Lotto target = (Lotto)obj;
		
		// 4. Ÿ���� ��ȯ�� ���۷����� ����Ͽ� ��� �ʵ��� ���� ��
		boolean result = true;
		for( int i = 0 ; i < LOTTO_COUNT ; i++ ) {
			if(this.numbers[i] != target.numbers[i]) {
				result = false;
				break;
			}
		}
		
		// 5. �񱳰���� ��ȯ
		return result;
	}
}

public class Object_05 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int lotto_count;
		System.out.print("�ζ� ������ �Է��ϼ��� : ");
		lotto_count = kb.nextInt();
		
		Lotto [] lottos = new Lotto[lotto_count];
		out:
		for( int i = 0 ; i < lottos.length ; i++ ) {
			lottos[i] = new Lotto();
			lottos[i].generate();
			
			for( int j = 0 ; j < i ; j++ ) {
				if( lottos[i].equals(lottos[j]) ) {
					System.out.println("������ �ζ� ��ȣ �߰� - " + lottos[i]);
					i--;
					continue out;
				}				
			}
			
			System.out.println(lottos[i]);
		}
	}
}












