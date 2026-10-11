class Solution {
    public int sumOfSquares(int[] a) {
        int sumOfSquares=0;
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            if(n % (i+1) == 0)
            sumOfSquares += (a[i]*a[i]);
        }
        return sumOfSquares;
    }
}