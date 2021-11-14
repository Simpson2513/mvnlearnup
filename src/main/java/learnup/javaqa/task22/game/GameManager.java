package learnup.javaqa.task22.game;

public class GameManager {
    private Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    protected int arrayFailed (int [] speedPlayer){
        int count = 0;
        for(int i = 0; i < speedPlayer.length; i++){
            if ((game.isFailed(speedPlayer[i]))) {
                return ++count;
            } else {
                count++;
            }
        }
        return count;
    }
}
