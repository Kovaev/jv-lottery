package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALL = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ball = new Lottery();
        for (int i = 0; i < NUMBER_OF_BALL; i++) {
            System.out.println(ball.getRandomBall());
        }
    }
}
