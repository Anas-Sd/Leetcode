class Solution {
    public boolean checkString(String s) {
        boolean B = false;
        for(char i : s.toCharArray())
        {
            if(i == 'b')
            B = true;
            else
            if(B)
            return false;
        }

        return true;
    }
}