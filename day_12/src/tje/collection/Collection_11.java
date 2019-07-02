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

public class Collection_11 {

	public static void main(String[] args) {
		HashMap<String, Integer> map_s = new HashMap<>();
		Hashtable<Integer, String> map_i = new Hashtable<>();

		map_s.put("One", 1);	map_s.put("Two", 2);	map_s.put("Three", 3);
		map_i.put(1, "One");	map_i.put(2, "Two");	map_i.put(3, "Three");
		
		System.out.printf("map_s.size -> %d\n",map_s.size());
		System.out.printf("map_i.size -> %d\n",map_i.size());
		
		
		// �ߺ��� Ű ������ �����͸� �߰�
		// (�������� ����� �������� ����)
		map_s.put("Two", 22);
		map_i.put(3, "T");
		
		System.out.printf("map_s.size -> %d\n",map_s.size());
		System.out.printf("map_i.size -> %d\n",map_i.size());
		
		// ������ Ű������ Value�� �ԷµǴ� ���
		// ������ Value ���� �����˴ϴ�.
		System.out.printf("map_s.Two -> %d\n",map_s.get("Two"));
		System.out.printf("map_s.Two -> %s\n",map_i.get(3));
		
	}

}
