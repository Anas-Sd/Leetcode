class Solution {
    public String longestCommonPrefix(String[] s) {
        int n=s.length;
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        boolean stop=false;
        while(i<s[0].length())
        {
            char c = s[0].charAt(i);
            for(int k=0;k<n;k++)
            {
                if(s[k].length() <= i)
                {
                    stop = true;
                    break;
                }
                if(!verify(s[k], c, i))
                return sb.toString();
            }
            if(stop)
            break;
            sb.append(c);
            i++;
        }

        return sb.toString();
    }

    static boolean verify(String s, char c, int indx)
    {
        if(s.charAt(indx) == c)
        return true;
        else return false;
    }
}