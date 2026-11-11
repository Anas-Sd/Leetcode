class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long seperate = (long) cost1 * need1 + (long) cost2 * need2;
        long allBoth = (long) Math.max(need1, need2) * costBoth;
        long costAndType = 0;
        if(need1 > need2)
        {
            costAndType += (long) need2 * costBoth;
            costAndType += (long) (need1 - need2) * cost1;
        }
        else
        {
            costAndType += (long) need1 * costBoth;
            costAndType += (long) (need2 - need1) * cost2;
        }

        return Math.min(seperate, Math.min(allBoth, costAndType));
    }
}