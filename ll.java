class ll {
    Node head;
    private int size;

    ll() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add last
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;

    }

    public void deletelast() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode = head.next;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getsize() {
        return size;
    }

    public static void main(String args[]) {
        ll list = new ll();
        list.addfirst("sachin");
        list.addfirst("is");
        list.addlast("gratest");
        list.addlast("batsman");

        list.printlist();

        list.deletefirst();
        list.printlist();

        list.deletelast();
        list.printlist();

        System.out.println(list.getsize());
    }
}