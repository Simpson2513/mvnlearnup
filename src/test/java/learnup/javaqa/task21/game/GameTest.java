package learnup.javaqa.task21.game;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class GameTest {

    @Test
    public void isWinWithGreen() {
        Game game1 = new Game(true);

        boolean actual = game1.isFailed(9);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isLoseWithGreenAndNegativeSpeed() {
        Game game1 = new Game(true);

        boolean actual = game1.isFailed(-9);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isWinWithGreenSpeedZero() {
        Game game1 = new Game(true);

        boolean actual = game1.isFailed(0);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isLoseWithRead() {
        Game game1 = new Game(false);

        boolean actual = game1.isFailed(1);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isWinWithRead() {
        Game game1 = new Game(false);

        boolean actual = game1.isFailed(0);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isWinWithReadAndMaxSpeed() {
        SpeedyGame speedyGame1 = new SpeedyGame(false, 12);

        boolean actual = speedyGame1.isFailed(11);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isWinWithGreenAndMaxSpeed() {
        SpeedyGame speedyGame1 = new SpeedyGame(false, 12);

        boolean actual = speedyGame1.isFailed(11);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isWinWithGreenAndNegativeMaxSpeed() {
        SpeedyGame speedyGame1 = new SpeedyGame(false, -12);

        boolean actual = speedyGame1.isFailed(11);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isWinWithNegativeAndGreenAndMaxSpeed() {
        SpeedyGame speedyGame1 = new SpeedyGame(false, 12);

        boolean actual = speedyGame1.isFailed(-11);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isWinWithReadAndNegativeMaxSpeed() {
        SpeedyGame speedyGame1 = new SpeedyGame(false, -12);

        boolean actual = speedyGame1.isFailed(11);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

}