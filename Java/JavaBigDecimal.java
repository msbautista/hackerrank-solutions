import java.math.BigDecimal;
import java.util.*;

//Problem: https://www.hackerrank.com/challenges/java-bigdecimal
public class JavaBigDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        //Example Array: {"0.1", ".1", "1", "2", null, null}

        //Write your code here
        Arrays.sort(s, (a, b) -> {
            if (a == null || b == null) {
                return 0;
            }
            BigDecimal bigDecimalA = new BigDecimal(a);
            BigDecimal bigDecimalB = new BigDecimal(b);
            return bigDecimalA.equals(bigDecimalB) ? 0 : bigDecimalB.compareTo(bigDecimalA);
        });

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
