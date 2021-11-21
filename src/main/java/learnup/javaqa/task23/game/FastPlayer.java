package learnup.javaqa.task23.game;

public class FastPlayer implements Movable{
    private int startSpeed;
    private int speedSteep;

    public FastPlayer(int startSpeed, int speedSteep){
        this.startSpeed = startSpeed;
        this.speedSteep = speedSteep;

    }

    @Override
    public int getSpeed() {
        int currentSpeed = startSpeed;
        this.startSpeed += speedSteep;
        return currentSpeed;
    }
}
