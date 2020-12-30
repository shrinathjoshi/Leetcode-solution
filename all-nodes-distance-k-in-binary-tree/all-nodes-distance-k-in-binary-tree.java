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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Map<TreeNode,TreeNode> parentMap = new HashMap<>();
        parentMap.put(root,new TreeNode(-1));
        
        populateParentMap(root,parentMap);
       // print(parentMap);
        
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> seen = new HashSet<>();
        queue.add(target);
        int level =0;
        
        while( !queue.isEmpty()){
            
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            
            while(size-->0){
                
                TreeNode top = queue.poll();
                if(top!=null &&top.val == -1)
                    continue;
                
                seen.add(top);
                row.add(top.val);
                
                if(top.left != null && !seen.contains(top.left)){
                    queue.add(top.left);
                }
                
                if(top.right !=null && !seen.contains(top.right)){
                    queue.add(top.right);
                }
                
                if(parentMap.get(top) != null && !seen.contains(parentMap.get(top))){
                    queue.add(parentMap.get(top));
                }
            }
            
            if(level == K)
                result = row;
            levelOrder.add(row);
            level++;
        }
        
        printResult(levelOrder);
