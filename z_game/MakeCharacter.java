package z_game;

import java.util.Scanner;
import z_game.GGgoBooGi;
import z_game.Pikachu;
import z_game.Character;
 
public class MakeCharacter {
    public Character selectCharacter() {
        Scanner sc = new Scanner(System.in);
        Character returnValue = null;
        System.out.println("캐릭터를 선택하세요");
        System.out.println("1.피카추");
        System.out.println("2.꼬부기");
        String ch = sc.nextLine();
 
        switch (ch) {
        case "1":
            returnValue = new Pikachu();
            break;
        case "2":
            returnValue = new GGgoBooGi();
            break;
        }
        return returnValue;
    }
}