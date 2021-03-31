package x_game;

import java.util.Scanner;

import x_game.Character;
import x_game.Dog;

public class MakeCharacter {
	 public Character selectCharacter() {
	        Scanner sc = new Scanner(System.in);
	        Character returnValue = null;
	        System.out.println("캐릭터를 선택하세요");
	        System.out.println("1.강아지");
	        String ch = sc.nextLine();
	 
	        switch (ch) {
	        case "1":
	            returnValue = new Dog();
	            break;
	        case "2":
	            
	            break;
	        }
	        return returnValue;
	    }
}
