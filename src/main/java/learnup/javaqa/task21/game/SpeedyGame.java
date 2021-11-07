package learnup.javaqa.task21.game;

public class SpeedyGame extends  Game{
    private int maxSpeed;

    public SpeedyGame(boolean isGreenLight, int maxSpeed) {
        super(isGreenLight);
        this.maxSpeed = maxSpeed;
    }

    private boolean isWinGame(int speed) {
        return (getIsGreenLight() &&  speed >= maxSpeed);
    }

    protected void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 0) this.maxSpeed = maxSpeed;
    }

    protected int getMaxSpeed() {
        return maxSpeed;
    }
}
