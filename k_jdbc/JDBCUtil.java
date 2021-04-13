package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {
	//싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴
	private JDBCUtil(){
		
	}
	
	//인스턴스를 보관할 변수
	private static JDBCUtil instance;
	
	//인스턴스를 빌려주는 메서드
	public static JDBCUtil getInsatnace(){
		
		if(instance == null){
			instance = new JDBCUtil();
		}
		
		
		return instance;
		
	}
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";	
	String user ="shc";
	String password ="java";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	/*
	 * Map<String, Object> selectOne(String sql) -->조회의 결과가 한줄 일때  / ?없는쿼리
	 * Map<String, Object> selectOne(String sql, List<Object> param) --> ?있는쿼리
	 * List<Map<String, Object>> selectList(String sql)  -->조회의 결과가 여러줄  / ?없는쿼리
	 * List<Map<String, Object>> selectList(String sql,List<Object> param) --> ?있는쿼리
	 * int update(String sql)
	 * int update(String sql, List<Object> param)
	 * 
	 */
	
	
		public List<Map<String, Object>> selectList(String sql, List<Object> param){//default 는 같은 패키지 안에서만 접근가능
			List<Map<String, Object>> list = new ArrayList<>();
			try {
				con = DriverManager.getConnection(url, user, password);
				ps = con.prepareStatement(sql);
				for(int i=0; i< param.size();i++){
					ps.setObject(i+1, param.get(i));
				}
				rs = ps.executeQuery();
				
				ResultSetMetaData metaDate = rs.getMetaData();
				int columnCount = metaDate.getColumnCount();
				
				while(rs.next()){
					HashMap<String, Object> row = new HashMap<>();
					
					for(int i=1;i<=columnCount;i++){
						String key = metaDate.getColumnName(i);
						Object value = rs.getObject(i);
						row.put(key, value);
					}
					list.add(row);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if( rs != null) try{rs.close();} catch(Exception e){}
				if( ps != null) try{ps.close();} catch(Exception e){}
				if( con != null) try{con.close();} catch(Exception e){}
				
			}
			return list;
			
		}
	
		/*
		 * Map<String, Object> selectOne(String sql) -->조회의 결과가 한줄 일때  / ?없는쿼리
		 * Map<String, Object> selectOne(String sql, List<Object> param) --> ?있는쿼리
		 * List<Map<String, Object>> selectList(String sql)  -->조회의 결과가 여러줄  / ?없는쿼리
		 * List<Map<String, Object>> selectList(String sql,List<Object> param) --> ?있는쿼리
		 * int update(String sql)
		 * int update(String sql, List<Object> param)
		 * 
		 */
	
		Map<String, Object> selectOne(String sql, List<Object> param){
			//Map<String, Object> one = new HashMap<>(); null해주어야 한다. 결과를 여러줄인지 한줄인지 값이 없는지 알수 없기때문에
			Map<String, Object> row = null;
			try {
				con = DriverManager.getConnection(url,user,password);
				ps = con.prepareStatement(sql);
				for(int i=0;i<param.size();i++){
					ps.setObject(i+1, param.get(i));
				}
				rs = ps.executeQuery();
				
				ResultSetMetaData metaDate = rs.getMetaData();
				int columnCount = metaDate.getColumnCount();
				
				while(rs.next()){
					row = new HashMap<>();
				for(int i=1;i<=columnCount;i++){
					String key = metaDate.getColumnName(i);
					Object value = rs.getObject(i);
					row.put(key, value);
				}
				
				}
				
			} catch (SQLException e) {
			
				e.printStackTrace();
			}finally{
				if( rs != null) try{rs.close();} catch(Exception e){}
				if( ps != null) try{ps.close();} catch(Exception e){}
				if( con != null) try{con.close();} catch(Exception e){}
				
			}
			
			return row;
			
		}
		
		
		int update(String sql, List<Object> param){
			try {
				con = DriverManager.getConnection(url,user,password);
				ps = con.prepareStatement(sql);
				for(int i=0;i<param.size();i++){
					ps.setObject(i+1, param.get(i));
				}
				
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if( ps != null) try{ps.close();} catch(Exception e){}
				if( con != null) try{con.close();} catch(Exception e){}
				
			}
			return 0;
			
			
			
		}
	
	
	
	
}//class JDBCUtil end
