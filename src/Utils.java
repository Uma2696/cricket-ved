import java.util.Random;

public class Utils {

    private Utils() {
        //throw an error
        throw new AssertionError("DONT INSTANTIATE, THIS IS FOR STATIC UTILS ONLY");
    }
    static int rand;
    static int ball;
    static int temp;

    private static Random random = new Random();

    public static int playBall(String playerType) {
        if (playerType.equals("Batsman")) {
            temp = 0;
            while (temp != random.nextInt(5)) {
                ball = random.nextInt(6);
                if (ball == 0) {
                    temp++;
                } else {
                    break;
                }
            }
            return ball;
        }
        else {
            return random.nextInt(6);
        }


    }


    public static String playerRole() {
        rand = random.nextInt(2);
        if (rand == 0) {
            return "Bowler";
        } else {
            return "Batsman";
        }
    }
}

