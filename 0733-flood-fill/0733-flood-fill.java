class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int rd[] = {-1, 1, 0, 0};
        int cd[] = {0, 0, -1, 1};
        // image[sr][sc] = color;
        int org = image[sr][sc];

        if(org == color)
        return image;
        
        boolean visited[][] = new boolean[n][m];
        bfs(image, rd, cd, sr, sc, color, visited, n, m, org);

        return image;
    }

    static void bfs(int image[][], int rd[], int cd[], int sr, int sc, int color, boolean visited[][], int n, int m, int org)
    {
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{sr, sc});
        visited[sr][sc] = true;
        image[sr][sc] = color;

        while(!q.isEmpty())
        {
            int x[] = q.poll();
            int row = x[0];
            int col = x[1];

            for(int i=0;i<4;i++)
            {
                int newr = row + rd[i];
                int newc = col + cd[i];

                if(newr>=0 && newr<n && newc>=0 && newc<m && !visited[newr][newc] && image[newr][newc] == org)
                {
                    visited[newr][newc] = true;
                    q.add(new int[]{newr, newc});
                    image[newr][newc] = color;
                }
            }
        }
        
    }
}