class Solution {
    public int fib(int n) 
    {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return dpFib(n, dp);
    }

    static int dpFib(int n, int dp[])
    {
        if(n<=1)
        return n;

        if(dp[n]!=-1)
        return dp[n];

        dp[n]=dpFib(n-1, dp) + dpFib(n-2, dp);

        return dp[n]; 
    }
}