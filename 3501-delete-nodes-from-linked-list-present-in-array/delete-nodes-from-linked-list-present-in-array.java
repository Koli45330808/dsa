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
import java.util.HashSet;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Put all nums values into a set for quick lookup
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // Traverse the original list
        while (head != null) {
            // If head's value is not in nums, keep it
            if (!set.contains(head.val)) {
                curr.next=new ListNode(head.val);
                curr = curr.next;
            }
            head = head.next;
        }

        // Return the new list (skipping dummy)
        return dummy.next;
    }
}
