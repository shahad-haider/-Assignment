package Assignment_1;

class CNode {
    int data;
    Node next;
    CNode(int d) { data = d; next = null; }
}

public class SinglyList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // سؤال 5: دمج قائمتين
    public void concatenate(SinglyList list2) {
        if (head == null) { head = list2.head; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = list2.head;
    }

    // سؤال 7: البحث عن عنصر
    public int search(int target) {
        Node temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.data == target) return pos;
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    // سؤال 9: حذف من موقع محدد
    public void removeAt(int pos) {
        if (head == null) return;
        if (pos == 0) { head = head.next; return; }
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }
}
