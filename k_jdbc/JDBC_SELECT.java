package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC_SELECT {
	

	
	
	
	
	

	public void select() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	
		String user ="shc";
		String password ="java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM TB_JDBC_BOARD ORDER BY BOARD_NO DESC";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			ResultSetMetaData metaDate = rs.getMetaData();
			int columnCount = metaDate.getColumnCount();
			
			for(int i=1;i<columnCount+1;i++){
				System.out.print(metaDate.getColumnName(i)+"    \t");
			}
			System.out.println();
			
		
			while(rs.next()){
				
				
				for(int i=1; i<columnCount+1;i++){
				
					Object value = rs.getObject(i);
					System.out.print(value + "\t\t");
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

	}
}//CLASS END
