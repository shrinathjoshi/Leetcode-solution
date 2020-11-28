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
    private int result=0;
    public int minCameraCover(TreeNode root) {
        
        if(dfs(root)<1)
            result++;
        
        return result;
    }
    
    private int dfs(TreeNode root){
        if(root == null) return 2; 
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        if(left == 0 || right == 0)
        {
            result++;
            return 1;
        }
        
        if(left == 1 || right == 1)
            return 2;
        else
            return 0;
        
    }
}
