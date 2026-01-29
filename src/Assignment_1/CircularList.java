package Assignment_1;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class CircularList {
    Node head = null;

    // سؤال 13: إضافة في موقع محدد
    public void insertAt(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            if (head == null) { head = newNode; newNode.next = head; }
            else {
                Node last = head;
                while (last.next != head) last = last.next;
                newNode.next = head;
                last.next = newNode;
                head = newNode;
            }
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // سؤال 15: البحث
    public boolean search(int target) {
        if (head == null) return false;
        Node temp = head;
        do {
            if (temp.data == target) return true;
            temp = temp.next;
        } while (temp != head);
        return false;
    }
}
