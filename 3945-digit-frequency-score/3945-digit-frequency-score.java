class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while(n > 0)
        {
            int ld = n % 10;
            map.put(ld, map.getOrDefault(ld, 0)+1);
            n /= 10;
        }

        int sum = 0;

        for(int i : map.keySet())
        sum += (i * map.get(i));

        return sum;
    }
}