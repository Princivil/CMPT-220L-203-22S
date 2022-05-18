package base;

public class Test {

    public static void main(String[] args){
        BST n = new BST();
        n.insert(5);
        n.insert(25);
        n.insert(11);
        n.insert(1);
        n.insert(25);
        n.insert(15);

        System.out.println("1 Removed"); n.delete(1);
        System.out.println("Does 5 exist in the tree?"); n.exists(5); //doesn't work
        System.out.println("Tree Height:" + n.getHeight());
        System.out.println("Smallest:" + n.findSmallest());
        System.out.println("Largest:" + n.findLargest());
        //System.out.println("Nth Largest:" + n.findNthLargest());
        System.out.println("Post Order:"); n.printPostorder();
        System.out.println("In Order:"); n.printInorder();
        System.out.println("Pre Order:"); n.printPreorder();

    }
}
