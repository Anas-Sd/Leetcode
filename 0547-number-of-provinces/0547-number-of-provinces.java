class Solution {
    public int findCircleNum(int[][] mat) {
        List<List<Integer>> l = new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++)
        l.add(new ArrayList<>());


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    l.get(i).add(j);
                    l.get(j).add(i);
                }
            }
        }

        boolean visited[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        int count=0;

        for(int iii=0;iii<l.size();iii++)
        {
            if(!visited[iii])
            {
                bfs(l, iii, visited, q);
                count++;
            }

            
        }

        return count;

    }

    static void bfs(List<List<Integer>> l, int strt, boolean visited[], Queue<Integer> q)
    {
        // Arrays.fill(visited, false);
        q.add(strt);
        visited[strt]=true;

        while(!q.isEmpty())
        {
            int node = q.poll();

            for(int i : l.get(node))
            {
                if(!visited[i])
                {
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }
}