package f_game2;

import f_game.Item;
import f_game.Monster;

public class Owner {
	
	int turn; //턴표시
	
	String name;	//주인 이름
	int maxAbility; //행동수
	int ability;
	int money;
	Item[] items;
	
	Owner(String name,int ability, int money){
		this.name = name;
		this.maxAbility = ability;
		this.ability = ability;
		this.money = 0;
		this.items = new Item[5];
	}
	
	void showInfo(){
		System.out.println("================================");
		System.out.println("------------- 상태 ---------------");
		System.out.println("이름 : " + name);
		System.out.println("행동력 : " + ability + "/" + maxAbility);
		System.out.println("돈 : " + money);
		System.out.println("------------- 아이템 --------------");
		for(int i = 0; i < items.length; i++){
			if(items[i] != null){
				System.out.println(items[i].itemInfo());
			}
		}
		System.out.println("================================");
	}
	
	void solve(Owner O){
		int ability = O.ability - 1; 
		if(ability == 0){
			System.out.println("더이상 행동할수 없습니다.");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
