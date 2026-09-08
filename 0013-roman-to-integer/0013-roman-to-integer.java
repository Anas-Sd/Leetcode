class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            char next = 'Z';
            if(i+1 < n)
            next = s.charAt(i+1);
            else
            next = 'E';
            if(c=='I')
            {
                if(next == 'V')
                {
                    sum+=4;
                    i++;
                }
                else if(next == 'X')
                {
                    sum+=9;
                    i++;
                }
                else
                sum+=1;
            }
            else if(c=='V')
            sum+=5;
            else if(c=='X')
            {
                if(next == 'L')
                {
                    sum+=40;
                    i++;
                }
                else if(next == 'C')
                {
                    sum+=90;
                    i++;
                }
                else
                sum+=10;
            }
            else if(c=='L')
            sum+=50;
            else if(c=='C')
            {
                if(next == 'D')
                {
                    sum+=400;
                    i++;
                }
                else if(next == 'M')
                {
                    sum+=900;
                    i++;
                }
                else
                sum+=100;
            }
            else if(c=='D')
            sum+=500;
            else if(c=='M')
            sum+=1000;
        }
        return sum;
    }
}