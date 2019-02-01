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
  public void flatten(TreeNode root) {
    if (root == null) {
      return;
    }
    
    TreeNode left = root.left;
    TreeNode right = root.right;
    
    if (left != null) {
      flatten(left);
      root.right = left;
      root.left = null;
      while (root.right != null) {
        root = root.right;
      }
      
      root.right = right;
    }
    
    if (right != null) {
      flatten(right);  
    }
  }
}
