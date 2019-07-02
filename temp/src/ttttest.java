import java.util.ArrayList;
import java.util.List;

public class ttttest {

	ArrayList<String> result = new ArrayList<>();
	ArrayList<ArrayList<String>> subResult = new ArrayList<ArrayList<String>>();
	ArrayList<String> temp = new ArrayList<String>();
	void test() {
		result.add("0");
		result.add("1");
		result.add("2");
		result.add("3");
		result.add("4");
		result.add("5");
		result.add("6");
		result.add("7");
		result.add("8");
		result.add("9");
		result.add("10");
		result.add("11");
		
		temp = new ArrayList<String>();
		temp.add(result.get(0));
		temp.add(result.get(1));
		temp.add(result.get(2));
		
		subResult.add(temp);
		
		temp = new ArrayList<String>();
		temp.add(result.get(3));
		temp.add(result.get(4));
		temp.add(result.get(5));
		
		subResult.add(temp);

		System.out.println(subResult.get(0));
	}
	public static void main(String[] args) {
		ttttest t = new ttttest();
		t.test();
		
		
	}

}
