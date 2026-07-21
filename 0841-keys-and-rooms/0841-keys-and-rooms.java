class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        graph(rooms, 0, visited);
        for(boolean i : visited)
        if(!i)
        return false;

        return true;
    }

    static void graph(List<List<Integer>> l, int start, boolean visited[])
    {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start]=true;

        while(!q.isEmpty())
        {
            int node = q.poll();

            for(int i : l.get(node))
            {
                if(!visited[i])
                {
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }
}