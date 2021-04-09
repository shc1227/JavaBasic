package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	
		String user ="shc";
		String password ="java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * "
					+ "FROM CART "
					+ "WHERE CART_MEMBER = ? "
					+ "AND CART_QTY > = ?";
			ps = con.prepareStatement(sql);//prepareStatement(?사용가능) vs Statement(?불가능)//물음표를 사용할수있는지의 여부
			ps.setString(1, "a001");
			ps.setInt(2, 10);
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();//메타데이터 : 데이터에 대한 데이터
			
			int columnCount = metaData.getColumnCount();// 컬럼 수
			
			for(int i=1;i<=columnCount;i++){
				System.out.print(metaData.getColumnName(i)+"\t");
			}
			System.out.println();
			while(rs.next()){
				for(int i =1;i<=columnCount;i++){
					Object value = rs.getObject(i);//모든 타입을 받아들 수 있게
					System.out.print(value + "\t");
				}
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if( rs != null) try{rs.close();} catch(Exception e){}
			if( ps != null) try{ps.close();} catch(Exception e){}
			if( con != null) try{con.close();} catch(Exception e){}
			
		}
	
		
		
		
		
	}//MAIN END
}//CLASS END
