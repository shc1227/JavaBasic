package J_collection;

import java.util.ArrayList;
import java.util.HashMap;




import e_oop.ScanUtil;

public class Board {
	public static void main(String[] args) {
			
		/*
		 * ArrayList 와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * ---------------------------------
		 * 번호		제목		작성자		작성일
		 * 4	안녕하세요		홍길동		4/7
		 * 3	안녕하세요		홍길동		4/7
		 * 2	안녕하세요		홍길동		4/7
		 * 1	안녕하세요		홍길동		4/7
		 * ----------------------------------
		 * 
		 * 1.조회		2.등록	0.종료
		 * -조회후 수정 및 삭제가능
		 * 
		 */
		
		
		
		HashMap<String, Object> var = new HashMap<>();
		ArrayList<HashMap<String, Object>> board_table = new ArrayList<>();
		
		var.put("번호", "1");
		var.put("제목", "안녕하세요");
		var.put("작성자", "홍길동");
		var.put("작성일", "4/7");
		board_table.add(var);
		
		var = new HashMap<>();
		var.put("번호", "2");
		var.put("제목", "안녕하세요");
		var.put("작성자", "홍길동");
		var.put("작성일", "4/7");
		board_table.add(var);
		
		var = new HashMap<>();
		var.put("번호", "3");
		var.put("제목", "안녕하세요");
		var.put("작성자", "홍길동");
		var.put("작성일", "4/7");
		board_table.add(var);
		
		var = new HashMap<>();
		var.put("번호", "4");
		var.put("제목", "안녕하세요");
		var.put("작성자", "홍길동");
		var.put("작성일", "4/7");
		board_table.add(var);
		
//		System.out.println("--------------------------------------------------------");
//		System.out.println("번호\t\t제목\t\t작성자\t\t작성일");
//		
//		for(int i=board_table.size()-1;i>=0;i--){
//			HashMap<String, Object> var_a = board_table.get(i);
//			System.out.println(var_a.get("번호")+"\t\t"+var_a.get("제목")+"\t\t"+var_a.get("작성자")+"\t\t"+var_a.get("작성일"));
//		}
		System.out.println("--------------------------------------------------------");
		
	
		
		//변수
		String num;
		int numInt;
		HashMap<String, Object> var_b; 
		
		
		
	
		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("--------------------------------------------------------");
			System.out.println("1.조회\t2.등록\t3.수정\t4.삭제\t0.종료");
			System.out.print("번호입력>");
			String input = ScanUtil.nextLine();
		
		switch (input) {
		case "1"://조회
			System.out.println("-조회하기-");
			System.out.println();
			
			System.out.println("1.전체조회\t\t2.부분조회");
			System.out.println("입력>");
			input = ScanUtil.nextLine();
			
			switch(input){
			case "1"://전체조회
				System.out.println("--------------------------------------------------------");
				System.out.println("번호\t\t제목\t\t작성자\t\t작성일");
				
				for(int i=board_table.size()-1;i>=0;i--){
					HashMap<String, Object> var_a = board_table.get(i);
					
					
					
					System.out.println(var_a.get("번호")+"\t\t"+var_a.get("제목")+"\t\t"+var_a.get("작성자")+"\t\t"+var_a.get("작성일"));
				}
				System.out.println("--------------------------------------------------------");
				System.out.println("정렬한 것↓");
				System.out.println("--------------------------------------------------------");
				for(int i=0;i<board_table.size();i++){//정렬
					int min =i;
					for(int j=i+1;j<board_table.size();j++){
						HashMap<String, Object> var1 = board_table.get(j);//비교값a
						String a = (String) var1.get("번호");
						int aInt = Integer.parseInt(a);
						HashMap<String, Object> var2 = board_table.get(min);//최소값
						String b = (String) var2.get("번호");
						int bInt = Integer.parseInt(b);
						if(aInt<bInt){
							min =j;	
						}
						HashMap<String, Object> temp = board_table.get(i);
						board_table.set(i,board_table.get(min));
						board_table.set(min, temp);
					}
					
				}
				System.out.println("번호\t\t제목\t\t작성자\t\t작성일");
				for(int i=board_table.size()-1;i>=0;i--){
					HashMap<String, Object> var_a = board_table.get(i);
					System.out.println(var_a.get("번호")+"\t\t"+var_a.get("제목")+"\t\t"+var_a.get("작성자")+"\t\t"+var_a.get("작성일"));
				}

				
				
				System.out.println("--------------------------------------------------------");

				break;
			case "2"://부분조회
				System.out.print("찾을 번호입력>");
				num = ScanUtil.nextLine();
				numInt = Integer.parseInt(num)-1;
				var_b = board_table.get(numInt);
				System.out.println("번호\t\t제목\t\t작성자\t\t작성일");
				System.out.println(var_b.get("번호")+"\t\t"+var_b.get("제목")+
						"\t\t"+var_b.get("작성자")+"\t\t"+var_b.get("작성일"));
				
				break;
			}
			
			
			
			break;
		
		case "2":
			System.out.println("등록하기");
			System.out.println("번호 입력>");
			int AA = ScanUtil.nextInt();
			String AAstr = String.valueOf(AA);
			var = new HashMap<>();
			var.put("번호",AAstr );
			System.out.println("제목 입력>");
			String BBstr =ScanUtil.nextLine();
			var.put("제목",BBstr );
			System.out.println("작성자 입력>");
			var.put("작성자", ScanUtil.nextLine());
			System.out.println("작성일 입력>");
			var.put("작성일", ScanUtil.nextLine());
			board_table.add(var);
			System.out.println("등록되었습니다.");
			break;
		case "3":
			System.out.println();
			System.out.println("수정하기");
			System.out.print("수정 하고 싶은 행 번호입력>");
			int alter_num = ScanUtil.nextInt()-1;
			board_table.remove(alter_num);
			System.out.println("번호 입력>");
			var = new HashMap<>();
			var.put("번호",ScanUtil.nextLine());
			System.out.println("제목 입력>");
			var.put("제목",ScanUtil.nextLine() );
			System.out.println("작성자 입력>");
			var.put("작성자", ScanUtil.nextLine());
			System.out.println("작성일 입력>");
			var.put("작성일", ScanUtil.nextLine());
			board_table.add(var);
			System.out.println("수정되었습니다.");
			
			
			break;	
		case "4":
			System.out.println();
			System.out.println("삭제하기");
			System.out.println("삭제하고 싶은 번호 입력>");
			int remove_num = ScanUtil.nextInt()-1;
			board_table.remove(remove_num);
			System.out.println("삭제되었습니다.");
	
			break;	
		
		case "0":
				System.out.println("종료되었습니다.");
				System.exit(0);
			break;	

		default:
			break;
		}
		
		}
		
	
		
		
		
		
		
		
		
		
		
		
	}
}



	



