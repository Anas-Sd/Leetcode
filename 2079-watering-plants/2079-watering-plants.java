class Solution {
    public int wateringPlants(int[] a, int capacity) {
        int org = capacity;
        int n = a.length;
        int x = 0;
        for(int i=0;i<n;)
        {
            if(a[i] <= capacity)
            {
                x++;
                capacity -= a[i];
                i++;
            }
            else
            {
                x+=i;
                x+=i;
                capacity=org;
            }
        }

        return x;
    }
}