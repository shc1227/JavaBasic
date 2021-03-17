package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 123
		 * 135: 1s 1b 1o
		 */
		
		int a;
		int b;
		int c;
		int q1;
		int q2;
		int q3;
		int strike =0;
		int ball=0;
		int out =0;
		
		
		
		
		
		
		
		do{
		q1 =(int)(Math.random()*9)+1;
		q2 =(int)(Math.random()*9)+1;
		q3 =(int)(Math.random()*9)+1;
		
		}while(q1==q2 ||q2==q3 || q1==q3 || (q1==q2 && q2==q3));
		
		System.out.println("확인 정답 : "+q1+" "+q2+" "+q3);
		
		
		
		do{
			
			strike=0;ball=0;out=0;
			do{
				System.out.print("반복되지 않는 3자리 수를 입력해주세요.>");
				String input = sc.nextLine();
				a = Integer.parseInt(input.substring(0,1));
				b = Integer.parseInt(input.substring(1,2));
				c = Integer.parseInt(input.substring(2,3));
				System.out.println("입력하신 숫자 : "+a+" "+b+" "+c);
				
				if( a == b && b==c){
					System.out.println(" 첫번째, 두번째와 세번째 자리가 같습니다.다시입력해주세요");	
				}else if(a == b){
					System.out.println(" 첫자리와 두번째 자리가 같습니다. 다시입력해주세요");
				}else if(b == c){
					System.out.println(" 두번째와 세번째 자리가 같습니다.다시입력해주세요");	
				}else if(a == c){
					System.out.println(" 첫자리와 세번째 자리가 같습니다.다시입력해주세요");	
				}
				
				}while(a==b ||b==c || a==c || (a==b && b==c));
			
			if(a == q1){
				strike++;
			}else if(a == q2){
				ball++;
			}else if(a == q3){
				ball++;
			}else{
				out++;
			}
			
			if(b == q2){
				strike++;
			}else if(b == q1){
				ball++;
			}else if(b == q3){
				ball++;
			}else{
				out++;
			}
			
			if(c == q3){
				strike++;
			}else if(c == q1){
				ball++;
			}else if(c == q2){
				ball++;
			}else{
				out++;
			}
			
			
			out = 3-strike-ball;
			System.out.println("Strike : "+strike+", Ball : "+ball+", Out : "+out);
			System.out.println("틀렸습니다. 다시 입력해주세요.");
		}while(strike != 3);		
		
		System.out.println("==>정답 : "+q1+" "+q2+" "+q3);
		
			
			
			
		}
		
		
	}

