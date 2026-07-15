class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0;
        int even=0;
        for(int i=1;i<=n*2;i++)
        {
            if(i%2==0)
            even+=i;
            else
            odd+=i;
        }
        return gcd(odd, even);
    }

    static int gcd(int odd, int even)
    {
        for(int i=Math.min(odd, even);i>=0;i--)
        {
            if(odd%i==0 && even%i==0)
            return i;
        }
        return 1;
    }
}