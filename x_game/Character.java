package x_game;

public interface Character {//인터페이스를 통행 캐릭터의  추상메서드를 생성하였습니다. 
	 void eat();			//먹이주기 메서드	
     void sleep();			//잠재우기 메서드
     void play();			//놀아주기 메서드
     void train();			//훈련시키기 메서드
     void levelUp();		//레벨업 메서드
     boolean endGame();		//게임 종료 메서드
     void printInfo();		//정보창 메서드
     
}
