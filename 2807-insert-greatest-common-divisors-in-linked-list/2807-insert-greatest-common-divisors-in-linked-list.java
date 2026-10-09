/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null || head==null)
        return head;
        ListNode temp = head;
        while(temp.next!=null)
        {
            ListNode next = temp.next;
            int gcd = GCD(temp.val, next.val);
            ListNode newNode = new ListNode(gcd, next);
            temp.next = newNode;
            temp=next;
        }
        return head;
    }

    static int GCD(int temp, int next)
    {
        for(int i=Math.min(temp, next);i>=0;i--)
        {
            if(temp%i==0 && next%i==0)
            return i;
        }
        return -1;
    }
}