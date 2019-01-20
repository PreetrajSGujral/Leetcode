/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head, b=head;
        while(b!=null)
		{
			if(b.next==null || b.next.next==null)
				break;
			else
			{
				b=b.next.next;
				temp=temp.next;
			}
		}
        if(b.next!=null)
            temp=temp.next;
        return temp;
    }
}
