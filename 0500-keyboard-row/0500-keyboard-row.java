class Solution {
    public String[] findWords(String[] s) {
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";

        List<String> l = new ArrayList<>();

        for(int i=0;i<s.length;i++)
        {
            boolean o = false, t=false, th=false;
            if(one.indexOf(s[i].charAt(0)) != -1 )
            o=true;
            else if(two.indexOf(s[i].charAt(0)) != -1)
            t=true;
            else
            th=true;

            boolean yes=true;
            for(int j=0;j<s[i].length();j++)
            {
                if(o)
                {
                    if(one.indexOf(s[i].charAt(j)) == -1)
                    yes=false;
                }
                else if(t)
                {
                    if(two.indexOf(s[i].charAt(j)) == -1)
                    yes=false;
                }
                else
                {
                    if(three.indexOf(s[i].charAt(j)) == -1)
                    yes=false;
                }

                if(!yes)
                break;
            }
            if(yes)
            l.add(s[i]);
        }

        String ans[] = new String[l.size()];
        int indx=0;
        for(String i : l)
        ans[indx++] = i;

        return ans;
    }
}