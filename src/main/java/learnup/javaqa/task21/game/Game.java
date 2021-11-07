package learnup.javaqa.task21.game;

public class Game {

    private boolean isGreenLight;
    private int speed;

    boolean isFailed (int speed){
        if(isValid(speed)&&isWinGame(speed))
            return false;
        else return true;
    }

    Game(boolean isGreenLight){
        this.isGreenLight = isGreenLight;
    }

    protected boolean getIsGreenLight (){
        return isGreenLight;
    }

    protected void setIsGreenLight (boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    protected boolean isValid(double speedPlayers) {
        return speedPlayers >= 0;
    }

    private boolean isWinGame(int speed) {
        return isGreenLight || speed == 0;
    }

}
