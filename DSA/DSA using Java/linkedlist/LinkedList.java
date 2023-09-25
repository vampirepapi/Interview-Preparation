package linkedlist;

public class LinkedList {
    //properties
    // try to define class properties as private
    private Node head;
    private Node tail;
    private int length;

    //inner class - Node
    class Node{
        int value;
        Node next;

        // constructor of node class
        public Node(int value){
            this.value = value;
        }
    }

    // constructor of linkedlist class
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // printing linked list
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //getHead function
    public void getHead(){
        System.out.println(head.value);
    }
    
    //getTail function
    public void getTail(){
        System.out.println(tail.value);
    }

    //length of the linkedlist function
    public void getLength(){
        System.out.println(length);
    }

    // append to the ll
    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // remove from the last in ll
    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node pre = head;
        Node temp = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length==0){
            head = null;
            tail = null;
        }
        return temp;
    }
    // prepend function
    public void prependToLL(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
}
