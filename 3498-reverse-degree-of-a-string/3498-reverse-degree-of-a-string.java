class Solution {
    public int reverseDegree(String s) {
        int indx=1, sum=0;
        for(char c : s.toCharArray())
        {
            int rev = 26 - (c - 'a');
            sum+= (rev*indx++);
        }
        return sum;
    }
}