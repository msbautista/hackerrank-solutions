import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here
    public PerformOperation isOdd() {
        return x -> x % 2 == 0;
    }

    public PerformOperation isPrime() {
        return x -> {
            long countDivisor = IntStream.rangeClosed(1, x)
                    .filter(n -> x % n == 0)
                    .count();
            return countDivisor == 2;
        };
    }

    public PerformOperation isPalindrome() {
        return x -> {
            String numberAsText = String.valueOf(x);
            StringBuilder stringBuilder = new StringBuilder(numberAsText);
            String reversed = stringBuilder.reverse().toString();
            return numberAsText.equals(reversed);
        };
    }
}

//Problem: https://www.hackerrank.com/challenges/java-lambda-expressions
public class LambdaExpressions {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}