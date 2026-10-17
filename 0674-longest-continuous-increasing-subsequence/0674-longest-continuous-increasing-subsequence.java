class Solution {
    public int findLengthOfLCIS(int[] a) {
        int left=0,right=0;
        int n = a.length;
        int count=0, maxLength=-1;
        if(n==1)
            return 1;
        for(int i=1;i<n;i++)
        {
            if(a[i-1] < a[i])
            count++;
            else
            {
                if(maxLength < count)
                maxLength = count;
                count=0;
            }

            if(maxLength < count)
                maxLength = count;

        }

        return maxLength+1;
    }
}