/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode a= head;
        ListNode temp= head;
        while(temp.next!=null)
		{
			ListNode n= temp.next;
			temp.next= n.next;
			n.next=head;
			head=n;
		}
        return head;
    }
}
