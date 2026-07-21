class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) 
    {
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0;i<n;i++)
        l.add(new ArrayList<>());
        
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];

            l.get(u).add(v);
            l.get(v).add(u);
        }

        return check(l, source, destination);
    }

    static boolean check(List<List<Integer>> l, int s, int d)
    {
        boolean visited[] = new boolean[l.size()];
        Queue<Integer> q = new LinkedList<>();

        q.add(s);
        visited[s]=true;

        while(!q.isEmpty())
        {
            int node = q.poll();
            if(node == d)
            return true;

            for(int i : l.get(node))
            {
                if(!visited[i]){
                q.add(i);
                visited[i]=true;}
            }
        }

        return false;

    }
}