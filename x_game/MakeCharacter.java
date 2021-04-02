package x_game;

import java.util.Scanner;

import e_oop.ScanUtil;
import x_game.Character;
import x_game.Dog;

public class MakeCharacter {	
	 public Character selectCharacter() {//캐릭터선택 메서드
	        Character returnValue = null;
	        System.out.println("강아지를 선택하세요");
	        System.out.println("1.포메리안\n2.시츄\n3.불독\n4.치와와");
	        System.out.print("입력>>");
	        String ch = ScanUtil.nextLine();
	 
	        switch (ch) {
	        case "1" :
	            returnValue = new Dog();
	            break;
	        case "2":
		     	returnValue = new Dog2();
		         break;
	        case "3" :
	            
	            break;
	        case "4":
		     	
		         break;
		     }
	        return returnValue;
	    }
}
