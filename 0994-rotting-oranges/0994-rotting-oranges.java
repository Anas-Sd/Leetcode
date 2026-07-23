class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int minuites=0;
        int fresh=0;

        Queue<int[]> q = new LinkedList<>();

        int rd[] = {-1, 1, 0, 0};
        int cd[] = {0, 0, -1, 1};

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j] == 1)
                fresh++;
            }
        }

        if(fresh==0)
        return 0;

        while(!q.isEmpty())
        {
            int size = q.size();
            boolean rotted = false;

            for(int k=0;k<size;k++)
            {
                int x[] = q.poll();
                int row = x[0];
                int col = x[1];

                for(int i=0;i<4;i++)
                {
                    int newr = row + rd[i];
                    int newc = col + cd[i];

                    if(newr>=0 && newr<n && newc>=0 && newc<m && grid[newr][newc] == 1)
                    {
                        grid[newr][newc] = 2;
                        fresh--;
                        q.add(new int[]{newr, newc});
                        rotted = true;
                    }
                }
            }

            if(rotted)
            minuites++;
        }

        return fresh==0 ? minuites : -1;
    }
}