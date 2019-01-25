/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1= headA, n1=headA;
        ListNode l2= headB, n2= headB;
        if(l1==null || l2==null)
            return null;
        
        int size1=1, size2=1; 
        while(l1.next!=null)
        {
            l1=l1.next;
            ++size1;
        }
        while(l2.next!=null)
        {
            l2=l2.next;
            ++size2;
        }
        if(l1!=l2)
            return null;
        
        if(size1>size2)
        {
           int n=size1-size2;
            for(int i=1;i<=n;i++)
            {
                n1= n1.next;
            }
        }
        else
        {
           int n=size2-size1;
            for(int i=1;i<=n;i++)
            {
                n2= n2.next;
            }
        }
        while(n1!=n2)
        {
            n1=n1.next;
            n2= n2.next;
        }
      //  System.out.println(n1.val+" "+n2.val);
        return n1;
    }
}
