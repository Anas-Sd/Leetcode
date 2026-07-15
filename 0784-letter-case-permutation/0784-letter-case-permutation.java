class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> l = new ArrayList<>();
        List<Character> curr = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(char c : s.toCharArray())
        curr.add(c);
        backtrack(s, l, curr, 0, set);
        return l;
    }

    static void backtrack(String s, List<String> l, List<Character> curr, int i, Set<String> set)
    {
        if(i==s.length())
        {
            StringBuilder sb = new StringBuilder();
            for(char ii : curr)
            sb.append(ii);
            if(!set.contains(sb.toString()))
            {
                l.add(sb.toString());
                set.add(sb.toString());
            }
            return;
        }

        if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
        {
            curr.set(i, Character.toUpperCase(s.charAt(i)));
        }

        backtrack(s, l, curr, i+1, set);

        if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
        {
            curr.set(i, Character.toLowerCase(s.charAt(i)));
        }

        backtrack(s, l, curr, i+1, set);
    }
}