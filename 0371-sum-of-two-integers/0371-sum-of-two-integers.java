class Solution {
    public int getSum(int a, int b) {
        // String x = Integer.toBinaryString(a);
        // String y = Integer.toBinaryString(b);

        // int xx = 0;
        // int yy = 0;

        // for(int i=0;i<x.length();i++)
        // xx = xx * (10) + (x.charAt(i) - '0');

        // for(int i=0;i<y.length();i++)
        // yy = yy * (10) + (y.charAt(i) - '0');

        while(b != 0)
        {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }

        return a;
    }
}