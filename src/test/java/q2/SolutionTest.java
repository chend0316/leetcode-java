package q2;

import leetcode.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void addTwoNumbers() {
        ListNode l1 = ListNode.from("[2,4,3]");
        ListNode l2 = ListNode.from("[5,6,4]");
        Solution q2 = new Solution();
        ListNode res = q2.addTwoNumbers(l1, l2);
        assertEquals(ListNode.from("[7,0,8]").toString(), res.toString());
    }
}