/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
    
         ListNode dummy = new ListNode(0), prev = dummy, current = head;

        while(current != null)
        {
            if(prev.val > current.val)
                prev = dummy;

            // Find the right place to insert current node
            while(prev.next != null && prev.next.val < current.val)
                prev = prev.next;

            // Insert current between prev and prev.next
            ListNode nextNode = current.next;
            current.next = prev.next;
            prev.next = current;
            current = nextNode;
        }
        return dummy.next;
    }
    }
