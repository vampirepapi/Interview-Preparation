package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList(4);
        System.out.println(ll1);
        ll1.getHead();
        ll1.getTail();
        ll1.getLength();

        ll1.append(2);
        ll1.printList();
        ll1.append(4);
        ll1.printList();
        System.out.println(ll1.removeLast().value);
        System.out.println(ll1.removeLast().value);
        System.out.println(ll1.removeLast().value);
        System.out.println(ll1.removeLast());
    }
}
