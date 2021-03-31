package z_game;
 
import z_game.Pikachu;
import z_game.MakeCharacter;
import z_game.PlayGame;
import z_game.Character;
 
public class Startgame {
 
    public static void main(String[] args) {
        PlayGame pg = new PlayGame();
        MakeCharacter mc = new MakeCharacter();
        Character selectCharacter=mc.selectCharacter();
        pg.play(selectCharacter);
    }
}
