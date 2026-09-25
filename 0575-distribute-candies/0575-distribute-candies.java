class Solution {
    public int distributeCandies(int[] a) 
    {
        Set<Integer> set = new HashSet<>();
        for(int i : a)
        set.add(i);

        if(a.length/2 <= set.size())
        return a.length/2;
        else
        return set.size();
    }
}