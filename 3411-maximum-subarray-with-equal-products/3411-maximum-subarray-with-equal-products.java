class Solution {
    public int maxLength(int[] a) {
        int n = a.length;
        int ans = -1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(prod(a, i, j) == gcd(a, i, j) * lcm(a, i, j))
                ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }

    static int prod(int a[], int start, int end)
    {
        int product = 1;
        for(int i=start;i<=end;i++)
        product *= a[i];

        return product;
    }

    static int gcd(int a[], int start, int end)
    {
        int result = a[start];

        for(int i=start+1;i<=end;i++)
        {
            int x = result;
            int y = a[i];

            while(y != 0)
            {
                int temp = y;
                y = x % y;
                x = temp;
            }

            result = x;
        }

        return result;
    }

    static int lcm(int a[], int start, int end)
    {
        int result = a[start];

        for(int i=start+1;i<=end;i++)
        {
            int x = result;
            int y = a[i];

            while(y != 0)
            {
                int temp = y;
                y = x % y;
                x = temp;
            }

            result = (result / x) * a[i];
        }

        return result;
    }
}