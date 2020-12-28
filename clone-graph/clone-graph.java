/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
​
class Solution {
    public HashMap<Integer,Node> map =new HashMap<>();
    public Node cloneGraph(Node node) {
        return clone(node);
    }
    
    private Node clone(Node root){
         if(root == null)
            return null;
        
        if(map.containsKey(root.val))
            return map.get(root.val);
        
        Node newNode =  new Node(root.val,new ArrayList<>());
        map.put(newNode.val,newNode);
        for(Node node : root.neighbors){
            newNode.neighbors.add(clone(node));
        }
        
        return newNode;
    }
}
