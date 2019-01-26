/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] a) {
        HashSet<Integer> set= new HashSet();
        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }
        ListNode l= head, temp= head;
        int count =0;
        while(l!=null)
        {
            int x=0;
            while(l!=null && set.contains(l.val))
            {
                l=l.next;
                x++;
            }
            if(x>0)
                ++count;
            if(l!=null)
                l=l.next;
        }
        return count;
    }
}
