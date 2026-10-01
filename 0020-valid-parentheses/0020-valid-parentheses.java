class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(st.isEmpty() && (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'))
            return false;
            if(c=='[' || c=='{' || c=='(')
            st.push(c);
            else if(c==')' && st.peek()=='(' )
            st.pop();
            else if(c=='}' && st.peek()=='{')
            st.pop();
            else if(c==']' && st.peek()=='[')
            st.pop();
            else
            return false;
        }
        if(st.isEmpty())
        return true;
        else
        return false;
    }
}