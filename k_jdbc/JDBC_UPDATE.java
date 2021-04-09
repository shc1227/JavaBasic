package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_UPDATE {
	int board_no;
	String title;
	String content;
	String user_id;
	Date reg_date;
	
	
	
	 public void update(int board_no, String title, String content,
		    String user_id) {
		 	String url = "jdbc:oracle:thin:@localhost:1521:xe";	
			String user ="shc";
			String password ="java";
			
			Connection con = null;
			PreparedStatement ps = null;
//			ResultSet rs = null;--insert,update,delete에서는 필요가 없다.
			
			
			try {
				con = DriverManager.getConnection(url, user, password);
				String sql ="UPDATE TB_JDBC_BOARD SET TITLE =?, CONTENT=? ,USER_ID =? "
						+ " WHERE BOARD_NO =? ";
				ps = con.prepareStatement(sql);
				ps.setString(1, title);
				ps.setString(2, content);
				ps.setString(3, user_id);
				ps.setInt(4, board_no);
			
				int result = ps.executeUpdate();
			System.out.println(result);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
//				if( rs != null) try{rs.close();} catch(Exception e){}--insert,update,delete에서는 필요가 없다.
				if( ps != null) try{ps.close();} catch(Exception e){}
				if( con != null) try{con.close();} catch(Exception e){}
				
			}

	}
}//CLASS END