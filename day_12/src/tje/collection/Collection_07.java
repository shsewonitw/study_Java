package tje.collection;

// HashSet Ŭ����
// �������� �ߺ��� ������� �ʰ� �����ϴ� Ŭ����
// - �˻��� ���ؼ� ���Ǵ� Ŭ����
// - �ߺ��� ���� �����ϸ鼭 �����͸� �����ϱ� ���� ���

import java.util.*;
public class Collection_07 {

	public static void main(String[] args) {
		// Hash Ÿ���� �÷��� Ŭ�������� �������� �ߺ��� ������� �ʽ��ϴ�.
		HashSet<String> set = new HashSet<String>();
		
		for(int i = 1 ; i < 11 ; i++) 
			set.add("Value-" +i);
		
		// HashSet Ÿ���� ��ü ���θ� ��ȸ�ϴ� ���
		// 1. Iterator ��ü�� ����ϴ� ���
		//  - Iterator ��ü�� �÷��� ������ �����͸�
		//    ��ȸ�Ҽ� �ִ� ��ü
		
		// Set Ÿ���� ���θ� ��ȸ�� �� �ִ� Iterator ��ü ��ȯ
		Iterator<String> iter = set.iterator();
		// Iterator ��ü�� hasNext �޼ҵ�� ������ ������
		// ����� ���������� ��ȯ(true/false)
		while(iter.hasNext()) {
			// Iterator ��ü�� next �޼ҵ�� ������ ��ҿ� �����Ͽ�
			// �ش� ���� ��ȯ�ϴ� �޼ҵ�
			System.out.println(iter.next());
		}
		
		// 2. for���� ����ϴ� ���(������ ����)
		//  - for( �ڷ��� ������ : ��ȸ�� �� �ִ� Ÿ��(�迭, �÷���) )
		//			�迭/�÷������κ��� ������ ������ ����ϴ� �ڵ�
		System.out.println("========================");
		for(String value : set) {
			System.out.println(value);
		}
	}
}
