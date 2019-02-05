/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public ListNode print(ListNode head, ListNode head1, ListNode head2)
    {
         ListNode t1=head1;
		 ListNode t2=head2;
		 ListNode t=head;
		 
		 		 
		 while(t1!=null && t2!=null)
		 {
			 if(t1.val<t2.val)
			 {
				 t.next= new ListNode(t1.val);
				 t1=t1.next;
				 t=t.next;
			 }
			 else
			 {
				 t.next= new ListNode(t2.val);
				 t2=t2.next;
				 t=t.next;
			 }
		 }
		 while(t1!=null)
		 {
			 t.next= new ListNode(t1.val);
			 t1=t1.next;
			 t=t.next;
		 }
		 while(t2!=null)
		 {
			 t.next= new ListNode(t2.val);
			 t2=t2.next;
			 t=t.next;
		 }
		 		 
		 return head;
    }
    
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head= new ListNode(-1000);
        print(head, l1, l2);
        return head.next;
        
    }
}
