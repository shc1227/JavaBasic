package k_jdbc;

import java.sql.Date;
import java.util.Scanner;

import e_oop.ScanUtil;

public class JDBCBoard {
	/*
	 * INSERT INTO MEMBER
	 * 
	 * 10분전꺼 조회
	 * select *
	 * from member as of timestamp(systimestamp - interval '10' minute)
	 * where mem_id ='a001'
	 */
	

	
	public static void main(String[] args) {
		int board_no = 0;
		String title = null;
		String content = null;
		String user_id= null;
		Date reg_date = null;
		
		
		// 오라클 데이터베이스에 생성한 게시판 테이블을 이용해 게시판 프로그램을 만들어주세요.
		JDBC_SELECT sel = new JDBC_SELECT();
		JDBC_INSERT ins = new JDBC_INSERT();
		JDBC_UPDATE upd = new JDBC_UPDATE();
		JDBC_DELETE del = new JDBC_DELETE();
		System.out.println("------------------------------");
		System.out.println("\tJDBC게시판");
		System.out.println("------------------------------");
		
		while(true){
			
		
		System.out.println("\n\n\n");
		System.out.println("1.조회\t2.입력\t3.수정\t4.삭제\t0.종료");
		System.out.print("입력 >");
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1:
			System.out.println("\n조회");
			sel.select();
			
			break;
		case 2:
			System.out.println("\nJDBC게시판 내용작성");
			
			System.out.println("제목 입력[ex) 제목]");
			title = ScanUtil.nextLine();
			System.out.println("내용 입력 [ex) 오늘도 수고하셨습니다.]");
			content = ScanUtil.nextLine();
			System.out.println("작성자 입력[ex) 홍길동]");
			user_id= ScanUtil.nextLine();
			System.out.println("날짜 입력[ex) 2021-01-01] :");
			reg_date = Date.valueOf(ScanUtil.nextLine());
			
			
			
			
			ins.insert(title, content, user_id, reg_date);
			System.out.println("입력완료");
			break;
		case 3:
			
			
			System.out.println("수정 할 번호 입력[ex) 11]");
			board_no = ScanUtil.nextInt();
			System.out.println("제목 입력[ex) 제목]");
			title = ScanUtil.nextLine();
			System.out.println("내용 입력 [ex) 오늘도 수고하셨습니다.]");
			content = ScanUtil.nextLine();
			System.out.println("작성자 입력[ex) 홍길동]");
			user_id= ScanUtil.nextLine();
			upd.update(board_no, title, content, user_id);
			
			
			System.out.println("업데이트완료");
			break;
			
		case 4:
			del.delete(board_no);
			System.out.println("\nJDBC게시판 삭제");
			System.out.println("삭제할 열의 번호 입력");
			System.out.println("번호 입력시 [ex) 0001 네자리까지입력]");
			board_no = ScanUtil.nextInt();
			System.out.println("삭제완료");
			break;
		case 0:
			System.out.println("종료되었습니다.");
			System.exit(0);
			break;
			
		}
		
		
		
		
		
		
		}
		
	}

}
