class Solution {
    public int[] maxProductPair(int[] a, int target) {
        int n = a.length;
        int ans[] = new int[2];
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && a[i]+a[j] == target)
                {
                    if(a[i] > a[j])
                    {
                        if(maxProduct < a[i]*a[j])
                        {
                            maxProduct = a[i]*a[j];
                            ans[0] = i;
                            ans[1] = j;
                        }
                    }
                }
            }
        }

        return (maxProduct==Integer.MIN_VALUE ? new int[]{-1, -1} : ans);
    }
}