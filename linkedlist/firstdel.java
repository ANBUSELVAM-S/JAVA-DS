import java.util.*;
class ll{
    Node start = null;
    class Node{
        int data;
        Node next;
        Node(int v){
            data = v;
            next = null;
        }
    }
        public void insert(int d){
            Node newNode = new Node(d);
            Node tr = start;
            if(start == null){
                start = newNode;
            }
            
            else{
                while(tr.next != null){
                    tr= tr.next;
                }
                tr.next = newNode;
            }
        }
        public void display(){
            Node tr = start;
            while(tr != null){
                System.out.print(tr.data+"->");
                tr = tr.next;
            }
            System.out.println();
        }
        public void delete(){
            // 
            if(start==null){
                System.out.print("No element to delete.");
            }
            else if(start.next == null){
                start = start.next;
                System.out.print("List empty.");
            }
            else start = start.next;
        }
    
}
public class firstdel{
    public static void main(String[] args){
        ll list1 = new ll();
        list1.insert(30);
        list1.insert(50);
        list1.insert(10);
        list1.display();
        list1.delete();
        list1.display();
        
    }
}