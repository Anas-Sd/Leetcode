class Solution {
    public long maxAlternatingSum(int[] a) {
        int n=a.length;
        for(int i=0;i<n;i++)
        a[i] = Math.abs(a[i]);
        for(int i : a)
        System.out.print(i+" ");
        Arrays.sort(a);
        long maxSum=0; 
        int last=1;
        boolean even = (n%2 == 0 ? true : false);
        boolean add = true;
        int tot = n;
        for(int i=0;i<=n/2;i++)
        {
            if(tot == 1)
            {
                if(add)
                maxSum += (a[i] * a[i]);
                else
                maxSum -= (a[i] * a[i]);
            }
            else if(tot == 0)
            break;

            maxSum += (a[n-last] * a[n-last]);
            last++;
            maxSum -= (a[i] * a[i]);
            tot-=2;
        }

        return maxSum;
    }
}