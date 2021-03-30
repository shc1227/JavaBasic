package f_game3;

import e_oop.ScanUtil;

public class MiniGame1 {
	
	int p;
	
	
	void game1(int p){
		System.out.println("가위(0),바위(1),보(2)를 입력해주세요.");
		p = ScanUtil.nextInt();
		int c = (int)(Math.random()*3);
		//가위(0),바위(1),보(2)
		String[][]	game = new String[][]{{"비겼습니다.","졌습니다.","이겼습니다."},
										  {"이겼습니다.","비겼습니다.","졌습니다."},
										  {"졌습니다.","이겼습니다.","비겼습니다."}};
		
		
		
		System.out.println(c);
		System.out.println(game[c][p]);
		
	}
}
