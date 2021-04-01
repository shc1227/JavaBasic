package x_game;

public class Cat implements Character{
	 private int experience=40;
     private int energy=50;
     private int level=1;
     private String state="무관심";//1~3 :무관심//4~7:관심8~10:행복
	@Override
	public void eat() {
		energy += 30;
   	 System.out.println("\"배부르다 냥! 체력↑\"");
        System.out.println("");
	}

	@Override
	public void sleep() {
		 energy+=40;
    	 System.out.println("\"잠 자는 중...  체력↑\"");
         System.out.println("");
		
	}

	@Override
	public void play() {
		 energy-=30;
         experience+=30;
         System.out.println("\"헥헥.....체력↓\"");
         System.out.println("\"즐겁다~ 경험치↑\"");
         System.out.println("");
		
	}

	@Override
	public void train() {
		energy-=20;
        experience+=20;
        System.out.println("\"인사를 배웠습니다. 체력↓\"");
        System.out.println("\"아이좋아~  경험치↑\"");
		
	}

	@Override
	public void levelUp() {
		if(experience>60) {
            experience-=40;
            level++;
            System.out.println("\"레벨↑ \""+ level);
            //상태변화
            if(0<level && level<=4){
				state = "무관심";
			}else if(4<level && level<8){
				state = "관심";
			}else{
				state = "행복";
			}
        }
		
	}

	@Override
	public boolean endGame() {
		boolean returnValue=true; //게임종료 판단
        if(level>9) {
            System.out.println("\"레벨10달성\"");
            System.out.println("\"강아지가 건강하게 성장하였습니다.\"");
            System.out.println("\tGAME OVER");
            returnValue=false;
        }else if(energy<0) {
            System.out.println("\"강아지가 집을 나갔습니다....\"");
            System.out.println("\tGAME OVER");
            returnValue=false;
        }
        return returnValue;
	}
	

	@Override
	public void printInfo() {
		System.out.println("─────────────────────");
        System.out.println("  고양이 정보창    ");
        System.out.println("  경험치 : "+experience);
        System.out.println("  체력 : "+energy);
        System.out.println("  상태 : "+state);
        System.out.println(" level :"+level);
        System.out.println("─────────────────────");
	}

}
