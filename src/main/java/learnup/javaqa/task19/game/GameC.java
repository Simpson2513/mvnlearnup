package learnup.javaqa.task19.game;

public class GameC {
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

    public static String[] winStringArray(String[] speedStringPlayers) {
        String stringArrayWin[] = new String[countArrayWin(speedStringPlayers)];
        int j = 0;
        for (int i = 0; i < speedStringPlayers.length; i++) {
            String[] parts = speedStringPlayers[i].split(" ");
            if ((isValid(Double.parseDouble(parts[1]))) && (!isLouseCalamary(Double.parseDouble(parts[1])))) {
                stringArrayWin[j] = parts[0];
                j++;
            }
        }
        return stringArrayWin;
    }

    private static int countArrayWin(String[] speedStringPlayers) {
        int count = 0;
        for (int i = 0; i < speedStringPlayers.length; i++) {
            String[] parts = speedStringPlayers[i].split(" ");
            if (!isLouseCalamary(Double.parseDouble(parts[1])) && (isValid(Double.parseDouble(parts[1])))) {
                count++;
            }
        }
        return count;
    }

    public static double[] loseArray(double[] speedPlayers) {
        double arrayLose[] = new double[countLoses(speedPlayers)];
        int j = 0;
        for (int i = 0; i < speedPlayers.length; i++) {
            if ((isValid(speedPlayers[i])) && (isLouseCalamary(speedPlayers[i]))) {
                arrayLose[j] = speedPlayers[i];
                j++;
            }
        }
        return arrayLose;
    }

    public static double[] winArray(double[] speedPlayers) {
        double arrayWin[] = new double[countWins(speedPlayers)];
        int j = 0;
        for (int i = 0; i < speedPlayers.length; i++) {
            if ((isValid(speedPlayers[i])) && (!isLouseCalamary(speedPlayers[i]))) {
                arrayWin[j] = speedPlayers[i];
                j++;
            }
        }
        return arrayWin;
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
