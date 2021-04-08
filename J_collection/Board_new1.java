package J_collection;

import java.util.ArrayList;
import java.util.HashMap;

import e_oop.ScanUtil;


public class Board_new1 {
	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * -------------------------------
		 * 번호		제목		작성자	작성일
		 * -------------------------------
		 * 1	안녕하세요		홍길동	7/23
		 * 1	안녕하세요		홍길동	7/23
		 * 1	안녕하세요		홍길동	7/23
		 * -------------------------------
		 * 1.조회		2.등록	3.종료
		 */
		ArrayList<HashMap<String , Object>> boardList = new ArrayList<>();
		
		while(true){
			System.out.println("-----------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("-----------------------------");
			for(int i= boardList.size()-1;i>=0;i--){
				HashMap<String, Object> board= boardList.get(i); 
				System.out.println(board.get("board_no") + "\t"
						+ board.get("title") + "\t"
						+ board.get("user") + "\t"
						+ board.get("reg_date"));
			}
			System.out.println("------------------------------");
			System.out.println("1.조회\t2.등록\t0.종료");
			System.out.print("입력>");
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				read(boardList);
				break;
				
			case 2:
				insert(boardList);
				break;
				
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}//main

	static void insert(ArrayList<HashMap<String, Object>> boardList) {
		// TODO Auto-generated method stub
		
	}

	static void read(ArrayList<HashMap<String, Object>> boardList) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end
