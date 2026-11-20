class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> groups = new ArrayList<>();
        List<List<Integer>> l = new ArrayList<>();

        int max = -1;

        for(int i : groupSizes)
        if(max < i)
        max = i;

        for(int i=0;i<=max;i++)
        l.add(new ArrayList<>());

        for(int i=0;i<groupSizes.length;i++)
        {
            int list = groupSizes[i];
            l.get(list).add(i);
        }

        for(int i=0;i<l.size();)
        {
            int size = i;
            List<Integer> temp = new ArrayList<>();

            if(l.get(i).size() == 0)
            {
                i++;
                continue;
            }

            while(size-- > 0)
            {
                temp.add(l.get(i).get(0));
                l.get(i).remove(0);
            }

            groups.add(temp);
        }   

        return groups;
    }
}