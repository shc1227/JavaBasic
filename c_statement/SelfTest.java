package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		
		/*
		 * 아침에 밥보다 빵을 주로 먹는다.
		 * 오후 3~4시쯤이면 집중력이 떨어지고 배고픔을 느낀다.
		 * 밥을 먹는게 귀찮게 느껴질 때가 있다.
		 * 주위에 항상 초콜릿이나 과자 같은 간식이 있다.
		 * 방금 밥을 먹었는데도 허기가 가시지 않는다.
		 * 잠들기 전에 야식을 먹지 않으면 잠이 오지 않는다.
		 * 식이요법을 3일 이상 해본적이 있다.
		 * 단 음식은 상상함 해도 먹고 싶어진다.
		 * 배가 부르고 속시 더부룩해도 자꾸만 먹게된다.
		 * 음식을 방금 먹은 후에도 만족스럽지 않다.
		 */
		
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.print("아침에 밥보다 빵을 주로 먹는다. 입력해주세요>[y/n]");
		
		a= sc.nextLine();
		int su = 0;
		switch(a){
			case "y":
				su +=1;
				break;
		}
		System.out.print("오후 3~4시쯤이면 집중력이 떨어지고 배고픔을 느낀다. 입력해주세요>[y/n]");
		
		a= sc.nextLine();
		switch(a){
			case "y":
				su +=1;
				break;
		}
			System.out.print("밥을 먹는게 귀찮게 느껴질 때가 있다. 입력해주세요>[y/n]");
		
		a= sc.nextLine();
		switch(a){
			case "y":
				su +=1;
				break;
		}
			System.out.print("주위에 항상 초콜릿이나 과자 같은 간식이 있다. 입력해주세요>[y/n]");
		
		a= sc.nextLine();
		switch(a){
			case "y":
				su +=1;
				break;
		}
			System.out.print("방금 밥을 먹었는데도 허기가 가시지 않는다. 입력해주세요>[y/n]");
		
		a= sc.nextLine();
		switch(a){
			case "y":
				su +=1;
				break;
		}
			System.out.print("잠들기 전에 야식을 먹지 않으면 잠이 오지 않는다. 입력해주세요>[y/n]");
		
		a= sc.nextLine();
		switch(a){
			case "y":
				su +=1;
				break;
		}
			System.out.print("식이요법을 3일 이상 해본적이 있다. 입력해주세요>[y/n]");
		
		a= sc.nextLine();
		switch(a){
			case "y":
				su +=1;
				break;
		}
			System.out.print("단 음식은 상상함 해도 먹고 싶어진다. 입력해주세요>[y/n]");
		
		a= sc.nextLine();
		switch(a){
			case "y":
				su +=1;
				break;
		}
			System.out.print("배가 부르고 속시 더부룩해도 자꾸만 먹게된다. 입력해주세요>[y/n]");
		
		a= sc.nextLine();
		switch(a){
			case "y":
				su +=1;
				break;
		}
			System.out.print("음식을 방금 먹은 후에도 만족스럽지 않다. 입력해주세요>[y/n]");
		
		a= sc.nextLine();
		switch(a){
			case "y":
				su +=1;
				break;
		}
		
		String res = null;
		
		if(su >= 7){
			res = "중독!";
		}else if(su >3){
			res = "위험!";
		}else{
			res = "주의!";
		}
		System.out.println(" 갯수 : "+su+"개 결과 : "+res+"입니다.");
		
	}

}
