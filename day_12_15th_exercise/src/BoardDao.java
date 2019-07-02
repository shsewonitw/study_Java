import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private List<Board> list = new ArrayList<>();
	
	public BoardDao() {
		list.add(new Board("力格1","郴侩1"));
		list.add(new Board("力格2","郴侩2"));
		list.add(new Board("力格3","郴侩3"));
	}
	
	public List<Board> getBoardList() {
		return list;
	}
}
