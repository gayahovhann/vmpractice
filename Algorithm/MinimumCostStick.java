public class MinimumCostStick {
    //bottom-up approach
    public static int minCost(int n, int[] cuts) {

        int A[]= new int[cuts.length+2];
        A[0] = 0;
        A[A.length-1] = n;
        for(int i = 0; i< cuts.length; i++) {
            A[i+1] = cuts[i];
        }
        for(int l = 0; l<A.length; l++) {
            System.out.println(A[l]);
        }


        int[][] dp = new int[A.length][A.length];
        for (int d = 2; d < A.length; d++) {
            for (int i = 0; i<A.length-d; i++) {
                int j = i+d;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i+1; k <j; k++ ) {
                    dp[i][j] = Math.min(dp[i][j], A[j]-A[i] +dp[i][k] +dp[k][j]);
                }

            }
        }

        return dp[0][A.length-1];
    }


    public static void main(String[] args) {
        int[] cuts = {1, 3, 4, 5};
        System.out.println(minCost(7, cuts));

    }
}
