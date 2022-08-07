class Result {

    /*
     * problem: https://www.hackerrank.com/challenges/staircase
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        var count = 0;
        StringBuilder symbols = new StringBuilder("");
        while (count < n) {
            var countSpaces = 0;
            if(count == 0){
                while (countSpaces < n) {
                    symbols.insert(0, " ");
                    countSpaces += 1;
                }
            }
            var spaceIndex = symbols.indexOf(" ");
            symbols.delete(spaceIndex, spaceIndex + 1);
            symbols.append("#");
            System.out.println(symbols);
            count += 1;
        }
    }

}
