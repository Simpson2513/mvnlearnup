package learnup.javaqa.task18.game;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class GameCalmTest {

    @Test
    public void countLouseWithRed() {
        double[] speedPlayers = {3, 3, 5, 8, 10, 0, 23, 8, 0, 9, 2};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        int actual = GameCalm.countLoses(speedPlayers);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithNegativeAndRed() {
        double[] speedPlayers = {-3, 3, 5, 8, 10, 0, -23, 8, 0, -9, 2};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        int actual = GameCalm.countLoses(speedPlayers);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithOneNegativeAndRed() {
        double[] speedPlayers = {-3, 3, 5, 8, 10, 0, 23, 8, 0, 9, 2};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        int actual = GameCalm.countLoses(speedPlayers);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllNegativeAndRed() {
        double[] speedPlayers = {-3, -3, -5, -8, -10, 0, -23, -8, -9, -2};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        int actual = GameCalm.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllZeroAndRed() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        int actual = GameCalm.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithGreen() {
        double[] speedPlayers = {3, 3, 5, 8, 10, 0, 23, 8, 0, 9, 2};
        GameCalm.isGreenLight = true;
        GameCalm.MAX_SPEED = 0;

        int actual = GameCalm.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithNegativeAndGreen() {
        double[] speedPlayers = {-3, 3, 5, 8, 10, 0, -23, 8, 0, -9, 2};
        GameCalm.isGreenLight = true;
        GameCalm.MAX_SPEED = 0;

        int actual = GameCalm.countLoses(speedPlayers);
        int expected = 0;
        GameCalm.MAX_SPEED = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllNegativeAndGreen() {
        double[] speedPlayers = {-3, -3, -5, -8, -10, 0, -23, -8, -9, -2};
        GameCalm.isGreenLight = true;
        GameCalm.MAX_SPEED = 0;

        int actual = GameCalm.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countLouseWithAllZeroAndGreen() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameCalm.isGreenLight = true;
        GameCalm.MAX_SPEED = 0;

        int actual = GameCalm.countLoses(speedPlayers);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ArrayLouseWithAllZeroAndRed() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.LoseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayLouseWithOneZeroAndOneNegativeAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 0, 1, 3, -5, 8, 90, 0.8};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.LoseArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 3, 8, 90, 0.8};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayLouseWithOneNegativeAndOnePositiveAndRed() {
        double[] speedPlayers = {0, 0.1, -6, 0, 0, 0, 0, 0, 0, 0};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.LoseArray(speedPlayers);
        double[] expected = {0.1};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayLouseWithAllNegativeAndRed() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.LoseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayLouseWithAllPositiveAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.LoseArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 10, 50};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayLouseWithOnePositiveAndRed() {
        double[] speedPlayers = {9};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.LoseArray(speedPlayers);
        double[] expected = {9};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayLouseWithOutAndRed() {
        double[] speedPlayers = {};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.LoseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayLouseWithAllPositiveAndGreen() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameCalm.isGreenLight = true;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.LoseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayLouseWithAllNegativeAndGreen() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameCalm.isGreenLight = true;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.LoseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayLouseWithAllZeroAndGreen() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0};
        GameCalm.isGreenLight = true;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.LoseArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayWinWithAllZeroAndRed() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.WinArray(speedPlayers);
        double[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayWinWithOneZeroAndOneNegativeAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 0, 1, 3, -5, 8, 90, 0.8};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.WinArray(speedPlayers);
        double[] expected = {0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayWinWithOneNegativeAndOnePositiveAndRed() {
        double[] speedPlayers = {0, 0.1, -6, 0, 0, 0, 0, 0, 0, 0};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.WinArray(speedPlayers);
        double[] expected = {0, 0, 0, 0, 0, 0, 0, 0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayWinWithAllNegativeAndRed() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.WinArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayWinWithAllPositiveAndRed() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.WinArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayWinWithOnePositiveAndRed() {
        double[] speedPlayers = {9};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.WinArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayWinWithOutAndRed() {
        double[] speedPlayers = {};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.WinArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayWinWithAllPositiveAndGreen() {
        double[] speedPlayers = {9, 0.1, 6, 1, 10, 50};
        GameCalm.isGreenLight = true;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.WinArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 10, 50};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayWinWithAllNegativeAndGreen() {
        double[] speedPlayers = {-9, -0.1, -6, -1, -10, -50};
        GameCalm.isGreenLight = true;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.WinArray(speedPlayers);
        double[] expected = {};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayWinWithAllZeroAndGreen() {
        double[] speedPlayers = {0, 0, 0, 0, 0, 0};
        GameCalm.isGreenLight = true;
        GameCalm.MAX_SPEED = 0;

        double[] actual = GameCalm.WinArray(speedPlayers);
        double[] expected = {0, 0, 0, 0, 0, 0};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void ArrayWinWithAllPositiveAndRedAndMAX_SPEED10() {
        double[] speedPlayers = {9, 0.1, 6, 1, 11, 10};
        GameCalm.isGreenLight = false;
        GameCalm.MAX_SPEED = 10;

        double[] actual = GameCalm.WinArray(speedPlayers);
        double[] expected = {9, 0.1, 6, 1, 10};

        Assertions.assertTrue(Arrays.equals(expected, actual));
    }
}
