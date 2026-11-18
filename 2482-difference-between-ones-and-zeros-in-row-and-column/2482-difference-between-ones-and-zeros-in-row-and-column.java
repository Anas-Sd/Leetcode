class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int diff[][] = new int[n][m];
        int row[][] = new int[n][2];
        int col[][] = new int[m][2];
        int ans[][] = new int[n][m];

        for(int i=0;i<n;i++)
        {
            int zeroes = 0;
            int ones = 0;
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 1)
                ones++;
                else
                zeroes++;
            }
            row[i][0] = zeroes;
            row[i][1] = ones;
        }

        for(int i=0;i<m;i++)
        {
            int zeroes = 0;
            int ones = 0;
            for(int j=0;j<n;j++)
            {
                if(grid[j][i] == 1)
                ones++;
                else
                zeroes++;
            }
            col[i][0] = zeroes;
            col[i][1] = ones;
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(row[i][j] +" ");
            }
            System.out.println();
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(col[i][j] +" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[i][j] = row[i][1] + col[j][1] - row[i][0] - col[j][0];
            }
        }

        return ans;



    }
}