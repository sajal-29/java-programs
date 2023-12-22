package LinkedLists;

public class doublyLinkedList {
    public class Node{
        private int val;
        private Node next;
        private Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
    private Node head;
    int size;
    doublyLinkedList(){this.size = 0;}

    public void insertFirst(int val){
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insert(int index, int val){
        Node node = new Node(val);
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
        size++;
    }
    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
        size++;
    }

    public void deleteFirst(){
        if (head == null){
            return;
        }
        head = head.next;
        head.prev = null;
    }
    public void delete(int index){
        Node temp = head;
        if(index == 0){
            deleteFirst();
            return;
        }
        for (int i = 1; i <= index ; i++) {
            temp = temp.next;
        }
        if(temp.next == null){
            deleteLast();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void deleteLast(){
        if (head == null){
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
    }

    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void reverseDisplay(){
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.prev;
        }
        System.out.print("Start");
        System.out.println();
    }
}
