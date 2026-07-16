class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        HashSet<List<Integer>> set = new HashSet<>();

        subsets(nums, l, curr, nums.length, 0, set);

        return l;
    }

    static void subsets(int a[], List<List<Integer>> l, List<Integer> curr, int n, int i, HashSet<List<Integer>> set)
    {
        if(i==n)
        {
            List<Integer> temp = new ArrayList<>(curr);
            Collections.sort(temp);
            if(!set.contains(temp))
            {
                l.add(new ArrayList<>(temp));
                set.add(temp);
            }
            return;
        }

        curr.add(a[i]);
        subsets(a, l, curr, n, i+1, set);
        curr.remove(curr.size()-1);
        subsets(a, l, curr, n, i+1, set);
    }
}