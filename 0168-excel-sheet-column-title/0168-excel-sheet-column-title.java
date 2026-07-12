class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        // int org=n;
        while(n>0)
        {
            n=n-1;
            sb.append(((char)('A' + (n%26))));
            n/=26;
        }
        return sb.reverse().toString();
    }
}