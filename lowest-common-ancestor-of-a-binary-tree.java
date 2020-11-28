/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        
        TreeNode leftSubtreeResult = lowestCommonAncestor(root.left,p,q);
        TreeNode rightSubtreeResult = lowestCommonAncestor(root.right,p,q);
        
        if(leftSubtreeResult != null && rightSubtreeResult != null) return root;
        
        if(leftSubtreeResult == null && rightSubtreeResult == null) return null;
        
        return leftSubtreeResult==null ? rightSubtreeResult : leftSubtreeResult;
        
    }
}
