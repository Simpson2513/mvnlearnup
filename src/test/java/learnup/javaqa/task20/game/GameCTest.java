package learnup.javaqa.task20.game;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class GameCTest {

    @Test
    public void countLouseWithRed() {
        double[] speedPlayers = {3, 3, 5, 8, 10, 0, 23, 8, 0, 9, 2};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        int actual = GameC.countLoses(speedPlayers);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithNegativeAndRed() {
        double[] speedPlayers = {-3, 3, 5, 8, 10, 0, -23, 8, 0, -9, 2};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        int actual = GameC.countLoses(speedPlayers);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithOneNegativeAndRed() {
        double[] speedPlayers = {-3, 3, 5, 8, 10, 0, 23, 8, 0, 9, 2};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        int actual = GameC.countLoses(speedPlayers);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllNegativeAndRed() {
        double[] speedPlayers = {-3, -3, -5, -8, -10, 0, -23, -8, -9, -2};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        int actual = GameC.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllZeroAndRed() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        int actual = GameC.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithGreen() {
        double[] speedPlayers = {3, 3, 5, 8, 10, 0, 23, 8, 0, 9, 2};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        int actual = GameC.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithNegativeAndGreen() {
        double[] speedPlayers = {-3, 3, 5, 8, 10, 0, -23, 8, 0, -9, 2};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        int actual = GameC.countLoses(speedPlayers);
        int expected = 0;
        GameC.MAX_SPEED = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllNegativeAndGreen() {
        double[] speedPlayers = {-3, -3, -5, -8, -10, 0, -23, -8, -9, -2};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        int actual = GameC.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllZeroAndGreen() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        int actual = GameC.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arrayLouseWithAllZeroAndRed() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithOneZeroAndOneNegativeAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 0, 1, 3, -5, 8, 90, 0.8};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.loseArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 3, 8, 90, 0.8};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithOneNegativeAndOnePositiveAndRed() {
        double[] speedPlayers = {0, 0.1, -6, 0, 0, 0, 0, 0, 0, 0};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.loseArray(speedPlayers);
        double[] expected = {0.1};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithAllNegativeAndRed() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithAllPositiveAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.loseArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 10, 50};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithOnePositiveAndRed() {
        double[] speedPlayers = {9};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.loseArray(speedPlayers);
        double[] expected = {9};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithOutAndRed() {
        double[] speedPlayers = {};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithAllPositiveAndGreen() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithAllNegativeAndGreen() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayLouseWithAllZeroAndGreen() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.loseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllZeroAndRed() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.winArray(speedPlayers);
        double[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithOneZeroAndOneNegativeAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 0, 1, 3, -5, 8, 90, 0.8};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.winArray(speedPlayers);
        double[] expected = {0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithOneNegativeAndOnePositiveAndRed() {
        double[] speedPlayers = {0, 0.1, -6, 0, 0, 0, 0, 0, 0, 0};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.winArray(speedPlayers);
        double[] expected = {0, 0, 0, 0, 0, 0, 0, 0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllNegativeAndRed() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.winArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllPositiveAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.winArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithOnePositiveAndRed() {
        double[] speedPlayers = {9};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.winArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithOutAndRed() {
        double[] speedPlayers = {};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.winArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllPositiveAndGreen() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.winArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 10, 50};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllNegativeAndGreen() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.winArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllZeroAndGreen() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        double[] actual = GameC.winArray(speedPlayers);
        double[] expected = {0, 0, 0, 0, 0, 0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinWithAllPositiveAndRedAndMAX_SPEED10() {
        double[] speedPlayers = {9, 0.1, 6, 1, 11, 10};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 10;

        double[] actual = GameC.winArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 10};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinRed() {
        String[] speedStringPlayers = {"Jo 2", "Mo 1", "Po 0", "No 5", "Vo 0"};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        String[] actual = GameC.winStringArray(speedStringPlayers);
        String[] expected = {"Po", "Vo"};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinGreen() {
        String[] speedStringPlayers = {"Jo 2", "Mo 1", "Po 0", "No 5", "Vo 0"};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        String[] actual = GameC.winStringArray(speedStringPlayers);
        String[] expected = {"Jo", "Mo", "Po", "No", "Vo"};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinRedWithNegative() {
        String[] speedStringPlayers = {"Jo 2", "Mo -1", "Po 0", "No 5", "Vo 0"};
        GameC.isGreenLight = false;
        GameC.MAX_SPEED = 0;

        String[] actual = GameC.winStringArray(speedStringPlayers);
        String[] expected = {"Po", "Vo"};;

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void arrayWinGreenWithNegative() {
        String[] speedStringPlayers = {"Jo 2", "Mo -1", "Po 0", "No 5", "Vo 0"};
        GameC.isGreenLight = true;
        GameC.MAX_SPEED = 0;

        String[] actual = GameC.winStringArray(speedStringPlayers);
        String[] expected = {"Jo", "Po", "No", "Vo"};;

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }
}
