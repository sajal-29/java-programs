package Trees;
import java.util.Scanner;
public class BinaryTree {

    public BinaryTree(){
    }
    private static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
    private Node root;

    public void populate(Scanner sc){
        System.out.println("Enter the root node value: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter to the left of "+ node.val);
        boolean left = sc.nextBoolean();

        if(left){
            System.out.println("Enter the value to the left of "+node.val);
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter to the right of "+node.val);
        boolean right = sc.nextBoolean();
        
        if(right){
            System.out.println("Enter the value to the right of "+node.val);
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }
    }

    public void display(){
        display(root, " ");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent+'\t');
        display(node.right, indent+'\t');
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }

        if(level != 0){
            for (int i = 0; i < level; i++) {
                System.out.println("\t\t");
            }
        }

         prettyDisplay(node.left, level+1);
        System.out.println(node.val);
        prettyDisplay(node.right, level+1);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        tree.populate(sc);
        tree.display();
        tree.prettyDisplay();
    }
}
