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
    private int maxPathSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null) return maxPathSum;
        
        maxPathSumRecursion(root);
        return maxPathSum;
    }
    
    public int maxPathSumRecursion(TreeNode root){
        
        if(root ==null)
            return 0;
        
        int leftSubtree = Math.max(0,maxPathSumRecursion(root.left));
        int rightSubtree = Math.max(0,maxPathSumRecursion(root.right));
        
        int maxFromCurrentRoot=root.val+leftSubtree+rightSubtree;
        int maxNotFromCurrentRoot = root.val+Math.max(leftSubtree,rightSubtree);
        
        maxPathSum = Math.max(maxPathSum,maxFromCurrentRoot);
        return maxNotFromCurrentRoot;
    }
}
