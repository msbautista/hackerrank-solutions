import java.util.*;
import java.util.stream.*;

public class CountingSort1 {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(63,25,73,1,98,73,56,84,86,57,16,83,8,25,81,56,9,53,98,67,99,12,83,89,80,91,39,86,76,85,74,39,25,90,59,10,94,32,44,3,89,30,27,79,46,96,27,32,18,21,92,69,81,40,40,34,68,78,24,87,42,69,23,41,78,22,6,90,99,89,50,30,20,1,43,3,70,95,33,46,44,9,69,48,33,60,65,16,82,67,61,32,21,79,75,75,13,87,70,33);
        System.out.println(countingSort(arr));
    }

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