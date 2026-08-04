class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       Arrays.sort(nums);
        List<Integer> miss = new ArrayList<>();
            int f = nums[0];
        int l = nums[nums.length-1];
        Set<Integer> set = new HashSet<Integer>();
        for(int n : nums)
            set.add(n);
        for(int i=f;i<=l;i++)
            {
                if(!set.contains(i))
                    miss.add(i);
            }

        return miss;
    }
}