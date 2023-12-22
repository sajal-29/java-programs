package LinkedLists;

public class singlyLinkedList {
    private Node head;
    private Node tail;
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }private int size = 0;
    public singlyLinkedList(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertAt(int index, int val){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        if(index > size){
            throw new RuntimeException("Index exceed kar gya tera size se");
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void removeDupe(){
        head = dupesRemover(head);
    }
    private Node dupesRemover(Node node){
        if(node.next == null){
            return node;
        }
        if(node.val == node.next.val){
            node.next = node.next.next;
            node = dupesRemover(node);
        } else {
            node.next = dupesRemover(node.next);
        }
        return node;
    }

    public void insertRec(int val, int index){
        head = helper(val, index, head);
    }
    private Node helper(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = helper(val, index-1, node.next);
        return node;
    }
    public void deleteFirst(){
        int value = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        System.out.println(value);
    }
    public void deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int value = tail.val;
        tail = temp;
        tail.next = null;
        size--;
        System.out.println(value);
    }
    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size){
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i <= index-1; i++) {
            temp = temp.next;
        }
        int value = temp.next.val;
        temp.next = temp.next.next;
        size--;
        System.out.println(value);

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void reverse(){
        reverseDisplay(head);
        System.out.print("null");
        System.out.println();
    }
    public void reverseDisplay(Node node){
        if(node == null){
            return;
        }
        reverseDisplay(node.next);
        System.out.print(node.val+" -> ");
    }
}
