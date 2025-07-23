

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
    public void insertpos(int v,int pos){
        Node newNode = new Node(v);
        Node tr = start;
        for(int i=1;i<pos-1;i++) tr = tr.next;
        newNode.next = tr.next;
        tr.next = newNode;
    }
    
    

    public void display() {
        Node tr = start;
        while (tr != null) {
            System.out.print(tr.data + " -> ");
            tr = tr.next;
        }
    }
}

public class insertpos {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insert(10);
        list1.insert(20);
        list1.insert(50);
        list1.insertpos(3,3);

        list1.display(); 
    }
}
