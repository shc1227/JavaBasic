package x_game;


public class StartGame {
	public static void main(String[] args) {
	    
		PlayGame pg = new PlayGame();
        MakeCharacter mc = new MakeCharacter();
        Character selectCharacter=mc.selectCharacter();
        pg.play(selectCharacter);
        
        
        
    }
}
