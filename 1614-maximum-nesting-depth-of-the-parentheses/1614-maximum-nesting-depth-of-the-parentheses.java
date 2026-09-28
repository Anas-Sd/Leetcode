class Solution {
    public int maxDepth(String s) {
        int maxLength = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='(')
            {
                st.push(c);
                if(maxLength < st.size())
                maxLength = st.size();
            }
            else if(c == ')')
            {
                if(!st.isEmpty())
                st.pop();
            }
        }
        return maxLength;
    }
}