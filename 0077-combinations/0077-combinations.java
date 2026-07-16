class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        int a[] = new int[n];
        for(int i=1;i<=n;i++)
        a[i-1]=i;

        combinations(a, l, curr, n, 0, k);

        return l;
    }

    static void combinations(int a[], List<List<Integer>> l, List<Integer> curr, int n, int i, int k)
    {
        if(i==n)
        {
            if(curr.size()==k)
            l.add(new ArrayList<>(curr));
            return;
        }

        curr.add(a[i]);
        combinations(a, l, curr, n, i+1, k);
        curr.remove(curr.size()-1);
        combinations(a, l, curr, n, i+1, k);
    }
}