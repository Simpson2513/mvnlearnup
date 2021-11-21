package learnup.javaqa.task23.game;

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

    @Test
    public void countArrayWithGreen() {
        Game game1 = new Game(true);
        GameManager gameManager1 = new GameManager(game1);
        int [] speedPlayer = {4, 5, 13, 8};

        int actual = gameManager1.arrayFailed(speedPlayer);
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countArrayWithGreenAndNegative() {
        Game game1 = new Game(true);
        GameManager gameManager1 = new GameManager(game1);
        int [] speedPlayer = {4, -5, 13, 8};

        int actual = gameManager1.arrayFailed(speedPlayer);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countArrayWithRedAndNegative() {
        Game game1 = new Game(false);
        GameManager gameManager1 = new GameManager(game1);
        int [] speedPlayer = {0, 0, 13, 8};

        int actual = gameManager1.arrayFailed(speedPlayer);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countArrayWithRedAndAllPositive() {
        Game game1 = new Game(false);
        GameManager gameManager1 = new GameManager(game1);
        int [] speedPlayer = {2, 3, 13, 8};

        int actual = gameManager1.arrayFailed(speedPlayer);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countArrayWithRedAndAllPositiveMaxSpeed() {
        SpeedyGame speedyGame1 = new SpeedyGame(false,12);
        GameManager gameManager1 = new GameManager(speedyGame1);
        int [] speedPlayer = {2, 3, 13, 8};

        int actual = gameManager1.arrayFailed(speedPlayer);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countArrayWithGreenAndAllPositiveMaxSpeed() {
        SpeedyGame speedyGame1 = new SpeedyGame(true,12);
        GameManager gameManager1 = new GameManager(speedyGame1);
        int [] speedPlayer = {2, 3, 13, 8};

        int actual = gameManager1.arrayFailed(speedPlayer);
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countArrayWithReedAndNegativeMaxSpeed() {
        SpeedyGame speedyGame1 = new SpeedyGame(false,12);
        GameManager gameManager1 = new GameManager(speedyGame1);
        int [] speedPlayer = {2, -3, 13, 8};

        int actual = gameManager1.arrayFailed(speedPlayer);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondIsFirstLose() {
        Game game1 = new Game(false);
        Movable p1 = new ConstantPlayer(0);
        Movable p2 = new ConstantPlayer (1);
        GameManager gameManager = new GameManager(game1);

        int actual = gameManager.loser(p1,p2,game1,4);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstIsFirstLose() {
        Game game1 = new Game(false);
        Movable p1 = new ConstantPlayer(1);
        Movable p2 = new ConstantPlayer (0);
        GameManager gameManager = new GameManager(game1);

        int actual = gameManager.loser(p1,p2,game1,4);
        int expected = -1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nobodyIsFirstLose() {
        Game game1 = new Game(false);
        Movable p1 = new ConstantPlayer(0);
        Movable p2 = new ConstantPlayer (0);
        GameManager gameManager = new GameManager(game1);

        int actual = gameManager.loser(p1,p2,game1,4);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void allIsFirstLose() {
        Game game1 = new Game(false);
        Movable p1 = new ConstantPlayer(1);
        Movable p2 = new ConstantPlayer (1);
        GameManager gameManager = new GameManager(game1);

        int actual = gameManager.loser(p1,p2,game1,4);
        int expected = -1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nobodyIsFirstLoseGreen() {
        Game game1 = new Game(true);
        Movable p1 = new ConstantPlayer(9);
        Movable p2 = new ConstantPlayer (20);
        GameManager gameManager = new GameManager(game1);

        int actual = gameManager.loser(p1,p2,game1,4);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstIsFirstLoseWithRoundsStart() {
        Game game1 = new Game(false);
        Movable p1 = new FastPlayer(1, 4);
        Movable p2 = new FastPlayer(0,2);
        GameManager gameManager = new GameManager(game1);

        int actual = gameManager.loser(p1,p2,game1,4);
        int expected = -1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nobodyIsFirstLoseWithRoundsGreen() {
        Game game1 = new Game(true);
        Movable p1 = new FastPlayer(0, 4);
        Movable p2 = new FastPlayer(0,2);
        GameManager gameManager = new GameManager(game1);

        int actual = gameManager.loser(p1,p2,game1,4);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondIsFirstLoseWithRounds() {
        Game game1 = new Game(false);
        Movable p1 = new FastPlayer(0, 4);
        Movable p2 = new FastPlayer(1,2);
        GameManager gameManager = new GameManager(game1);

        int actual = gameManager.loser(p1,p2,game1,4);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstIsFirstLoseWithRounds() {
        Game game1 = new Game(false);
        Movable p1 = new FastPlayer(1, 4);
        Movable p2 = new FastPlayer(0,2);
        GameManager gameManager = new GameManager(game1);

        int actual = gameManager.loser(p1,p2,game1,4);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}