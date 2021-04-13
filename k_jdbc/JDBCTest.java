package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCTest {
	public static void main(String[] args) {
		
		JDBCUtil jdbc = JDBCUtil.getInsatnace();
//		여러줄	
//		String sql = "SELECT * FROM CART WHERE CART_MEMBER = ?";
//		ArrayList<Object> param = new ArrayList<>();
//		param.add("a001");
//		
//		List<Map<String,Object>>list = jdbc.selectList(sql, param);
//		
//		for(int i = 0;i<list.size();i++){
//			Map<String,Object> row = list.get(i);
//			for(String key : row.keySet()){
//				System.out.print(key + " : "+ row.get(key)+"\t");
//				
//			}
//			System.out.println();
//		}
		
//		String sql ="SELECT * FROM CART WHERE CART_MEMBER = ? ";  
//		ArrayList<Object> param = new ArrayList<>();
//		
//		param.add("a001");
//
//		Map<String,Object> one = jdbc.selectOne(sql, param);
//			
//			for(String key : one.keySet()){
//				System.out.print(key + " : "+ one.get(key)+"\t");
//			}
		String sql ="UPDATE SET";  
		ArrayList<Object> param = new ArrayList<>();
		
		param.add("a001");

		Map<String,Object> row = jdbc.selectOne(sql, param);
			if(row == null){
				for(String key : row.keySet()){
					System.out.print(key + " : "+ row.get(key)+"\t");
				}		
			}
			
		
	}//main end
}//class jdbctest end
