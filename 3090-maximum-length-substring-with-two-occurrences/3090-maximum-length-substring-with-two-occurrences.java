class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int len=0, max=-1, j=0;
        for(int i=0;i<n;)
        {
            char c = s.charAt(i);
                if(map.containsKey(c))
                {
                    if(map.get(c)<2)
                    {
                        map.put(c, map.getOrDefault(c,0)+1);
                        len++;
                        i++;
                    }
                    else
                    {
                        map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) - 1);
                        len--;
                        if(map.get(s.charAt(j)) == 0)
                        map.remove(s.charAt(j));
                        j++;
                    }

                }
                else
                {
                    map.put(c, map.getOrDefault(c, 0)+1);
                    len++;
                    i++;
                }
                max = Math.max(max, len);
            }
        return max;
    }
}