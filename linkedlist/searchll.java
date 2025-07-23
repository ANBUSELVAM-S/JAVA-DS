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
  public int search(int l){
      Node tr = start;
      int pos =0;
      while(tr != null)
      {
          pos++;
          if(tr.data == l)
          {
              System.out.print("found :");
              return pos;
              
          }
           
          tr = tr.next;
      }
    return -1;
       
  }
//    public boolean search(int s){
//        if(start == null) return false;
//        if(start.data == s) return true;
//        Node p = start;
//        Node c= start.next;
//        while(c!=null){
//            if(c.data == s){
//                p.next = c.next;
//                c.next = start;
//                start = c;
//                return true;
//            }
//            p = c;
//            c=c.next;
//        }
//        return false;
       
       
//    }
    
}
public class searchll
{
	public static void main(String[] args) {
		ll list1 = new ll();
		list1.insert(12);
		list1.insert(30);
		list1.insert(20);

		list1.insert(40);
		list1.display();
        System.out.println(list1.search(12));
        list1.display();
	}
}
