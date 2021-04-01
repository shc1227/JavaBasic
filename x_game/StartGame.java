package x_game;


public class StartGame {// 	← 게임실행 클래스
	public static void main(String[] args) {
		 System.out.println("────────────────────────────");
		 System.out.println("	강아지 키우기			");
		 System.out.println("");
		 System.out.println("────────────────────────────");
		 System.out.println("※☆★☆★☆★☆★게임방법☆★☆★☆★☆★※");
		 System.out.println("강아지를 만족시켜 레벨20을 달성하세요.");
		 System.out.println("레벨이 높을 수록 훈련성공 확률이 높아집니다.");
		 System.out.println("강아지 체력이 0이되면 GAME OVER.");
		 System.out.println("※☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆※");
		 
		 
		 PlayGame pg = new PlayGame();
		 MakeCharacter mc = new MakeCharacter();
		 Character selectCharacter=mc.selectCharacter();
		
		 
		 pg.play(selectCharacter);
        
        
        
    }
}
