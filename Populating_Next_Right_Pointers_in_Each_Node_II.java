/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    
    public void traverse(Node root,HashMap<Integer,List<Node>> hm,int level){
        
        if(root==null){
            return;
        }
        if(hm.containsKey(level)){
            List<Node> list=hm.get(level);
            list.add(root);
            hm.put(level,list);
        }
        else{
            List<Node> list=new LinkedList<Node>();
            list.add(root);
            hm.put(level,list);
        }
        
        traverse(root.left,hm,level+1);
        traverse(root.right,hm,level+1);
        
    }
    public Node connect(Node root) {
        
        HashMap<Integer,List<Node>> hm=new HashMap<>();
        traverse(root,hm,0);
        
        for(int level:hm.keySet()){
            
            List<Node> list=hm.get(level);
            for(int i=0;i<list.size()-1;i++){
                list.get(i).next=list.get(i+1);
            }
            list.get(list.size()-1).next=null;
        }
        
        return root;
    }
}