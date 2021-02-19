class FindSum {

    /*
     * Complete the 'findSum' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY numbers
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {
    List<Long> res = new ArrayList<>();
    for (List<Integer> query : queries) {
        Integer l = query.get(0);
        Integer r = query.get(1);
        Integer x = query.get(2);
        
        long sum = 0;
        for(int i = l -1; i < r ; i++) {
            sum += numbers.get(i);
            if(numbers.get(i) == 0)  sum+=x;
        }
        res.add(sum);
    }
    return res;
    }

}
