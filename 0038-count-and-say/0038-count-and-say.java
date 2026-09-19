class Solution {
    public String countAndSay(int n) {
        String ans = "11";
        if(n == 1)
        return "1";
        n-=2;
        while(n-->0)
        {
            List<Integer> cnt = count(ans);
            List<Character> num = no(ans);
            System.out.print(cnt);
            System.out.print(" ");
            System.out.print(num);
            System.out.println();
            StringBuilder sb = new StringBuilder();
            int x = 0;
            while(x < cnt.size())
            {
                sb.append(cnt.get(x));
                sb.append(num.get(x));
                x++;
            }
            ans = sb.toString();
        }

        return ans;
    }

    static List<Character> no(String s)
    {
        List<Character> l = new ArrayList<>();
        l.add('&');
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != l.get(l.size()-1))
            l.add(s.charAt(i));
        }
        l.remove(0);

        return l;
    }

    static List<Integer> count(String s)
    {
        int count=1;
        List<Integer> l = new ArrayList<>();
        int i = 0;
        int strt = 0, stop = 0;
        while(i<s.length())
        {
            while((i+1 < s.length()) && (s.charAt(i) == s.charAt(i+1)))
            {
                count++;
                i++;
            }
            l.add(count);
            count=1;
            i++;
        }

        return l;
    }
}