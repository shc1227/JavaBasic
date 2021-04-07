package J_collection;

import java.util.ArrayList;
import java.util.HashMap;




public class value {
		
	public static void main(String[] args) {
		HashMap<String, Object> var = new HashMap<>();
		ArrayList<HashMap<String, Object>> board_table = new ArrayList<>();
		
		var.put("번호", "1");
		var.put("제목", "안녕하세요");
		var.put("작성자", "홍길동");
		var.put("작성일", "4/7");
		board_table.add(var);
		
		var = new HashMap<>();
		var.put("번호", "2");
		var.put("제목", "안녕하세요");
		var.put("작성자", "홍길동");
		var.put("작성일", "4/7");
		board_table.add(var);
		
		var = new HashMap<>();
		var.put("번호", "3");
		var.put("제목", "안녕하세요");
		var.put("작성자", "홍길동");
		var.put("작성일", "4/7");
		board_table.add(var);
		
		var = new HashMap<>();
		var.put("번호", "4");
		var.put("제목", "안녕하세요");
		var.put("작성자", "홍길동");
		var.put("작성일", "4/7");
		board_table.add(var);
	}
	
	
	
}
