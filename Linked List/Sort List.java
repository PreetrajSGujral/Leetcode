/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp= head;
        int count=0;
		while(head!=null)
		{
			count++;
			head= head.next;
		}
        int[] a= new int[count];
		head= temp;
		int i=0;
		while(head!=null)
		{
			a[i]= head.val;
			head= head.next;
			++i;
		}
        head= temp;
		Arrays.sort(a);

		i=0;
		while(head!=null)
		{
			head.val=a[i];
			i++;
			head= head.next;
		}
        return temp;
        
    }
}
