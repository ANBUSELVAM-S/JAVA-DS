import java.util.*;
class LL{
    Node start;
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
        public void insert(int v){
            Node newNode = new Node(v);
            Node tr = start;
            if (start == null) {
            start = newNode;
        } else {
            while(tr.next!=null){
              tr = tr.next;
            }
            tr.next = newNode;
        }
            
        }
        public void  display(){
        Node tr = start;
        while(tr != null){
            System.out.print(tr.data+" ");
            tr = tr.next;
        }
    }
}
public class insert
{
	public static void main(String[] args) {
		
		LL list1 = new LL();
        list1.insert(10);
		list1.insert(60);
        list1.insert(30);	
        list1.display();
	}
}
