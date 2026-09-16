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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(temp == null)
        return null;
        ListNode curr = head.next;

        while(temp.next != null)
        {
            if(temp.val == curr.val)
            {
                temp.next=curr.next;
                curr = curr.next;
            }
            else
            {
                temp = temp.next;
                curr = curr.next;
            }
        }

        return head;
    }
}