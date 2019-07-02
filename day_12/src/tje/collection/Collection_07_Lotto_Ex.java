package tje.collection;

import java.util.*;

public class Collection_07_Lotto_Ex {
	public static void main(String[] args) {
		// �ζ� ������ �Է¹ޱ� ���� ��ĳ�� ��ü
		Scanner kb = new Scanner(System.in);
		// �� �ζǹ�ȣ�� ArrayList ��ü�� �����ϴ� 
		// ArrayList ��ü
		ArrayList< ArrayList<Integer> > lottos = new ArrayList<>();
		// ������ ����Ͽ� �ζ� ��ȣ�� �����ϱ� ���� ��ü ����
		Random random = new Random();
		
		System.out.print("�ζ� ������ �Է��ϼ��� : ");
		int count = kb.nextInt();
		
		for( int i = 1 ; i <= count ; i++ ) {
			// �ζ� ��ȣ�� �����ϱ� ���� HashSet ��ü ����
			HashSet<Integer> lotto = new HashSet<Integer>();
			// �ߺ��� ���ŵ� �ζ� ��ȣ�� 6���� �Ǵ� ��������
			// �ݺ��� ����
			while( lotto.size() < 6 )
				lotto.add(random.nextInt(45) + 1);
			
			// �ζ� ��ȣ�� �����Ǹ� ������ ����
			ArrayList<Integer> lotto_list = new ArrayList<Integer>(lotto);
			Collections.sort(lotto_list);
			
			// ������ �Ϸ�� ��, ����Ʈ�� �߰�
			lottos.add(lotto_list);
		}
		
		for( int i = 0 ; i < lottos.size() ; i++ ) {
			
			for( int j : lottos.get(i) )
				System.out.printf("%2d ", j);
			
			//ArrayList<Integer> lotto = lottos.get(i);
			//for( int j = 0 ; j < lotto.size() ; j++ )
			//	System.out.printf("%2d ", lotto.get(j) );
			System.out.println();
		}
	}
}









