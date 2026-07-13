class Solution {
    public int climbStairs(int n) {

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return (dpCs(n, dp));
    }

    static int dpCs(int n, int dp[]){
        if(n<=1)
        return 1;

        if(dp[n]!=-1)
        return dp[n];

        dp[n] = dpCs(n-1, dp) + dpCs(n-2, dp);

        return dp[n];
    }
}