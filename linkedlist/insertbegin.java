

class LL {
    Node start;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insert(int v) {
        Node newNode = new Node(v);
        newNode.next = start;
        start = newNode;
    }

    public void display() {
        Node tr = start;
        while (tr != null) {
            System.out.print(tr.data + " -> ");
            tr = tr.next;
        }
    }
}

public class insertbegin {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insert(10);
        list1.insert(20);
        list1.insert(50);

        list1.display(); // Output: 50 -> 20 -> 10 -> null
    }
}
