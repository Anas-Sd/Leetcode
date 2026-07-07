class Solution {
    public long sumAndMultiply(int n) {
        int sum = sum(n);
        String s=Integer.toString(n);
        long x=0;
        for(int i=0;i<s.length();i++)
        {
            char digit=s.charAt(i);
            if(digit - '0' > 0)
            x = x*10 + (digit - '0');
        }
        return sum*x;
    }
    
    static int sum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
}