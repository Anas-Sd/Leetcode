class Solution {
    public List<List<Integer>> combinationSum(int[] a, int k) 
    {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        // for(int i : a)
        // curr.add(i);
        combinations(a, l, curr, a.length,0,k);

        return l;
    }

    static void combinations(int a[], List<List<Integer>> l, List<Integer> curr, int n, int i, int k)
    {
        if (k == 0) 
        {
            l.add(new ArrayList<>(curr));
            return;
        }

        if(k<0 || i==n)
        {
            return;
        }

        curr.add(a[i]);
        combinations(a, l, curr, n, i, k - a[i]);
        curr.remove(curr.size()-1);
        combinations(a, l, curr, n, i+1, k);
    }

    static int sum(List<Integer> curr)
    {
        int sum=0;
        for(int i : curr)
        sum+=i;

        return sum;
    }
}