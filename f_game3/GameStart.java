package f_game3;

import e_oop.ScanUtil;

public class GameStart {
	Pet p;
	PetItem[] items;
	Random r = new Random();
	GameStart(){
		
		p = new Pet(null, null, null);
		items = new PetItem[5];
		
	}
	
	public static void main(String[] args) {
		new GameStart().page1();
	}
	
	//게임 설정
	private void page1(){//인사
		System.out.println("──────────────────────────────");
		System.out.println(" \t펫 키우기 게임에 오신걸	");
		System.out.println(" \t환영합니다.");
		System.out.println("──────────────────────────────");	
		int input = 0;
		while(true){
			System.out.println("1.게임시작");
			System.out.print("숫자 입력>");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				page2();
				break;
			
			}
			
		}
	}
	
	private void page2(){//종
		System.out.println("┌───────────────┐");
		System.out.println("│ 펫을 생성합니다.	│ ");
		System.out.println("└───────────────┘");	
		System.out.println("-----------------");
		System.out.println("기를 펫을 선택해 주세요.");
		System.out.println("강아지 / 고양이");
		System.out.println("-----------------");	
		int input = 0;
		while(true){
			System.out.println("1.강아지\t2.고양이");
			System.out.print("숫자 입력>");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				p.species = "강아지";
				page3();
				break;
			case 2:
				p.species = "고양이";
				page3();
				break;
			
			}
			
		}
	}
	private void page3(){//이름
		
		System.out.println("-----------------");
		System.out.println("이름을 선택해주세요.");
		System.out.println("-----------------");	
		
		
		int input = 0;
		while(true){
			System.out.println("1.민트\t2.초코\t3.호두\t4.마루");
			System.out.print("숫자 입력>");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				p.name = "민트";
				page4();
				break;
			case 2:
				p.name = "초코";
				page4();
				break;
			case 3:
				p.name = "딸기";
				page4();
				break;
			case 4:
				p.name = "베리";
				page4();
				break;
			
			}
			
		}
	}
	
	
	private void page4(){
		
		System.out.println("-----------------");
		System.out.println("성별을 선택해 주세요.");
		System.out.println("수컷 / 암컷 / 중성화");
		System.out.println("-----------------");	
		int input = 0;
		while(true){
			System.out.println("1.수컷\t2.암컷\t3.중성화시키기 ");
			System.out.print("숫자 입력>");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				p.gender ="수컷";
				page5();
				break;
			case 2:
				p.gender ="암컷";
				page5();
				break;
			case 3:
				p.gender ="중성";
				page5();
				break;
			}
			
		}
	}
	
	private void page5(){
		p.showInfo();
		int input = 0;
		while(true){
			System.out.println("1.게임 진행  2.게임 방법\t0.게임종료 ");
			System.out.print("숫자 입력>");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				s1();
				break;
			case 2:
				ex1();
				break;
			
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
			
		}
	}
	
	//게임
	private void s1(){
		p.showInfo();
		int input = 0;
		while(true){
			System.out.println("1.게임 진행\t2.게임 방법\t0.게임종료 ");
			System.out.print("숫자 입력>");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				page1();
				break;
			case 2:
				ex1();
				break;
			case 3:
				
				break;
			
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
			
		}
	}
	
	//게임설명
		private void ex1(){
			System.out.println("------------게임방법------------");
			System.out.println("◇ 게임을 진행하며 다양한 문제가 주어집니다. ");
			System.out.println("◆ 문제를 해결하며 펫과 상호작용하세요.(성공시+10/ 실패시 -10)");
			System.out.println("◇ 호감도가 0이 되면 펫이 도망갑니다.");
			System.out.println("◆  펫의 체력을 유지 시켜주세요.");
			System.out.println("◇  체력이 0이되면 펫이 죽습니다.");
			System.out.println("◆  펫이 도망가거나 죽으면 게임이 종료됩니다.");
			System.out.println("------------------------------");	
			int input = 0;
			while(true){
				System.out.println("1.돌아가기");
				System.out.print("숫자 입력>");
				input = ScanUtil.nextInt();
				switch(input){
				case 1:
					page5();
					break;
				}
				
			}
		}
}//끝
