import java.util.Random;

public class Utils {

    private Utils() {
        //throw an error
        throw new AssertionError("DONT INSTANTIATE, THIS IS FOR STATIC UTILS ONLY");
    }

    private static Random random = new Random();

    public static int playBall() {

        return random.nextInt(6);

    }


}

