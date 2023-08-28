package linkedlist;

import linkedlist.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);
        linkedList.printList();


        //Prepend
        linkedList.prepend(4);
        linkedList.printList();
    }
}
