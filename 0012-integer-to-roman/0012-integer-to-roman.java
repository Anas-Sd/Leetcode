class Solution {
    public String intToRoman(int rev) {
        StringBuilder sb = new StringBuilder();
        int totNumCount[] = CalculateTotNumCount(rev);
        int count = totNumCount[0];
        int n = totNumCount[1];
        int loop = count;
        while(loop-->0)
        {
            char curr='Z';
            if(count == 4)
            curr = 'T';
            else if(count == 3)
            curr = 'H';
            else if(count==2)
            curr = 'P';
            else
            curr = 'O';

            append(curr, n%10, sb);
            n/=10;
            count--;
        }

        return sb.toString();

    }

    static void append(char count, int val, StringBuilder sb)
    {
        if(count == 'T')
        {
            while(val>0)
            {
                sb.append('M');
                val--;
            }
        }
        else if(count == 'H')
        {
            if(val == 9)
            {
                sb.append('C');
                sb.append('M');
            }
            else if(val == 4)
            {
                sb.append('C');
                sb.append('D');
            }
            else if(val == 5)
            {
                sb.append('D');
            }
            else if(val == 1)
            {
                sb.append('C');
            }
            else
            {
                if(val>5)
                {
                    sb.append('D');
                    while(val>5)
                    {
                        sb.append('C');
                        val--;
                    }
                }
                else
                {
                    while(val>0)
                    {
                        sb.append('C');
                        val--;
                    }
                }
            }
        }
        else if(count == 'P')
        {
            if(val == 9)
            {
                sb.append('X');
                sb.append('C');
            }
            else if(val == 4)
            {
                sb.append('X');
                sb.append('L');
            }
            else if(val == 5)
            {
                sb.append('L');
            }
            else if(val == 1)
            {
                sb.append('X');
            }
            else
            {
                if(val>5)
                {
                    sb.append('L');
                    while(val>5)
                    {
                        sb.append('X');
                        val--;
                    }
                }
                else
                {
                    while(val>0)
                    {
                        sb.append('X');
                        val--;
                    }
                }
            }
        }
        else
        {
            if(val == 9)
            {
                sb.append('I');
                sb.append('X');
            }
            else if(val == 4)
            {
                sb.append('I');
                sb.append('V');
            }
            else if(val == 5)
            {
                sb.append('V');
            }
            else if(val == 1)
            {
                sb.append('I');
            }
            else
            {
                if(val>5)
                {
                    sb.append('V');
                    while(val>5)
                    {
                        sb.append('I');
                        val--;
                    }
                }
                else
                {
                    while(val>0)
                    {
                        sb.append('I');
                        val--;
                    }
                }
            }
        }
    }

    static int[] CalculateTotNumCount(int n)
    {
        int count=0;
        int rev = 0;
        while(n>0)
        {
            count++;
            rev = rev*10 + (n%10);
            n/=10;
        }

        return new int[]{count, rev};
    }
}