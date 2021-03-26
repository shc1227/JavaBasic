package e_oop;

import java.util.Scanner;

public class TV {
		//TV의 속성에는 전원/채널 /볼륨
		//전원 
		boolean power = true;
		//채널
		int chennel;
		//볼륨
		int volume;
		
		
		//전원변경
		void  poewr(){
			if (power != power)
				power = true;


		}




		//채널 변경
		void chennel(){
			
		}
		
		//채널 업
		void chennelUp(){
			++chennel;
		}
		//채널 다운
		void chennelDown(){
			--chennel;
		}
		//볼륨 업
		void volumeUp(){
			++volume;
		}
		
		//볼륨 다운
		void volumeDown(){
			--volume;
		}
	
	
		
		
		public static void main(String[] args) {
			TV tv = new TV();
			Scanner sc = new Scanner(System.in);
			
			tv.power=true;
			tv.chennel = 11;
			tv.volume  = 10;
			System.out.print("채널을입력하세요>");
			tv.chennel = sc.nextInt();
			
						
			
			
			tv.chennelUp();
			tv.volumeDown();
			if(tv.power != false){
			System.out.println("현재 채널은"+tv.chennel +"입니다.");
			System.out.println("현재 볼륨은"+tv.volume +"입니다.");
			}else{
				System.out.println("tv꺼짐");
			}
		}		
}

