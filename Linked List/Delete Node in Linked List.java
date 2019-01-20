/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode head) {
        ListNode temp=head;
       // temp=temp.next.next;
		while(temp.next!=null)
		{
			temp.val= temp.next.val;
			if(temp.next.next==null)
				temp.next=null;
			else	
			temp=temp.next;
		}
    }
}
