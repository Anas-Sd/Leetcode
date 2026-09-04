class Solution {
    public int firstStableIndex(int[] a, int k) {
        int n=a.length;
        int stable=0;
        int ans=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        int minn=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
            {
                maxx=max(a,0,i);
                minn=min(a,i,n-1);
                stable=maxx-minn;
                if(stable<=k)
                    return i;
            }
        return (ans==Integer.MAX_VALUE ? -1 : ans);
    }

    static int max(int a[], int l, int r)
    {
        int maxxx=Integer.MIN_VALUE;
        for(int i=l;i<=r;i++)
        maxxx=Math.max(a[i],maxxx);
        return maxxx;
    }
    
    static int min(int a[], int l, int r)
    {
        int minnn=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++)
        minnn=Math.min(a[i],minnn);
        return minnn;
    }
}