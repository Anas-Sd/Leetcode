class Solution {
    public int canBeTypedWords(String s, String t) {
        int n=s.length();
        int m=t.length();

        List<String> l = new ArrayList<>();
        String parts[] = s.split(" ");
        for(int i=0;i<parts.length;i++)
        l.add(parts[i]);

        Set<Character> set = new HashSet<>();
        for(char c : t.toCharArray())
        set.add(c);
        int count=0;
        for(String i : l)
        {
            if(check(i, set))
            count++;
        }

        return count;
    }

    static boolean check(String s, Set<Character> set)
    {
        for(char c : s.toCharArray())
        {
            if(set.contains(c))
            return false;
        }

        return true;

    }
}