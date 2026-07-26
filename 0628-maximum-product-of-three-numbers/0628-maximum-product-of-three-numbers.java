class Solution {
    public int maximumProduct(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        return Math.max(a[n-1] * a[n-2] * a[n-3], a[0]*a[1]*a[n-1]);
    }
}