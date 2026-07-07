class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int m=t.length();

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map1 = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(s.charAt(i)) || map1.containsKey(t.charAt(i)))
            {
                if((map.get(s.charAt(i)) == null) || (map.get(s.charAt(i)) != t.charAt(i)) || (map1.get(t.charAt(i)) == null) || (map1.get(t.charAt(i)) != s.charAt(i)))
                return false;                
            }
            else
            {
                map.put(s.charAt(i), t.charAt(i));
                map1.put(t.charAt(i), s.charAt(i));

            }
        }

        return true;
    }

    static boolean check(char c, Map<Character, Character> map)
    {
        for(char i : map.values())
        if(map.get(i) == c)
        return false;
        return true;
    }
}