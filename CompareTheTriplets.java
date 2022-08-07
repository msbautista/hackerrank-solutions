import java.util.*;

class Result {

    /*
     * problem: https://www.hackerrank.com/challenges/compare-the-triplets
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int totalCategories = 3;
        int alicePoints = 0;
        int bobPoints = 0;
        for (int i = 0; i < totalCategories; i++){
            if(a.get(i) > b.get(i)){
                alicePoints += 1;
                continue;
            }
            if (a.get(i) < b.get(i)){
                bobPoints += 1;
            }
        }
        Integer[] points = new Integer[] { alicePoints, bobPoints };
        return Arrays.asList(points);
    }

}
