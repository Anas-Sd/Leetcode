class Solution {
    public int countSegments(String s) {
        s = s.trim();
        int charr =0;
        char cb = ' ';
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(i!=0)
            cb = s.charAt(i-1);
            else
            cb=' ';

            if(cb == ' ' && c!=' ')
            charr++;
        }

        return charr;
    }
}