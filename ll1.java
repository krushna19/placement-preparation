import java.util.*;

public class ll1 {
    // public void reverseiterate() {
    // if (head == null || head.next == null) {
    // return;
    // }
    // Node prevNode = head;
    // Node currNode = head.next;
    // while (currNode != null) {
    // Node nextNode = currNode.next;
    // currNode.next = prev;
    //
    // prevNode = currNode;
    // currNode = nextNode;
    // }
    // head.next = null;
    // head = prevNode;
    // }

    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("THE");
        list.addFirst("ROHIT SHARMA");
        System.out.println(list);
        list.addLast("mumbai");
        System.out.println(list);
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        // list.reverseiterate();
        // list.printlist();
    }
}
