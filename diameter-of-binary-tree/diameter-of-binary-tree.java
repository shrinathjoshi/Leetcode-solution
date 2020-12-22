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
    private int result[] = new int[1];
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
​
        diameterOfBinaryTree1(root);
        return result[0]-1;
    }
    
    public int diameterOfBinaryTree1(TreeNode root){
        if(root == null)
            return 0;
        
        int leftDiameter = diameterOfBinaryTree1(root.left);
        int rightDiameter = diameterOfBinaryTree1(root.right);
        
        int diameterNotFromCurrentRoot = 1 + Math.max(leftDiameter,rightDiameter);
        int diameterFromCurrentRoot = 1+ leftDiameter+rightDiameter;
        
        int tempResult = Math.max(diameterNotFromCurrentRoot,diameterFromCurrentRoot);
        result[0] = Math.max(tempResult,result[0]);
        return  diameterNotFromCurrentRoot;
    }
}
