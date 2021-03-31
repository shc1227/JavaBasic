package x_game;

public class Dog implements Character{
	 private int experience=40;
     private int energy=50;
     private int level=1;
     
     
     @Override
     public void eat(){
    	 energy += 30;
    	 System.out.println("\"배부르다 멍! 체력↑\"");
         System.out.println("");
     }
     @Override
     public void sleep(){
    	 energy+=40;
    	 System.out.println("\"잠 자는 중...  체력↑\"");
         System.out.println("");
     }

	@Override
	public void play() {
		 energy-=30;
         experience+=30;
         System.out.println("\"힘듦.....체력↓\"");
         System.out.println("\"아이좋아~experience Up!\"");
         System.out.println("");
		
	}

	@Override
	public void train() {
		 energy-=20;
	        experience+=20;
	        System.out.println("\"산책이다 ㅎㅎ 체력↓\"");
	        System.out.println("\"아이좋아~experience Up!\"");
	        System.out.println("");
		
	}

	@Override
	public void levelUp() {
		 if(experience>60) {
	            experience-=40;
	            level++;
	            System.out.println("\"레벨↑ \""+ level);
	            System.out.println("");
	        }
	}

	@Override
	public boolean endGame() {
		boolean returnValue=true;
        if(level>9) {
            System.out.println("\"레벨10달성\"");
            System.out.println("\"강아지가 건강하게 성장하였습니다.\"");
            System.out.println("게임 끝");
            returnValue=false;
        }else if(energy<0) {
            System.out.println("\"강아지가 굶어 죽었습니다....\"");
            returnValue=false;
        }
        return returnValue;
	}

	@Override
	public void printInfo() {
		    System.out.println("─────────────────────");
	        System.out.println("  강아지 정보창    ");
	        System.out.println("  경험치: "+experience);
	        System.out.println("  체력: "+energy);
	        System.out.println("  level: "+level);
	        System.out.println("─────────────────────");
		
	}
     
}
