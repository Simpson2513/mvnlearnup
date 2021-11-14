package learnup.javaqa.task21.game;

public class SpeedyGame extends Game {
    private int maxSpeed;

    public SpeedyGame(boolean isGreenLight, int maxSpeed) {
        super(isGreenLight);
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected boolean isWinGame(int speed) {
        System.out.println("12");
        return (getIsGreenLight() || speed <= maxSpeed);
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 0) this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
