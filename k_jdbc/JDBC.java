package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
	public static void main(String[] args) {
			/*
			 * JDBC(Java Database Connectivity)
			 *  - 자바와 데이터베이스를 연결해주는 라이브러리
			 *  - ojbc : 오라클 JDBC
			 *  
			 *  JDBC 작성 단계
			 *  1.Connection 생성(DB 연결)
			 *  2.Statement 생성(쿼리 작성)
			 *  3.Query 실행
			 *  4.ResultSet에서 결과 추출(select인 경우)
			 *  5.ResultSet, Statement, Connection 닫기
			 */
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	
		String user ="shc";
		String password ="java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스//자바와 오라클을 연결해주는 다리역할을 하고 있다.
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM MEMBER";
			ps = con.prepareStatement(sql);
			
				//select을 한 결과 
				rs = ps.executeQuery();
			
				//insert,update,delete
				//int result = ps.executeUpdate();
				while(rs.next()){//rs.next()-->조회된 데이터의 첫번째 행을 바라보게 된다. 그리고 첫번째행에서 데이터를 추출할 수 있게 되고 그다음행을 보게되고, 더이상 값이 없을 때 false가되며 종료된다.
				String memId = rs.getString(1);//index에 안에 자기가 원하는 행의 번호와 컬럼이름을 넣어 줄수있다.
				String memPass = rs.getString("MEM_PASS");
				System.out.println("MEM_ID : "+memId+" / MEM_PASS : "+memPass);
//				rs.getInt(columnIndex);
//				rs.getDate(columnIndex);
				
				
				
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if( rs != null) try{rs.close();} catch(Exception e){}
				if( ps != null) try{ps.close();} catch(Exception e){}
				if( con != null) try{con.close();} catch(Exception e){}
				
			}
		
		
	}//main end
}//JDBC class end
