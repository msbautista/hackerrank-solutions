import java.util.*;
import java.util.stream.*;

public class Result {

    /*
     * problem: https://www.hackerrank.com/challenges/countingsort1/problem
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int[] sorting = new int[arr.size()];
        arr.stream().forEach(x -> {
            sorting[x] = sorting[x] + 1;
        });

        return Arrays.stream(sorting)
                .boxed()
                .collect(Collectors.toList())
                .subList(0, 100);
    }

}