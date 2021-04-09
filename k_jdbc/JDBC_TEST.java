package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_TEST {

	public static void main(String[] args) {
			
		String url  ="jdbc:oracle:thin:@localhost:1521:xe";
		String user ="shc"; 
		String password = "java";
		
		
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//select * from lprod;
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql ="SELECT * FROM LPROD";
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()){
				int lprod_id = rs.getInt("LPROD_ID");
				String lprod_gu = rs.getString("LPROD_GU");
				String lprod_nm = rs.getString("LPROD_NM");
				
				System.out.println("LPROD_ID : "+lprod_id+"LPROD_GU : "+lprod_gu+"LPROD_NM : "+lprod_nm);
			}
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(rs!=null)try{rs.close();}catch (Exception e) {}
			if(ps!=null)try{ps.close();}catch (Exception e) {}
			if(con!=null)try{con.close();}catch (Exception e) {}
		}
		
	}

}
