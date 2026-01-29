package Assignment_1;

class DNode {
    int data;
    DNode next, prev;
    DNode(int d) { data = d; }
}

public class DoublyList {
    DNode head, tail;

    public void add(int data) {
        DNode newNode = new DNode(data);
        if (head == null) { head = tail = newNode; return; }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // سؤال 11: الطباعة بالعكس
    public void printReverse() {
        DNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
