package x_game;

import java.util.Scanner;

import e_oop.ScanUtil;
import x_game.Character;

public class PlayGame {//게임 선택창
	private static Character character;
    private boolean flag = true;
    public void play(Character c) {//입력받은 동물
        character=c;
        while (flag) {
            character.printInfo();
            System.out.println("1.밥먹이기\n2.잠재우기\n3.놀아주기 \n4.훈련 \n5.종료");
            System.out.println("입력>>");
            String select = ScanUtil.nextLine();
            switch (select) {
            case "1":
                character.eat();
                break;
            case "2":
                character.sleep();
                break;
            case "3":
                character.play();
                break;
            case "4":
                character.train();
                break;
            case "5":
                flag = false;
                break;
            default:
                break;
            }
            character.levelUp();
            if (flag = true) {
                flag = character.endGame();
            }
        }
    }
}
