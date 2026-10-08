class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> outer = new Stack<>();
        Stack<Character> inner = new Stack<>();
        Stack<Character> ans = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == '(')
            {
                if(outer.isEmpty())
                {
                    outer.push(c);
                }
                else
                {
                    ans.push(c);
                    inner.push(c);
                }
            }
            else
            {
                if(!inner.isEmpty())
                {
                    ans.push(c);
                    inner.pop();
                }
                else
                {
                    outer.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : ans)
        sb.append(c);

        return sb.toString();
    }
}