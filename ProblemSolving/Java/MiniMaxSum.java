import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class MiniMaxSum {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(256741038,623958417,467905213,714532089,938071625);
        miniMaxSum(a);
    }

    /*
     * Problem: https://www.hackerrank.com/challenges/mini-max-sum/problem
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        List<BigInteger> sums = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            List<BigInteger> duplicatedArr = arr.stream()
                    .map(x -> new BigInteger(String.valueOf(x)))
                    .collect(Collectors.toList());
            duplicatedArr.remove(i);
            BigInteger sum = duplicatedArr.stream().reduce(BigInteger.ZERO, BigInteger::add);
            sums.add(sum);
        }

        var min = sums.stream().min(BigInteger::compareTo).get();
        var max = sums.stream().max(BigInteger::compareTo).get();

        System.out.println(min + " " + max);
    }

}