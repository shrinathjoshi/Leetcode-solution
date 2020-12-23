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
    private boolean isBalancedBinaryTree=true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        isBalancedRecursive(root);
        return isBalancedBinaryTree;
    }
    
    public int isBalancedRecursive(TreeNode root){
        if(root == null)
            return 0;
        
        int left = isBalancedRecursive(root.left);
        int right = isBalancedRecursive(root.right);
        
        if(right-left>1 || right-left<-1)
            isBalancedBinaryTree=false;
        
        return 1+Math.max(left,right);
    } 
}
