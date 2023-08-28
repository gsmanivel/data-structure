package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LinkedListTest {


    @Test
    public void testLinkedList() {
        LinkedList linkedList = new LinkedList(5);
        final int length = linkedList.length;
        assertEquals(1, length);
    }


    @Test
    public void printListTest() {
        LinkedList linkedList = new LinkedList(10);
        final String response = linkedList.printAll();
        assertEquals("length: " + linkedList.length, "length: 1");
    }

    @Test
    public void printEmptyListTest() {
        LinkedList linkedList = new LinkedList(10);
        assertEquals("list is not null", linkedList.printList());
    }


}