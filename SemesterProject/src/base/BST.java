package base;

import java.util.ArrayList;

/**Binary Search Tree*/
public class BST {
    Node head;


    /**Constructor to initialize head of tree*/
    public BST() {
        head = null;
    } //Head of tree

    /**Creating the Elements*
     * Adds data to the tree
     * @param val -
     * */
    public void insert(int val){
        Node node = new Node(val); //creates node
        if(head == null){ //if tree is empty add node as new head
            head = node;
        }else{
            insert(head, node); //call method to insert node in next space
        }

    }


        /**Private recursive method to add data to tree
         * @param curr -
         * @param node -
         * */
    private void insert(Node curr, Node node){
        if (curr.val <= node.val){ //check if new node comes after the current node
            if(curr.right == null){ //if right node is empty set new node as right child
                curr.right = node;
            }else{
                insert(curr.right, node); //if not check the right node
            }
        }
        else{
            if(curr.left == null){ //if left node is empty set the new node as left child
                curr.left = node;
            }
            else{
                insert(curr.left, node);
            }
        }
    }
    /** Tree Manipulation
     * Removes elements from tree
     * @param val -
     * */
    public void delete(int val){
        if(head != null){ //call to search and delete node
            delete(head, val);
        }
    }

        /**Private recursive method to search for item to delete
         * @param curr -
         * @param val -
         * */
    private void delete(Node curr, int val){
        if (curr == null) return; //return current node if it is null
        if(curr.val == val){
            curr.deleted = true; //delete if we find item
        }
        else if(curr.val <= val){ //if item is larger or equal go right
            delete(curr.right, val);
        }
        else{
            delete(curr.left, val); //otherwise, smaller go left
        }
    }

    /**Searching the tree
     * Check if item exists in tree
     * @param val -
     * @return -
     * */
    public boolean exists(int val){
        return exists(head, val);
    }

    /**Check if item exists
     * @param curr -
     * @param val -
     * @return -
     * */
    private boolean exists(Node curr, int val){
        if(curr == null) //if current is null return false
            return false;
        if(curr.val == val &&  !curr.deleted) //check if item matches and it is not deleted
            return true;
        boolean res = exists(curr.left, val); //check left| res is just variable i chose to represent left
        if (!res) res = exists(curr.right, val); //check right
        return res;
    }


    /**Returns height of tree
     * @return -
     * */
    public int getHeight(){ //returns height of tree
        return height(head);
    }

    /**Get height of tree
     * @param curr -
     * @return -
     * */
    private int height(Node curr){ // if current node is null
        if (curr == null)
            return 0;
            int hLeft = height(curr.left);
            int hRight = height(curr.right);//retrieve heights of both sides returns taller branch
            return Math.max(hLeft, hRight) + 1; //need to include curr node at the top
    }

    /**Find smallest val
     * @return -
     * */
    public int findSmallest(){
        if(head == null) return -1; //if tree not empty calls recursive method
            return smallest(head);
    }

    /**Find smallest node
     * @param curr -
     * @return -
     * */
    private int smallest(Node curr){ //returns leftmost node
        if(curr.left != null)
            return smallest(curr.left);
        else return curr.val;
    }

    /**Find largest element in list
     * @return -
     * */
    public int findLargest(){
        if(head == null) return -1;
        return largest(head);
    }

    /**Find largest element in list
     * @param curr -
     * @return -
     * */
    private int largest(Node curr){ //returns rightmost node
        if (curr.right != null)
            return largest(curr.right);
        else return curr.val;
    }

    /**Find the nth rank according to sizes of elements
     * @param x -
     * @return -
     * */
    public int findNthLargest(int x){
        ArrayList<Integer>nodes = new ArrayList<>(); //List to hold elements
        findAllElements(head, nodes); //get all elements in order
        if(x < nodes.size())
            return nodes.get(x); //return the element at given position
        else return -1;
    }

    /**Adds all elements in tree to the list
     * @param curr -
     * @param nodes -
     * */
    private void findAllElements(Node curr, ArrayList<Integer> nodes){
        if (curr == null) //if at thr end, return
            return;
        findAllElements(curr.left, nodes);//using inorder transversal to add elements to list
        nodes.add(curr.val);
        findAllElements(curr.right, nodes);
    }
    
    /** Tree Transversal
     * Private method to print tree nodes in postorder
     * @param curr -
     * */
    //Post Order: Left, Right, Root
    private void postorder(Node curr){
        if(curr == null) //if at end of tree return
            return;
        postorder(curr.left); //go left
        postorder(curr.right); //go right
        System.out.print(curr.val + " "); //print current node
    }

    /**Print in postorder*/
    public void printPostorder(){
        postorder(head);
        System.out.println();
    }


    /**Private method to print tree nodes in inorder
     * @param curr -
     * */
    //Post Order: Left, curr, Right
    private void inorder(Node curr){
        if(curr == null) //current item is null return
            return;
        inorder(curr.left); //go left
        System.out.print(curr.val + " "); //current node
        inorder(curr.right);//go right
    }
    /**Print in inorder*/
    public void printInorder(){
        inorder(head);
        System.out.println();
    }

    /**Private method to print tree nodes in preorder
     * @param curr -
     * */
    //Post Order: Root, Left , Right
    private void preorder(Node curr){
        if (curr == null)
            return;
        System.out.print(curr.val + " ");
        preorder(curr.left);
        preorder(curr.right);
    }
    /**Print in inorder*/
    public void printPreorder(){
        preorder(head);
        System.out.println();
    }





}