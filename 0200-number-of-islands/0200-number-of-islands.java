class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int islands=0;
        boolean visited[][] = new boolean[n][m];

        int rd[] = {-1, 1, 0, 0};
        int cd[] = {0, 0, -1, 1};

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == '1' && !visited[i][j])
                {
                    islands++;
                    bfs(grid, i, j, n, m, visited, rd, cd);
                }
            }
        }
        return islands;
    }

    static void bfs(char grid[][], int i, int j, int n, int m, boolean visited[][], int rd[], int cd[])
    {
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{i,j});
        visited[i][j]=true;

        while(!q.isEmpty())
        {
            int x[] = q.poll();
            int row = x[0];
            int col = x[1];

            for(int ii=0;ii<4;ii++)
            {
                int newr = row + rd[ii];
                int newc = col + cd[ii];
                if(newr>=0 && newr<n && newc>=0 && newc<m && grid[newr][newc]=='1' && !visited[newr][newc])
                {
                    visited[newr][newc] = true;
                    q.add(new int[]{newr, newc});
                }
            }

        }

    }
}