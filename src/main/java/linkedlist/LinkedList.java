package linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    int length;


    public LinkedList(int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        this.length = 1;
    }


    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
            this.length = this.length + 1;
        } else if (this.length > 0) {
            Node tempNode = this.head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            this.tail = newNode;
            this.length = length + 1;
        }
    }


    public Node removeLast() {
        if (this.length == 0) {
            return null;
        } else if (this.length == 1) {
            this.head = null;
            this.tail = null;
            length = 0;
            return head;
        } else {
            Node temp = head;
            Node pre = head;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            return temp;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            Node tempNode = head;
            newNode.next = tempNode;
            head = newNode;
        }
        length++;
    }


    public Node removeFirst(){
        if(length ==0) {
            return null;
        }

        if(length ==1){
            Node temp = head;
            head = tail = null;
            return temp;
        }
        else {
            Node nodeToBeDeleted = head;
            head = head.next;
            return nodeToBeDeleted;
        }
    }


    public String printList() {
        Node tempNode = this.head;
        if (tempNode == null) {
            System.out.println("list is null");
            return "list is null";
        } else {
            System.out.println("\nLinked List:");
            while (tempNode != null) {
                System.out.println(tempNode.value);
                tempNode = tempNode.next;
            }
            return "list is not null";
        }
    }

    public String printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
            return "Head: null " + "Tail: null";
        } else if (length > 0) {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
            System.out.println("Length:" + length);
            printList();
            return "length: " + length;
        }
        return null;
    }


    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
