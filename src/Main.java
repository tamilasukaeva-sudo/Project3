public class Main {

// This is new branch

    public static void main(String[] args) {

        System.out.println(createStr());

    }

    static int calc(int a, int b) {

        if (a > b) {
            return a * b;
        } else if (b > 0) {
            return a / b;
        }
