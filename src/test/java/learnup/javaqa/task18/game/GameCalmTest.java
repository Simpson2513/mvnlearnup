package learnup.javaqa.task18.game;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class GameCalmTest {

    @Test
    public void countLouseWithRed() {
        double[] speedPlayers = {3, 3, 5, 8, 10, 0, 23, 8, 0, 9, 2};
        GameCalm gameCalm = new GameCalm(false, 0);


        int actual = gameCalm.countLoses(speedPlayers);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithNegativeAndRed() {
        double[] speedPlayers = {-3, 3, 5, 8, 10, 0, -23, 8, 0, -9, 2};
        GameCalm gameCalm = new GameCalm(false, 0);

        int actual = gameCalm.countLoses(speedPlayers);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithOneNegativeAndRed() {
        double[] speedPlayers = {-3, 3, 5, 8, 10, 0, 23, 8, 0, 9, 2};
        GameCalm gameCalm = new GameCalm(false, 0);

        int actual = gameCalm.countLoses(speedPlayers);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllNegativeAndRed() {
        double[] speedPlayers = {-3, -3, -5, -8, -10, 0, -23, -8, -9, -2};
        GameCalm gameCalm = new GameCalm(false, 0);

        int actual = gameCalm.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllZeroAndRed() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameCalm gameCalm = new GameCalm(false, 0);

        int actual = gameCalm.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithGreen() {
        double[] speedPlayers = {3, 3, 5, 8, 10, 0, 23, 8, 0, 9, 2};
        GameCalm gameCalm = new GameCalm(true, 0);

        int actual = gameCalm.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithNegativeAndGreen() {
        double[] speedPlayers = {-3, 3, 5, 8, 10, 0, -23, 8, 0, -9, 2};
        GameCalm gameCalm = new GameCalm(true, 0);

        int actual = gameCalm.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllNegativeAndGreen() {
        double[] speedPlayers = {-3, -3, -5, -8, -10, 0, -23, -8, -9, -2};
        GameCalm gameCalm = new GameCalm(true, 0);

        int actual = gameCalm.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllZeroAndGreen() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameCalm gameCalm = new GameCalm(true, 0);

        int actual = gameCalm.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arrayLouseWithAllZeroAndRed() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithOneZeroAndOneNegativeAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 0, 1, 3, -5, 8, 90, 0.8};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.loseArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 3, 8, 90, 0.8};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithOneNegativeAndOnePositiveAndRed() {
        double[] speedPlayers = {0, 0.1, -6, 0, 0, 0, 0, 0, 0, 0};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.loseArray(speedPlayers);
        double[] expected = {0.1};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithAllNegativeAndRed() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithAllPositiveAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.loseArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 10, 50};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithOnePositiveAndRed() {
        double[] speedPlayers = {9};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.loseArray(speedPlayers);
        double[] expected = {9};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithOutAndRed() {
        double[] speedPlayers = {};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithAllPositiveAndGreen() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameCalm gameCalm = new GameCalm(true, 0);

        double[] actual = gameCalm.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithAllNegativeAndGreen() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameCalm gameCalm = new GameCalm(true, 0);

        double[] actual = gameCalm.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithAllZeroAndGreen() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0};
        GameCalm gameCalm = new GameCalm(true, 0);

        double[] actual = gameCalm.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllZeroAndRed() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.winArray(speedPlayers);
        double[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithOneZeroAndOneNegativeAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 0, 1, 3, -5, 8, 90, 0.8};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.winArray(speedPlayers);
        double[] expected = {0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithOneNegativeAndOnePositiveAndRed() {
        double[] speedPlayers = {0, 0.1, -6, 0, 0, 0, 0, 0, 0, 0};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.winArray(speedPlayers);
        double[] expected = {0, 0, 0, 0, 0, 0, 0, 0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllNegativeAndRed() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.winArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllPositiveAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.winArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithOnePositiveAndRed() {
        double[] speedPlayers = {9};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.winArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithOutAndRed() {
        double[] speedPlayers = {};
        GameCalm gameCalm = new GameCalm(false, 0);

        double[] actual = gameCalm.winArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllPositiveAndGreen() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameCalm gameCalm = new GameCalm(true, 0);

        double[] actual = gameCalm.winArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 10, 50};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllNegativeAndGreen() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameCalm gameCalm = new GameCalm(true, 0);

        double[] actual = gameCalm.winArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllZeroAndGreen() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0};
        GameCalm gameCalm = new GameCalm(true, 0);

        double[] actual = gameCalm.winArray(speedPlayers);
        double[] expected = {0, 0, 0, 0, 0, 0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllPositiveAndRedAndMAX_SPEED10() {
        double[] speedPlayers = {9, 0.1, 6, 1, 11, 10};
        GameCalm gameCalm = new GameCalm(false, 10);

        double[] actual = gameCalm.winArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 10};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinRed() {
        String[] speedStringPlayers = {"Jo 2", "Mo 1", "Po 0", "No 5", "Vo 0"};
        GameCalm gameCalm = new GameCalm(false, 0);

        String[] actual = gameCalm.winStringArray(speedStringPlayers);
        String[] expected = {"Po", "Vo"};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinGreen() {
        String[] speedStringPlayers = {"Jo 2", "Mo 1", "Po 0", "No 5", "Vo 0"};
        GameCalm gameCalm = new GameCalm(true, 0);

        String[] actual = gameCalm.winStringArray(speedStringPlayers);
        String[] expected = {"Jo", "Mo", "Po", "No", "Vo"};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinRedWithNegative() {
        String[] speedStringPlayers = {"Jo 2", "Mo -1", "Po 0", "No 5", "Vo 0"};
        GameCalm gameCalm = new GameCalm(false, 0);

        String[] actual = gameCalm.winStringArray(speedStringPlayers);
        String[] expected = {"Po", "Vo"};;

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinGreenWithNegative() {
        String[] speedStringPlayers = {"Jo 2", "Mo -1", "Po 0", "No 5", "Vo 0"};
        GameCalm gameCalm = new GameCalm(true, 0);

        String[] actual = gameCalm.winStringArray(speedStringPlayers);
        String[] expected = {"Jo", "Po", "No", "Vo"};;

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }
}
