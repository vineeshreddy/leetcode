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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int carry = 0;
        while (null != l1 || null != l2 || carry != 0) {
            int x = (null != l1) ? l1.val : 0;
            int y = (null != l2) ? l2.val : 0;
            int sum = (x + y + carry);
            carry = sum/10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (null != l1) {
                l1 = l1.next;
            }
            if (null != l2) {
                l2 = l2.next;
            }
        }
        return res.next;
    }
}
