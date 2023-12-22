package LEETCODE;

import LinkedLists.SLL;

public class sortList {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.reverse();
        list.display();
//        list.reverseK(3);
//        list.reverseKTimes(3);
//        list.reverseKAlternatives(3);
        list.rotate(2);
        list.display();
        SLL ll = new SLL();
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(2);
        ll.insertLast(1);
        ll.display();
        System.out.println(ll.isPalindrome());

    }
    public static void sortLinkedList(SLL list){
        SLL.Node temp = list.head;
        SLL.Node tempNext = list.head.next;
        while (temp != null){
            while(tempNext != null){
                if(temp.val > tempNext.val){
                    swap(temp, tempNext);
                }
                tempNext = tempNext.next;
            }
            temp = temp.next;
        }
    }

    private static void swap(SLL.Node temp, SLL.Node tempNext) {
        SLL.Node dummy = temp;
        temp = tempNext;
        tempNext = dummy;
    }
}
