package LinkedLists;

public class SLL {
        public Node head;
        public Node tail;
    public class Node{
        public int val;
        public Node next;

            public Node(int val){
                this.val = val;
            }
            public Node(int val, Node next){
                this.val = val;
                this.next = next;
            }
        }public int size = 0;
        public SLL(){
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
                return;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public void reverse(){
            helpReverse(head);
        }
        private void helpReverse(Node node){
            if(node == tail){
                head = tail;
                return;
            }
            helpReverse(node.next);
            tail.next = node;
            tail = node;
            node.next = null;
        }

        public void reverseIterative(){
            Node prev = null;
            Node present = head;
            Node second = head.next;

            while(second != null){
                present.next = prev;
                prev = present;
                present = second;
                second = second.next;
            }
            present.next = prev;
            head = present;
        }

        public void reverseBetween(int left, int right){
            if(left == right){
                return;
            }
            Node prev = null;
            Node present = head;

            for (int i = 0; present != null && i < left - 1; i++) {
                prev = present;
                present = present.next;
            }
            Node last = prev;
            Node newEnd = present;
            Node second = present.next;

            for (int i=0; present != null && i < right-left+1;i++){
                present.next = prev;
                prev = present;
                present = second;
                if(second != null){
                    second = second.next;
                }
            }
            if(last != null){
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = present;
        }

        public boolean isPalindrome(){
            reverseList(getMid());
            Node first = head;
            Node second = getMid();

            while(second != null && first != getMid()){
                if(first.val != second.val){
                    return false;
                }
                first = first.next;
                second = second.next;
            }
            return true;
        }

        public void reverseList(Node node){
            int left = getIndex(node)+1;
            int right = length();
                if(left == right){
                    return;
                }
                Node prev = null;
                Node present = head;

                for (int i = 0; present != null && i < left - 1; i++) {
                    prev = present;
                    present = present.next;
                }
                Node last = prev;
                Node newEnd = present;
                Node second = present.next;

                for (int i=0; present != null && i < right-left+1;i++){
                    present.next = prev;
                    prev = present;
                    present = second;
                    if(second != null){
                        second = second.next;
                    }
                }
                if(last != null){
                    last.next = prev;
                } else {
                    head = prev;
                }

                newEnd.next = present;


        }

        public int length(){
            int count = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                count++;
            }
            return count;
        }

    public Node getMid(){
            Node fast = head;
            Node slow = head;

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    public void reorder(){
            Node mid = getMid();
            reverseList(mid);
            Node headSecond = mid.next;
            Node headFirst = head;
            while(headSecond != null && headFirst != null){
                Node temp = headFirst.next;
                headFirst.next = headSecond;
                headFirst = temp;
                temp = headSecond.next;
                headSecond.next = headFirst;
                headFirst = temp;
            }
            if(headFirst != null){
                headFirst.next = null;
            }
    }
        public void sort(){
            Node first = head;
            Node second  = head.next;

            while (first != null) {
                Node x = head;
                while (second != null && x != null) {
                    if (x.val > second.val) {
                        if(x == head){
                            head = second;
                            x.next = second.next;
                            second.next = x;
                        } else if (second == tail) {
                            int index = getIndex(x) - 1;
                            Node temp = getNode(index);
                            temp.next = second;
                            second.next = x;
                            tail = x;
                        } else {
                            int index = getIndex(x) - 1;
                            Node temp = getNode(index);
                            temp.next = second;
                            x.next = second.next;
                            second.next = x;
                        }
                    }
                    second = second.next;
                    x = x.next;
                }
                second = head.next;
                first = first.next;
            }

        }

        public Node getNode(int index){
            Node temp = head;
            while(index > 0){
                temp = temp.next;
                index--;
            }
            return temp;
        }

        public int getIndex(Node which){
            int count = 0;
            Node temp = head;
            while (temp != which){
                temp = temp.next;
                count++;
            }
            return count;
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
        public void reverseLL(){
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

        public void rotate(int k){
            while(k>0){
                reverseBetween(1,length()-1);
                reverse();
                k--;
            }
        }

        public void reverseK(int k){
            int left = 1;
            int right = k;
            int totalSize = length()%2 == 0 ? length():length()+1;
            while(right <= totalSize){
                reverseBetween(left, right);
                left = right+1;
                right += k;
            }
        }
        public void reverseKTimes(int k){
            Node prev = null;
            Node current = head;
            Node next = current.next;
            int count = 0;

            while(current != null & count <= k){
                count += k;
                if(count > length()){
                    return;
                }
                Node last = prev;
                Node newEnd = current;
                for (int i = 0;current != null && i < k; i++) {
                    current.next = prev;
                    prev = current;
                    current = next;
                    if(next != null){
                        next = next.next;
                    }
                }
                if(last != null){
                    last.next = prev;
                } else {
                    head = prev;
                }
                newEnd.next = current;
                prev = newEnd;
            }
        }

        public void reverseKAlternatives(int k){
            Node prev = null;
            Node current = head;
            Node next = current.next;

            while(true){
                Node last = prev;
                Node newEnd = current;

                for (int i = 0;current!= null &&  i < k; i++) {
                    current.next = prev;
                    prev = current;
                    current = next;
                    if(next != null){
                        next = next.next;
                    }
                }
                if(last!=null){
                    last.next = prev;
                } else {
                    head = prev;
                }
                newEnd.next = current;
                prev = newEnd;

                for (int i = 0;current != null && i < k; i++) {
                    prev = prev.next;
                    current = current.next;
                    if(next != null){
                        next = next.next;
                    }
                }
                if(current == null){
                    break;
                }
            }


        }

    public ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
            if(head == null){
                return head;
            }

            ListNode mid = middleNode(head);
            ListNode current = head;
            ListNode prev = null;

            while(current.next != mid){
                prev = current;
                current = current.next;
            }

            ListNode next = current.next;

            while(current != null){
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }
            return prev;
    }
    public ListNode reorder(ListNode head){
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode headFirst = head;
        while(headSecond != null && headFirst != null){
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;
            temp = headSecond.next;
            headSecond.next = headFirst;
            headFirst = temp;
        }
        if(headFirst != null){
            headFirst.next = null;
        }
        return head;
    }

}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

