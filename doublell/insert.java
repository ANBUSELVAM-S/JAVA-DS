class Dll{
    Node start;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data = d;
            next = null;
            prev = null;
            
        }
        
    }
    public void insert(int v){
        Node newNode  = new Node(v);
        if(start ==null){
            start = newNode;
        }
        else{
            Node tr = start;
            while(tr.next!=null){
                tr =tr.next;
            }
            tr.next = newNode;
            newNode.prev = tr;
        }
    }
    public void display(){
        Node tr = start,last = null;
        System.out.println("forward display");
        while(tr!=null){
            System.out.print(tr.data+" ->");
            last = tr;
            tr=tr.next;
        }
        System.out.println("null");
        System.out.println("forward display");
        while(last!=null){
            System.out.print(last.data+" ->");
            last =last.prev;
        } 
        System.out.print("null");


        
    }
}
public class insert
{
	public static void main(String[] args) {
		Dll list1 = new Dll();
		list1.insert(4);
			list1.insert(3);
				list1.insert(5);
					list1.insert(6);
					list1.display();
	}
}
