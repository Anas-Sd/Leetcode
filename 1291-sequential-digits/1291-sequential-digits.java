class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> l = new ArrayList<>();
        String s = "123456789";
        int n=count(low);
        int m=count(high);
        boolean stop=false,incr=false;
        int j=0,k=0;
        for(int i=n;i<=m;)
        {
            if (j > 9) {
            i++;
            j = 0;
            k = 0;
            continue;
            }

            if(j-k==i)
            {
                int x = Integer.parseInt(s.substring(k,j));
                int ld=x%10;
                if(ld==9)
                {
                    incr=true;
                }
                if(x>=low && x<=high)
                l.add(x);
                else if(x>high)
                stop=true;
                j++;
            }
            else if(j-k <i)
            {
                j++;
            }
            else
            {
                k++;
            }

            if(incr)
            {
                i++;
                j=0;k=0;
                incr=false;
            }

            if(stop)
            break;;
        }
        return l;
    }

    static int count(int n)
    {
        int cnt=0;
        while(n>0)
        {
            cnt++;
            n/=10;
        }

        return cnt;
    }
}