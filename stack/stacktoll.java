class stack{
    Node start;
    class Node {
        int data;
        Node next;
        Node(int v){
            data = v;
            next = null;
        }
    }
    public void push(int val){
        Node newNode = new Node(val);
        newNode.next  = start;
        start = newNode;
    }
    public void display(){
        Node tr = start;
        while(tr!=null){
            System.out.print(tr.data+" ");
            tr=tr.next;
        }
    }
    public int pop(){
        return start;
    }


    
}
public class stacktoll {
    public static void main(String[] args){
        stack s1 = new stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        System.out.println("popped ement : "+s1.pop());
        s1.display();
    }
}
