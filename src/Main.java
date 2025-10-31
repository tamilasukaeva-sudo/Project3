import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    private static String[] args;

// This is new branch

    public static void main(String[] args) {
        Main.args = args;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Hello number = " + calc(i, RandomGenerator.getDefault().nextInt()));

        }

    }

    static int calc(int a, int b) {

        if (a > b) {
            return a * b;
        } else if (b > 0) {
            return a / b;
        }

     return 0;

    }
}