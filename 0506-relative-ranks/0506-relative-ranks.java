class Solution {
    public String[] findRelativeRanks(int[] score) {
        String ans[] = new String[score.length];
        List<Integer> l = new ArrayList<>();
        int oi=-1;
        for(int i : score)
        l.add(i);
        for(int i=0;i<score.length;i++)
        {
            int curr[] = findMax(l);
            int max = curr[0];
            int maxIndex = curr[1];

            for(int ii=0;ii<score.length;ii++)
            if(score[ii] == max)
            oi = ii;

            l.remove(maxIndex);
            if(i==0)
            ans[oi] = "Gold Medal";
            else if(i==1)
            ans[oi] = "Silver Medal";
            else if(i==2)
            ans[oi] = "Bronze Medal";
            else
            ans[oi] = String.valueOf(i+1);
        }

        return ans;
    }

    static int[] findMax(List<Integer> l)
    {
        int max=-1;
        int indx=0;
        int maxIndex=-1;
        for(int i : l)
        {
            if(max<i)
            {
                max = i;
                maxIndex = indx;
            }
            indx++; 
        }

        return new int[]{max, maxIndex};
    }
}