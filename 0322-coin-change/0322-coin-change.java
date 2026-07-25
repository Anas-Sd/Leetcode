class Solution {
    public int coinChange(int[] a, int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, -1);
        int ans = combinations(a, amount, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

     int combinations(int a[], int amount, int dp[])
    {
        if(amount==0)
        {
            return 0;
        }

        if(amount<0)
        {
            return Integer.MAX_VALUE;
        }

        if(dp[amount] != -1)
        return dp[amount];

        int min = Integer.MAX_VALUE;

        for(int x : a)
        {
            int res = combinations(a, amount - x, dp);

            if(res != Integer.MAX_VALUE)
            min = Math.min(min, 1 + res);
        }

        dp[amount] = min;
        return min;

        
    }
}