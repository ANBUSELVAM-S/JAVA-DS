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
    // public int max(){
    //     Node tr = start;
    //     int max=start.data;
    //     while(tr != null){
    //         if(max<tr.data)
    //         max = tr.data;
    //         tr = tr.next;
            
    //     }
    //     return max;
    // }
    public String sort(){
        Node tr =  start;
        boolean des = true , asc = true;
        while(tr.next != null){
            if(tr.data<tr.next.data)  des=false;
            else if(tr.data>tr.next.data) asc=false;
            tr = tr.next;
        }
        if(asc) return "Ascending.....";
        else if(des) return "Desending ...";
        else return "Not sorted";
    }
}
public class sorted
{
	public static void main(String[] args) {
		ll list1 = new ll();
		list1.insert(10);
		list1.insert(20);
		list1.insert(30);
		list1.insert(40);
		list1.display();

        System.out.print(list1.sort());
        
	}
}
