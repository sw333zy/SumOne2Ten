public class SumOne2Ten {
    public static void main(String[] args) {
        /*  i| 1 2 3 4 05 06 07 08 09 10 STOP
             ----------------------------
          sum| 0 1 3 6 10 15 21 28 36 45 55
        */
        int sum = 0;
        // sum is set to 0 index set to 1. sum increases with each pass with index plus current sum
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}