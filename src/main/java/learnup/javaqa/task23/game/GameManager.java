package learnup.javaqa.task23.game;

import org.junit.jupiter.api.Assertions;

public class GameManager {
    private Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int arrayFailed(int[] speedPlayer) {
        int count = 0;
        for (int i = 0; i < speedPlayer.length; i++) {
            if ((game.isFailed(speedPlayer[i]))) {
                return ++count;
            } else {
                count++;
            }
        }
        return count;
    }

    public int loser(Movable p1, Movable p2, Game game, int rounds) {
        for (int i = 0; i <= rounds; i++) {
            if (game.isFailed(p1.getSpeed())) {
                return -1;
            }
            if (game.isFailed(p2.getSpeed())) {
                return 1;
            }
        }
        return 0;
    }


}
