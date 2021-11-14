package learnup.javaqa.task22.game;

public class Main {

    public static void main(String[] args) {
        Game game1 = new Game(false);
        System.out.println(game1.isFailed(9));
        SpeedyGame speedyGame1 = new SpeedyGame(false,12);
        System.out.println(speedyGame1.isFailed(13));
        GameManager gameManager1 = new GameManager(game1);
        GameManager gameManager2 = new GameManager(speedyGame1);
        int [] speedPlayer = {4, 5, 13, 8};
        System.out.println(gameManager1.arrayFailed(speedPlayer));
        System.out.println(gameManager2.arrayFailed(speedPlayer));
    }
}
