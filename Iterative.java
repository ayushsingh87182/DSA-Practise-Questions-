public class Iterative {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public void addfirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void addlast(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        public void print() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            System.out.println("null");
        }
    }

    public int helper(Node head, int key) {

        int index = 0;

        while (head != null) {

            if (head.data == key) {
                return index;
            }

            head = head.next;
            index++;
        }

        return -1;
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();

        Iterative search = new Iterative();
        int key = 3;
        int index = search.helper(ll.head, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the linked list.");
        }
    }

}
