package LEETCODE;
import LinkedLists.SLL;
public class mergeSortedLinkedList {
    public static void main(String[] args) {
        SLL first = new SLL();
        SLL second = new SLL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(4);
        first.insertLast(5);
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        second.insertLast(53);
        merge(first, second).display();
        System.out.println(hasCycle(first));
        System.out.println(cycleLength(second)); 
    }
    public static boolean hasCycle(SLL list){
        SLL.Node fast = list.head;
        SLL.Node slow = list.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static int cycleLength(SLL list){
        SLL.Node fast = list.head;
        SLL.Node slow = list.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                int length = 0;
                SLL.Node temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }
    public static SLL merge(SLL first, SLL second){
        SLL.Node f = first.head;
        SLL.Node s = second.head;
        SLL ans = new SLL();

        while(f != null && s != null){
            if(f.val < s.val){
                ans.insertLast(f.val);
                f = f.next;
            } else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.val);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }

}

