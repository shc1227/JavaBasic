package x_game;

import java.util.Scanner;

import e_oop.ScanUtil;
import x_game.Character;
import x_game.Dog;

public class MakeCharacter {	
	 public Character selectCharacter() {//캐릭터선택 메서드
	        Character returnValue = null;
	        System.out.println("강아지를 선택하세요");
	        System.out.println("1.포메리안\t2.시츄\n3.불독\t4.치와와");
	        System.out.print("입력>>");
	        String ch = ScanUtil.nextLine();
	 
	        switch (ch) {
	        case "포메리안" :
	            returnValue = new Dog();
	            break;
	        case "1" :
	            returnValue = new Dog();
	            break;
	        case "시츄":
	        	returnValue = new Dog();
	            break;
	        case "2":
		     	returnValue = new Dog();
		         break;
	        case "불독" :
	            returnValue = new Dog();
	            break;
	        case "3" :
	            returnValue = new Dog();
	            break;
	        case "치와와":
	        	returnValue = new Dog();
	            break;
	        case "4":
		     	returnValue = new Dog();
		         break;
		     }
	        return returnValue;
	    }
}
