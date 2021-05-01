public class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data
    }
}

public class LinkedList{
    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        return;
    }

    public void prepend(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        return;
    }

    public void delete_with_value(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next == data) {
                current.next = current.next.next;
            current = current.next;
            }
        }
    }

}