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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head;
        // ListNode curr = head.next;
        ListNode temp = head;
        int count = totCount(head);
        int rem = count-n+1;
        int remove = 0;

        if(rem == 1)
        return head.next;

        while(temp != null)
        {
            remove++;
            if(rem == remove)
            {
                prev.next = temp.next;
                temp = temp.next;
            }
            else
            {
                prev = temp;
                temp=temp.next;
            }
        }

        return head;
    }

    static int totCount(ListNode head)
    {
        int count=0;
        ListNode temp = head;
        while(temp != null)
        {
            count++;
            temp=temp.next;
        }

        return count;
    }
}