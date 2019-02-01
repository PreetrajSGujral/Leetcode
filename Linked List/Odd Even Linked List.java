/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        ListNode t1= head, t2= head.next;
		ListNode ppp=t2;
		
		while(t2!=null && t2.next!=null)
		{
			t1.next= t2.next;
			if(t1.next==null)
			{
				t1.next=ppp;
				break;
			}
			t1= t1.next;
			t2.next=t1.next;
			t2=t2.next;
		}
		t1.next=ppp;
        return head;

    }
} 
