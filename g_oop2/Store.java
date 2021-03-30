package g_oop2;

public class Store {
	public static void main(String[] args) {
		Desktop d1 = new Desktop("삼성 컴퓨터",1000);
		Desktop d2 = new Desktop("LG 컴퓨터",1000);
		
		AirCon ac1 = new AirCon("삼성 에어컨",2000);
		AirCon ac2 = new AirCon("LG 에어컨",2000);
		
		TV tv1 = new TV("삼성 컴퓨터",3000);
		TV tv2 = new TV("LG 컴퓨터",3000);
		
		
		Customer c = new Customer();
		
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy(d2);
		
		c.buy(ac2);
		c.buy(tv1);
	}
}

class Product{
	String name; 	//이름
	int price; 		// 가격
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	String getInfo(){
		return name +"(" + price + "원)";
	}
	
}


class Desktop extends Product{
	Desktop(String name, int price){
		super(name, price);
	}
	
	void programing(){
		System.out.println("프로그램을 만듭니다.");
	}
}


class AirCon extends Product{
	AirCon(String name, int price) {
		super(name, price);
	}
	
	void programing(){
		System.out.println("온도를 설정합니다.");
	}
}

class TV extends Product{
	TV(String name, int price) {
		super(name, price);
	}
	
	void setChannel(){
		System.out.println("채널을 변경합니다.");
	}
}


class Customer{
	int money = 3000;
	
	Product[] item = new Product[100];
	
	void buy( Product p){
		if(money<p.price){
			System.out.println("잔돈이 부족하다.");
			return;
		}
		
		money -= p.price;
		
		for(int i=0;i<item.length;i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.getInfo() + "를 구매했다.");
		
	}
}

