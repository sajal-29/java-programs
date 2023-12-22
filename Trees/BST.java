package Trees;

public class BST {
    public static class Node {
        private int val;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.val = value;
        }
        public int getValue(){
            return val;
        }
    }
    private Node root;

    public BST(){}

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(root, value);
    }
    public Node insert(Node node, int val){
        if(node == null){
            node = new Node(val);
            return node;
        }
        if(val < node.getValue()){
            node.left = insert(node.left, val);
        }
        if(val > node.getValue()){
            node.right = insert(node.right, val);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;
        return node;
    }

    public void populate(int[] nums){
        for (int num : nums) this.insert(num);
    }

    public void sortedPopulate(int[] nums){
        sortedPopulate(nums, 0, nums.length-1);
    }

    private void sortedPopulate(int[] nums, int start, int end){
        if(start > end){
            return;
        }
        int mid = start + (end - start)/2;
        this.insert(nums[mid]);
        sortedPopulate(nums, start,mid-1);
        sortedPopulate(nums, mid+1, end);
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display(){
        display(root, "Root value: ");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left , "Left child of "+ node.getValue()+ ":");
        display(node.right , "Right child of "+ node.getValue()+ ":");
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.getValue());
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.getValue());
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.getValue());
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.insert(12);
//        tree.display();
//        System.out.println(tree.isBalanced());
        int[] nums = {40,4,24,23,6,75,46};
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        BST newTree = new BST();
        newTree.sortedPopulate(arr);
        newTree.display();
//        System.out.println(newTree.isBalanced());
//        newTree.preOrder();
//        newTree.postOrder();
//        newTree.inOrder();
    }
}
