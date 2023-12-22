package Trees;

public class segmentTree {

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        segmentTree tree = new segmentTree(arr);
        tree.constructTree(arr, 0, arr.length-1);
        System.out.println(tree.query(1,6));
    }
    private static class Node {
        int data;
        int startIndex;
        int endIndex;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startIndex = startInterval;
            this.endIndex = endInterval;
        }
    }

    Node root;

    public segmentTree(int[] arr){
        // creating a tree using this array
        this.root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end){
        if(start == end){
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = start + (end - start)/2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid+1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = "";

        if(node.left != null){
            str = str + "Interval = [" + node.left.startIndex + "-" + node.left.endIndex + "] and date : "+node.left.data + " -> ";
        } else {
            str = str + "No left child";
        }
        // for current node
        str = str + "Interval = [" + node.startIndex + "-" + node.endIndex + "] and date : "+node.data + " -> ";

        if(node.right != null){
            str = str + "Interval = [" + node.right.startIndex + "-" + node.right.endIndex + "] and date : "+node.right.data + " -> ";
        } else {
            str = str + "No right child";
        }

        System.out.println(str);

        if(node.left != null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }

    }

    public int query(int startIndex, int rightIndex){
        return this.query(this.root, startIndex, rightIndex);
    }

    private int query(Node node, int start, int end){
        if(node.startIndex >= start && node.endIndex <= end){
            return node.data;
        } else if(node.startIndex > end || node.endIndex < start){
            return 0;
        } else {
            return this.query(node.left, start, end) + this.query(node.right, start, end);
        }
    }

    public int update(int index, int value){
        return update(this.root, index, value);
    }
    private int update(Node node, int index, int value){
        if(index >= node.startIndex && index <= node.endIndex){
            if(index == node.startIndex && index == node.endIndex){
                node.data = value;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
