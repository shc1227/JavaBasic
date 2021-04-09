package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class JDBC_INSERT {
	int board_no;
	String title;
	String content;
	String user_id;
	Date reg_date;
	int num;
	
	public void insert(String title,String content,
					   String user_id,Date reg_date) {
		
		JDBC_SELECT se =new JDBC_SELECT();
		
		this.title = title;
		this.content = content;
		this.user_id = user_id;
		this.reg_date = reg_date;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	
		String user ="shc";
		String password ="java";
		
		Connection con = null;
		PreparedStatement ps = null;
//		ResultSet rs = null;//--insert,update,delete에서는 필요가 없다.
		
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO TB_JDBC_BOARD(BOARD_NO,title,content,user_id,reg_date) "
					//+ "VALUES(?,?,?,?,TO_DATE(?,'YYYYMMDD'),?,?,?)";
//					  + "VALUES(?,?,?,?,?,?,?,?)";
					  + "VALUES((SELECT COUNT(*)+1 FROM TB_JDBC_BOARD),?,?,?,?)";
					
			ps = con.prepareStatement(sql);
//			ps.setInt(1, 9999);
//			ps.setString(2, "SHIN");
//			ps.setString(3, "INTERN");
//			ps.setInt(4, 7839);
//			//날짜
//			java.util.Date date = new java.util.Date();
//			date.setYear(21);
//			date.setMonth(3);//월은 0부터 시작
//			date.setDate(3);
//			date.setHours(16);
//			date.setMinutes(42);
//			date.setSeconds(55);
//			ps.setDate(5, Date.valueOf("2021-04-09"));
			
			
			
			//ps.setString(5, "20210101");
			//ps.setString(5, "sysdate");
//			ps.setInt(6, 800);
//			ps.setInt(7, 800);
//			ps.setInt(8, 40);
			
			
			
			
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, user_id);
			//ps.setDate(4, reg_date);
			ps.setDate(4, new Date(new java.util.Date().getTime()));
			
			int result = ps.executeUpdate();
			System.out.println("변경된 row :"+result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//			if( rs != null) try{rs.close();} catch(Exception e){}//--insert,update,delete에서는 필요가 없다.
			if( ps != null) try{ps.close();} catch(Exception e){}
			if( con != null) try{con.close();} catch(Exception e){}
			
		}
	
		
		
		
		
	}//MAIN END
}//CLASS END