package x_game;

import e_oop.ScanUtil;

public class Dog implements Character{
	 private int experience=0;
     private int energy=50;
     private int level=1;
     private String state ="어리숙함";//1~3 :평범//4~7:만족8~10:행복
     private boolean success = false;
     private int probability;
     @Override
	public void eat(){
    	
    	 	 System.out.println(" ◆먹을 것을 선택해주세요.");
    		 System.out.println("1.고급사료 \n2.중급사료 \n3.물 ");
    		 System.out.println("4.초콜릿");
             System.out.println("입력>>");
             String select = ScanUtil.nextLine();
             switch (select) {
             case "1":
            	 energy += 50;
            	 System.out.println("┏");
            	 System.out.println(" \"배부르다. 고급이라 다르다.  멍멍!! \"");
            	 System.out.println(" [체력↑ +30]");
            	 System.out.println("\t\t\t┛");
                 break;
             case "2":
            	 energy += 20;
            	 System.out.println("┏");
            	 System.out.println(" \"배부르다 왈왈! \"");
            	 System.out.println(" [체력↑ +20]");
            	 System.out.println("\t\t\t┛");
                 break;
             case "3":
            	 energy += 5;
            	 System.out.println("┏");
            	 System.out.println(" \"~!넬름!\"");
            	 System.out.println(" [체력↑ +5]");
            	 System.out.println("\t\t\t┛");
                 break;
             case "4":
            	 energy -= 30;
            	 System.out.println("┏");
            	 System.out.println(" \"강아지 아파합니다.\"");
            	 System.out.println(" [체력↓-30]");
            	 System.out.println("\t\t\t┛");
                 break;
             default:
                 break;
             
    	 }
    	 
    	 
    	 
     }
     @Override
     public  void sleep(){
    	 energy+=70;
    	 System.out.println("┏");
    	 System.out.println(" \"쿨~~쿨~~  \"");
    	 System.out.println("[체력↑ +70]");
    	 System.out.println("\t\t\t┛");
     }

	@Override
	public void play() {
		 System.out.println(" ◆놀이를 선택해주세요.");
		 System.out.println("1.공놀이 \n2.숨박꼭질 \n3.물장난 ");
         System.out.println("입력>>");
         String select = ScanUtil.nextLine();
         switch (select) {
         case "1":
        	 energy -= 30;
        	 experience += 30;
        	 System.out.println("┏");
        	 System.out.println(" \"잘좀해라 주인! \"");
        	 System.out.println(" [체력↓ -30 / 경험치↑ +30]");
        	 System.out.println("\t\t\t┛");
             break;
         case "2":
        	 energy -= 20;
        	 experience += 20;
        	 System.out.println("┏");
        	 System.out.println(" \"즐거워한다.\"");
        	 System.out.println(" [체력↓ -20 / 경험치↑ +20]");
        	 System.out.println("\t\t\t┛");
             break;
         case "3":
        	 energy -= 15;
        	 experience += 15;
        	 System.out.println("┏");
        	 System.out.println(" \"~!아이 차가워 기쁘다\"");
        	 System.out.println(" [체력↓ -15 / 경험치↑ +15]");
        	 System.out.println("\t\t\t┛");
             break;
         }

	}

	@Override
	public void train() {
			
	        System.out.println(" ◆훈련을 선택해주세요.");
   		 	System.out.println("1.달리기\n2.배변훈련 \n3.애교훈련 ");
            System.out.println("입력>>");
            String select = ScanUtil.nextLine();
            probability =(int)(Math.random()*20); 
            if(probability <5 && state.equals("어리숙함")){
				success = true;
			}else if(probability<10 && state.equals("골치덩어리")){
				success = true;
			}else if(probability<15 && state.equals("배변을 가릴수 있다.")){
				success = true;
			}else if(probability<18 && state.equals("똑똑함")){
				success = true;
			}else{
				success = false;
			}
            
            
            
            if(success){
            switch (select) {
            case "1":
           	 energy -= 40;
           	experience += 50;
           	 System.out.println("┏");
           	 System.out.println(" \"달리기가 능숙해졌습니다. 멍멍!!\"");
             System.out.println(" [체력↓ -40 / 경험치↑ +50]");
           	 System.out.println("\t\t\t┛");
                break;
            case "2":
           	 energy -= 20;
           	experience += 20;
           	 System.out.println("┏");
           	 System.out.println(" \"조금은 능숙해졌다. 멍멍!!\"");
           	System.out.println(" [체력↓ -20 / 경험치↑ +20]");
           	 System.out.println("\t\t\t┛");
                break;
            case "3":
        	 energy -= 20;
        	 experience += 10;
           	 System.out.println("┏");
           	 System.out.println(" \"애교를 부립니다.\"");
           	System.out.println(" [체력↓ -20 / 경험치↑ +10]");
           	 System.out.println("\t\t\t┛");
                break;
            default:
                break;
            }	
            
            }else{
            	
            	 energy -= 20;
            	 experience -= 10;
            	System.out.println("훈련에 실패 했습니다.");
            	System.out.println(" [체력↓ -20 / 경험치↑ -10]");
            	 
            }
	}

	@Override
	public void levelUp() {
		
		if(experience>100) {
	            experience-=100;
	            level++;
	            if(0<=level && level<=5){
					state = "어리숙함";
					
				}else if(5<level && level<=10){
					state = "골치덩어리";
					
				}else if(10<level && level<=15){
					state = "배변을 가릴수 있다.";
					
				}else if(15<level && level<=20){
					state = "똑똑함";
					
				}

	            
	            
	            System.out.println("┏");
	            System.out.println(" \"레벨↑ \""+ level);
	            System.out.println("\t\t\t┛");
		 }else if(experience<0){
			 experience=0;
		 }
		 
	}

	@Override
	public boolean endGame() {
		boolean returnValue=true; //게임종료 판단
        if(level>19) {
        	System.out.println("┏");
        	System.out.println(" \"레벨20달성\"");
            System.out.println(" \"강아지가 건강하게 성장하였습니다.\"");
            System.out.println(" \tGAME OVER");
            System.out.println("\t\t\t┛");
            returnValue=false;
        }else if(energy<0) {
        	System.out.println("┏");
        	System.out.println(" \"체력이 0이 되었습니다.\"");
        	System.out.println(" \"강아지가 힘들어서 집을 나갔습니다....\"");
            System.out.println(" \tGAME OVER");
            System.out.println("\t\t\t┛");
            returnValue=false;
        }
        return returnValue;
	}

	

	@Override
	public void printInfo() {
			
			
		    System.out.println("─────────────────────");
	        System.out.println("  포메리안 정보	   ");		
	        System.out.println("  경험치 : "+experience+"\t\t");
	        System.out.println("  체력 : "+energy+"\t\t");
	        System.out.println("  상태 : "+state+"\t\t");
	        System.out.println(" level: "+level+"\t\t");
	        System.out.println("─────────────────────");
	        System.out.println(success+"/"+probability);
		
	}
	
     
}

