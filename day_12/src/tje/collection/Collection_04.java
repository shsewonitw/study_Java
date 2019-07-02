package tje.collection;

// ���׸��� �����ϴ� ����� ���� Ŭ������ ����
// class Ŭ������ <Ÿ�Թ��� - T(�ټ����� ����� �� ����)> {
// 		Ŭ������ ����....
// }

class Contents <T> {
	private T data;
	public Contents(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}

public class Collection_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contents <Integer> intContents = new Contents<>(10);
		Contents <Double> doubleContents = new Contents<>(10.1);
		
		System.out.println(intContents.getData());
		System.out.println(doubleContents.getData());
	}

}
