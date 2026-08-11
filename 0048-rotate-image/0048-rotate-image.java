class Solution {
    public void rotate(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        int ans[][] = new int[n][m];
        int p=0,q=0;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                ans[p][q] = a[j][i];
                if(q+1<n)
                {
                    q++;
                }
                else
                {
                    p++;q=0;
                }
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = ans[i][j];
            }
        }
    }
}