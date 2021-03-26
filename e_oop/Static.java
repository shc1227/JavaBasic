package e_oop;

import java.util.Scanner;

public class Static {
		/*
		 *  static을 붙이면 프로그램 실행시 메모리에 올라간다.
		 *  객체생성을 하지 않아도 사용할 수 있다.
		 *  static을 붙인 변수는 객체간에 변수의 값을 공유한다.
		 *  static이 붙은 멤버의 명칭 : 클래스 변수, 클레스 메서드
		 *  static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
		 *  
		 *  static 메서드 만드는것은:자주 사용하는 것 이기 때문에 객채를 생성하지 않고 사용할 수있게 하기위해 만든것 ex)랜덤메서드
		 */
	
	
		static int var; // <--클래스 변수가 되었다. 만드는 이유 : 값을 공유하기 위해 사용된다.
	public static void main(String[] args) {
		Saram s1 = new Saram();
		Saram s2 = new Saram();

		
		s1.name = "철수";
		s2.name = "영희";
		
		s1.saveMoney(100000);
		s2.saveMoney(200000);
		
		s1.saveDateMoney(200000);
		s2.saveDateMoney(200000);
		
		System.out.println(Math.random());
			
		
		
		System.out.println("문자열 입력>");
		String str = ScanUtil.nextLine();
		System.out.println(str);
		
		System.out.println("숫자 입력>");
		int num = ScanUtil.nextInt();
		System.out.println();
		
	}

}


class Saram{
	String name;//이름
	int account;//계좌 잔고
	
	
	void saveMoney(int money){
		account += money;
		System.out.println(name + "의 계좌 잔고: "+ account);
	}
		
		
		static int dateAccount;
		void saveDateMoney(int money){
			dateAccount += money;
			System.out.println("데이트 통장 잔고: "+dateAccount);
		}
		
		
		
		
		
		
		
	
}
		