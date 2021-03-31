package f_game3;

import e_oop.ScanUtil;

public class GameStart {
	Pet p;
	PetItem[] items;
	Random r = new Random();
	MiniGame1 mg1;
	
	GameStart(){
		
		p = new Pet(null, null, null);
		items = new PetItem[5];
		mg1 = new MiniGame1();
	}
	
	public static void main(String[] args) {
		new GameStart().ex1();
	}
	
	//게임 설정
	private void page1(){//인사
		System.out.println("──────────────────────────────");
		System.out.println(" \n\t펫 키우기 게임에 오신걸\n	");
		System.out.println(" \t환영합니다.\n");
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
		p.showInfo();
		System.out.println("-----------------");
		System.out.println("기를 펫을 선택해 주세요.");
		System.out.println("강아지 / 고양이");
		System.out.println("-----------------");	
		int input = 0;
		while(true){
			System.out.println("1.강아지\n2.고양이");
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
		p.showInfo();
		System.out.println("-----------------");
		System.out.println("이름을 선택해주세요.");
		System.out.println("-----------------");	
		
		
		int input = 0;
		while(true){
			System.out.println("1.민트\n2.초코\n3.호두\n4.마루");
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
				p.name = "호두";
				page4();
				break;
			case 4:
				p.name = "마루";
				page4();
				break;
			
			}
			
		}
	}
	
	
	private void page4(){
		p.showInfo();
		System.out.println("-----------------");
		System.out.println("성별을 선택해 주세요.");
		System.out.println("수컷 / 암컷 / 중성화");
		System.out.println("-----------------");	
		int input = 0;
		while(true){
			System.out.println("1.수컷\n2.암컷\n3.중성화시키기 ");
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
		System.out.println("┌───────────────┐");
		System.out.println("│ 펫을 생성완료	│ ");
		System.out.println("└───────────────┘");
		int input = 0;
		while(true){
			System.out.println("1.게임 설명\n0.게임종료 ");
			System.out.print("숫자 입력>");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				ex1();
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
	
	//게임설명
	private void ex1(){
		System.out.println("------------게임방법------------");
		System.out.println("◇ 게임을 진행하며 다양한 문제가 주어집니다. ");
		System.out.println("◆ 문제를 해결하며 펫과 상호작용하세요.");
		System.out.println("◇ 게임 성공시 호감도 +20 /실패시 -10)");
		System.out.println("◆  .");
		System.out.println("------------------------------");	
		int input = 0;
		while(true){
			System.out.println("1.게입시작");
			System.out.print("숫자 입력>");
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				s1();
				break;
			}
			
		}
	}
	
	//게임페이지
	private void s1(){
		p.showInfo();
		int input = 0;
		while(true){
			System.out.println("가위바위보게임 ");
			System.out.print("숫자 입력>");
			int a= ScanUtil.nextInt();
			mg1.game1(a);
			
			
			input = ScanUtil.nextInt();
			switch(input){
			case 1:
				
				break;
			case 2:
				ex1();
				break;
			case 3:
				
			
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
			
		}
	}
	
	private void s2(){
		p.showInfo();
		int input = 0;
		while(true){
			System.out.println("1.게임 진행\n2.게임 방법\n0.게임종료 ");
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
	

}//끝
