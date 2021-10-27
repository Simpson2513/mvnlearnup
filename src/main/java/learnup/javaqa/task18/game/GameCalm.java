package learnup.javaqa.task18.game;

public class GameCalm {
    public static boolean isGreenLight = false;
    public static double MAX_SPEED = 10;

    public static int countLoses(double[] speedPlayers) {
        int count = 0;
        for (int i = 0; i < speedPlayers.length; i++) {
            if (isLouseCalamary(speedPlayers[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countWins(double[] speedPlayers) {
        int countValid = countValid(speedPlayers);
        int countLoses = countLoses(speedPlayers);
        return countValid - countLoses;
    }

    public static double[] LoseArray(double[] speedPlayers) {
        double ArrayLose[] = new double[countLoses(speedPlayers)];
        int j = 0;
        for (int i = 0; i < speedPlayers.length; i++) {
            if ((isValid(speedPlayers[i])) && (isLouseCalamary(speedPlayers[i]))) {
                ArrayLose[j] = speedPlayers[i];
                j++;
            }
        }
        return ArrayLose;
    }

    public static double[] WinArray(double[] speedPlayers) {
        double ArrayWin[] = new double[countWins(speedPlayers)];
        int j = 0;
        for (int i = 0; i < speedPlayers.length; i++) {
            if ((isValid(speedPlayers[i])) && (!isLouseCalamary(speedPlayers[i]))) {
                ArrayWin[j] = speedPlayers[i];
                j++;
            }
        }
        return ArrayWin;
    }

    public static int countValid(double[] speedPlayers) {
        int validCount = 0;
        for (int i = 0; i < speedPlayers.length; i++) {
            if (speedPlayers[i] >= 0)
                validCount++;
        }
        return validCount;
    }

    public static boolean isValid(double speedPlayers) {
        return speedPlayers >= 0;
    }

    public static boolean isLouseCalamary(double speedPlayer) {
        return (!isGreenLight && speedPlayer > MAX_SPEED);
    }
}
