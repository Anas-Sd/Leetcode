class Solution {
    public int minimumPushes(String word) {
        int count = 1;
        int n = word.length();
        int ans=0;
        while(n>=8)
        {
            ans += count * (8);
            n-=8;
            count++;
        }

        ans+= count*n;
        return ans;
    }
}