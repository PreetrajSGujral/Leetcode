/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public TreeNode print(int[] a, int beg, int end)
    {
        if(beg<=end)
        {
            int mid=(beg+end)/2;
            TreeNode x= new TreeNode(a[mid]);
            
            x.left= print(a, beg, mid-1);
            x.right= print(a, mid+1, end);
            
            return x;
        }
        return null;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return print(nums, 0, nums.length-1);
  
