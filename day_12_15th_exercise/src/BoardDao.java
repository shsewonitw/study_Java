import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private List<Board> list = new ArrayList<>();
	
	public BoardDao() {
		list.add(new Board("����1","����1"));
		list.add(new Board("����2","����2"));
		list.add(new Board("����3","����3"));
	}
	
	public List<Board> getBoardList() {
		return list;
	}
}
