/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy= new ListNode(-1);
		dummy.next= head;
		
		ListNode p= dummy, t= head;
		while(t!=null)
		{
			boolean x= false;
			while(t.next!=null && t.val ==t.next.val)
			{
				t=t.next;
				x=true;
			}
			if(t!=null && x==true)
			{
				t=t.next;
				if(t==null)
					p.next=null;
				//	p.next=t;
				//p=p.next;
			}
			
			else if(x==false)
			{
				p.next=t;
				p=p.next;
				t=t.next;
			}
			if(p==null)
				break;
		}
		return dummy.next;
		
    }
}
