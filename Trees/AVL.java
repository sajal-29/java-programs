package Trees;

public class AVL {
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

    public AVL(){}

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public int showHeight(){
        return height(root);
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
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1) {
            // left cases
            if (height(node.left.left) - height(node.left.right) > 0) {
                // left - left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                // left - right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1){
            // right cases
            if(height(node.right.right) - height(node.right.left) > 0){
                // right - right case
                return leftRotate(node);
            }
            if(height(node.right.right) - height(node.right.left) < 0){
                // right - left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node p) {
        Node c = p.right;
        Node t = c.left;
        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;
        return c;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;
        return c;
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
        AVL tree = new AVL();

        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println(tree.showHeight());
    }

}
