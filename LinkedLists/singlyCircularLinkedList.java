package LinkedLists;

public class singlyCircularLinkedList {
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
    }
    public singlyCircularLinkedList(){}

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void insertLast(){
        if(head == null){

        }
    }
    public void delete(int val){
        if(head == null){
            return;
        }
        Node node = head;
        if(node.val == val){
            head = node.next;
            tail.next = head;
            return;
        }
        do{
            Node temp = node.next;
            if(temp.val == val){
                node.next = temp.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }
    public void display(){
        Node temp = head.next;
        System.out.print(head.val+ " -> ");
        while (temp != head){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("head");
        System.out.println();
    }
}
