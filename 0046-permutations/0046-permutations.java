class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        for(int i : nums)
        curr.add(i);

        boolean used[] = new boolean[nums.length];

        subSequence(nums, l, curr, nums.length, used, 0);

        return l;
    }

    static void subSequence(int a[], List<List<Integer>> l, List<Integer> curr, int n, boolean used[], int i)
    {
        if(i == n)
        {
            l.add(new ArrayList<>(curr));
            return;
        }

        for(int j=0;j<n;j++)
        {
            if(used[j])
            continue;

            used[j]=true;

            curr.set(i, a[j]);
            subSequence(a, l, curr, n, used, i+1);

            used[j]=false;
        }
    }
}