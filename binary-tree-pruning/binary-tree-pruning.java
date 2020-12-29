/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null)
            return root;
        
        int result = pruneTreeRecursion(root);
        return result ==0?null:root;
    }
    
    public int pruneTreeRecursion(TreeNode root){
        
        if(root == null)
            return 0;
        
        int leftResult = pruneTreeRecursion(root.left);
        int rightResult = pruneTreeRecursion(root.right);
        
        if(leftResult == 0 && rightResult == 0)
        {
            root.left=null; root.right=null;
            return root.val==0?0:1;
        }
        
        if(leftResult == 0)
        {
            root.left = null;
        }
        
        if(rightResult == 0)
        {
            root.right = null;
        }
        
        if(leftResult ==1 || rightResult ==1 ) 
            return 1;
        
        return -1;
    }
    
    
}
