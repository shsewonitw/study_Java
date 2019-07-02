package tje.collection;

// Hashtable, HashMap Ŭ����
// �����ͺ��̽� ������ Ű ���� �˻��ϱ� ���ؼ� ������� �˰�����
// ������� �ۼ��� Ŭ����
// - �˻��� ���ؼ� ���Ǵ� Ŭ����
// - Key, Value�� ������ �� �ִ� Ŭ����
// - Key �� �ߺ��� ������� ����
// - Value �� �ߺ��� ����մϴ�.
// - ������ ����ȭ�� ���� ������ �ٸ�


import java.util.*;

public class Collection_10 {

	public static void main(String[] args) {
		// Ű ���� ���ڿ�, Value ���� ������ �Է¹޴�
		// HashMap ��ü�� ����
		HashMap<String, Integer> map_s = new HashMap<>();
		
		// Ű ���� ����, Value ���� ���ڿ��� �Է¹޴�
		// HashTable ��ü�� ����
		Hashtable<Integer, String> map_i = new Hashtable<>();

		// Hashtable, HashMap Ŭ������ put �żҵ带 ����Ͽ� �����͸� �߰�
		map_s.put("One", 1);	map_s.put("Two", 2);	map_s.put("Three", 3);
		map_i.put(1, "One");	map_i.put(2, "Two");	map_i.put(3, "Three");
		
		// Hashtable, HashMap Ŭ������ get �޼ҵ忡
		// Key ���� �����Ͽ� Value �� ��ȯ
		System.out.printf("One -> %d\n",map_s.get("One"));
		System.out.printf("3 -> %s\n",map_i.get(3));
		
		// Hashtable, HashMap Ŭ���� ������ �����͸�
		// �ݺ����� ���ؼ� �����ϴ� ����
		// 1. Enumeration Ÿ���� ����ϴ� ��� - Hashtable Ÿ��
		
		// Hashtable ��ü�� Ű�� ���� ��ȸ�� �� �ִ� keys �޼ҵ带 ����
		// (Enumeration Ÿ���� ��ü�� ��ȯ)
		Enumeration<Integer> enu = map_i.keys();
		// Enumeration Ÿ���� ��ü�� hasMoreElements �޼ҵ带 ����Ͽ� 
		// ������ �� �ִ� ���� ��Ұ� �ִ��� Ȯ���� �� ����
		while(enu.hasMoreElements()) {
			// Enumeration Ÿ���� ��ü�� nextElement �޼ҵ带 ����Ͽ�
			// ������ ��ҿ� ������ ��, �ش� ���� ��ȯ�մϴ�.
			Integer key = enu.nextElement();
			// ��ȯ���� Ű���� ����Ͽ� Hashtable���� ���� ����
			System.out.printf("Key : %d, Value : %s\n",key, map_i.get(key));
		}
		
		// 2. for ���� Ȱ���Ͽ� key ���� ��ȸ�ϴ� ��� - HashMap Ÿ��
		// HashMap Ŭ������ keySet �޼ҵ�� ����� ��� Ű���� �����ϰ� �ִ� Set ��ü�� ��ȯ
		for(String key: map_s.keySet())
			System.out.printf("Key : %s, Value : %d\n",key, map_s.get(key));

	}

}
