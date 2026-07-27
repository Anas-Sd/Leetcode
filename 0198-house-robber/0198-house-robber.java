class Solution {
    public int rob(int[] a) {
        int n=a.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        int max = robb(a, dp, 0);
        return max;
    }

    static int robb(int a[], int dp[], int i)
    {
        if(i>=a.length)
        {
            return 0;
        }

        if(dp[i] != -1)
        return dp[i];

        int take = a[i] + robb(a, dp, i+2);
        int leave = robb(a, dp, i+1);

        dp[i] = Math.max(take, leave); 
        return dp[i];
    }
}