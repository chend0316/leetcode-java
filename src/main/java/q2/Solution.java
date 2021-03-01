package q2;

import leetcode.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode p = res;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int a1 = l1 != null ? l1.val : 0;
            int a2 = l2 != null ? l2.val : 0;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            p.next = new ListNode((a1 + a2 + carry) % 10);
            carry = (a1 + a2 + carry) / 10;
            p = p.next;
        }
        return res.next;
    }
}