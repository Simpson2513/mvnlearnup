package learnup.javaqa.task21.game;

public class Main {

    public static void main(String[] args) {
        Game game1 = new Game(false);
        System.out.println(game1.isFailed(9));
        SpeedyGame speedyGame1 = new SpeedyGame(false,12);
        System.out.println(speedyGame1.isFailed(13));
    }
}
