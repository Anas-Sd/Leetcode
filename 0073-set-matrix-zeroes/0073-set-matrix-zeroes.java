class Solution {
    public void setZeroes(int[][] a) 
    {
        int n = a.length;
        int m = a[0].length;
        Set<Integer> ii = new HashSet<>();
        Set<Integer> jj = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j] == 0)
                {
                    ii.add(i);
                    jj.add(j);
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(ii.contains(i) || jj.contains(j))
                {
                    a[i][j] = 0;
                }
            }
        }
    }
}