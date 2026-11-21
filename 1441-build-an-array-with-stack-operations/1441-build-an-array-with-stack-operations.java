class Solution {
    public List<String> buildArray(int[] target, int m) {
        List<String> sequence = new ArrayList<>();
        int n = 1;

        for(int i=0;i<target.length;)
        {
            if(target[i] == n)
            {
                sequence.add("Push");
                i++; n++;
            }
            else
            {
                sequence.add("Push");
                sequence.add("Pop");
                n++;
            }
        }

        return sequence;
    }
}