package base;

public class Node {
    int val;
    Node left; //left child
    Node right; //right child
    boolean deleted; //checks for deleted node
    boolean visited; //checks if node was visited

    public Node(int val){
        this.val = val;
        left = null;
        right = null;
        deleted = false;
        visited = false;
    }
    void visit(){
        visited = true;
    }
    void unvisit(){
        visited = false;
    }
}
