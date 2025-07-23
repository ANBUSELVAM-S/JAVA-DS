import java.util.*;
class ll{
    Node start;
    class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    public void insert(int d){
        Node newNode = new Node(d);
        newNode.next = start;
        start = newNode;
    }
    public void display(){
        Node tr = start;
        while( tr != null){
            System.out.print(tr.data+"->");
            tr=tr.next;
        }
        System.out.println();
    }
    public int max(){
        Node tr = start;
        int max=start.data;
        while(tr != null){
            if(max<tr.data)
            max = tr.data;
            tr = tr.next;
            
        }
        return max;
    }
}
public class maxinum
{
	public static void main(String[] args) {
		ll list1 = new ll();
		list1.insert(12);
		list1.insert(30);
		list1.insert(20);
		list1.insert(40);
        System.out.println(list1.max());
        list1.display();
        
	}
}
 
