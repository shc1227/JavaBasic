package f_game2;

import e_oop.ScanUtil;
import f_game.MyGame;

public class GameGo {

	
		
		Owner o;
		Pet p;
		PetItem[] petItems;
		
		GameGo(){
			o = new Owner("민트", 5, 0);
			p = new Pet("초코");
			
			
			
		}
		
		
		public static void main(String[] args) {
			new GameGo().start();
		}	
		private void start() {
			int input = 0;
			while(true){
				System.out.println("1.내정보\t2.펫정보\t3.돈벌기\t4.상점\t0.종료");
				
				input = ScanUtil.nextInt();
				
				switch (input) {
				case 1:
					o.showInfo();
					break;
				case 2:
					p.showInfo();
					break;
				case 3:
					w.showInfo();
					break;
				case 4:
					s.showInfo();
					break;
				case 0:
					System.out.println("종료되었습니다.");
					System.exit(0);
					break;
				}
			}
		}
		
		

	}

}
