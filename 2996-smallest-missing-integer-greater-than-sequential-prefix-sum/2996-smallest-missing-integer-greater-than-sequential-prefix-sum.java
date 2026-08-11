class Solution {
    public int missingInteger(int[] a) {
        int n = a.length;
        int strt = a[0], sum=a[0];

        for(int i=1;i<n;i++)
        {
            if(strt+1 == a[i])
            {
                strt = a[i];
                sum+=a[i];
            }
            else
            {
                break;
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int i : a)
        l.add(i);

        for(int i=sum;;i++)
        if(!l.contains(i))
        {
            return i;
        }
    }
}