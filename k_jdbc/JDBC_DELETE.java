package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_DELETE {
	int board_no;
	String title;
	String content;
	String user_id;
	Date reg_date;
	
	
	
	public void delete(int board_no) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	
		String user ="shc";
		String password ="java";
		
		Connection con = null;
		PreparedStatement ps = null;
//		ResultSet rs = null;--insert,update,delete에서는 필요가 없다.
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "DELETE FROM TB_JDBC_BOARD WHERE BOARD_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1,board_no );
			int r = ps.executeUpdate();
			System.out.println(r);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//			if( rs != null) try{rs.close();} catch(Exception e){}--insert,update,delete에서는 필요가 없다.
			if( ps != null) try{ps.close();} catch(Exception e){}
			if( con != null) try{con.close();} catch(Exception e){}
			
		}

	}
	
}//CLASS END