package f_game3;

import f_game.Item;

public class Pet {
		
	
		String name;			//펫이름
		
		String gender;			//성별
		String species;			//종	
		
		int trust;				//호감도 
		int relationship_status;//관계상태 <200매우 좋음, 150좋음,100 보통,50이하 나쁨>
		int maxHp;				//최대 체력
		int hp;					//체력
		
		double money;			//소지금 돈
		
		PetItem[] items;
		
		Pet(String name,String gender, String species  ){
			this.name = name;
			this.gender = gender;
			this.species = species;
			
			this.maxHp = 100;
			this.trust =50;				//호감도
			
			this.money = 10000;
			this.items = new PetItem[5];
		}
		
		void showInfo(){
			System.out.println("=======================");
			System.out.println("----------상태----------");
			System.out.println("이름 : "	+ name);
			System.out.println("동물 : "	+ species);
			System.out.println("성별 : "	+ gender);
			System.out.println("호감도 : "+ trust);
			System.out.println("체력 : "	+ hp);
			
			System.out.println("=======================");
		}
		
		
		
		void getItem(PetItem item){
			System.out.println(item.name + "을 획득하였습니다.");
			for(int i = 0; i < items.length; i++){
				if(items[i] == null){
					items[i] = item;
					break;
				}
			}
			
			
		}
		
		
		
}
