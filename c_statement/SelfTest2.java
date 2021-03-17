package c_statement;

import java.util.Scanner;

public class SelfTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		
		int count = 0;
		System.out.println("아침에 밥보다 빵을 주로 먹는다.(Y/N)>");
		String a =sc.nextLine();
		if(a.equals("Y")){
			count++;
			}
		if(count < 3){
			System.out.println("안전");
		}else if(count ==3){
			System.out.println("주위!");
		}else if(4<= count && count <= 6){
			System.out.println("위험!");
		}else{
			System.out.println("중독!");
		}
		

	}

}
