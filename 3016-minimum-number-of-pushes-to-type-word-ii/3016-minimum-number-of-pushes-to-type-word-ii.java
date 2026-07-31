class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        // Map<List<Character>, Integer> set = HashMap<>();
        // int indx=2;
        // List<Character> l = new ArrayList<>();
        // for(char c : word.toCharArray())
        // {
        //     if(indx>8)
        //     indx=2;
        //     if(!map.containsKey(c))
        //     map.put(, indx++);
        // }

        Map<Character, Integer> map = new HashMap<>();
        for(char c : word.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        List<Map.Entry<Character, Integer>> l = new ArrayList<>(map.entrySet());
        l.sort((a, b) -> b.getValue() - a.getValue());

        int indx=1;
        int count=0;
        Map<Character, Integer> ans = new HashMap<>();

        for(Map.Entry<Character, Integer> i : l)
        {
            if(count>=8)
            {
                indx++;
                count=0;
            }
            ans.put(i.getKey(), indx);
            count++;
        }

        System.out.print(ans);

        int sum=0;

        for(char c : word.toCharArray())
        {
            sum += ans.get(c);
        }

        return sum;


    }
}