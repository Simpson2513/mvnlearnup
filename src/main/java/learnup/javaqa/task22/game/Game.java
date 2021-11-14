package learnup.javaqa.task22.game;

public class Game {

    private boolean isGreenLight;

    boolean isFailed(int speed) {
        return !isValid(speed) || !isWinGame(speed);
    }

    Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean getIsGreenLight() {
        return isGreenLight;
    }

    public void setIsGreenLight(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    protected boolean isValid(double speedPlayers) {
        return speedPlayers >= 0;
    }

    boolean isWinGame(int speed) {
        return isGreenLight || speed == 0;
    }

}
