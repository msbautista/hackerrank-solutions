public class JavaLoopsI {

    // Problem: https://www.hackerrank.com/challenges/java-loops-i
    public static void main(String[] args) {
        int number = 2;
        printMultiples(number);
    }

    private static void printMultiples(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
    }

}
