import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * problem: https://www.hackerrank.com/challenges/birthday-cake-candles
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int candleTallest = Collections.max(candles);
        int countCandlesTallest = candles.stream()
                .filter(x -> x == candleTallest)
                .collect(Collectors.toList())
                .size();

        return countCandlesTallest;
    }

}