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
            Node tr =start;
            while(tr.next!=null){
                tr =tr.next;
            }
            tr.next = newNode;
            newNode.prev = tr;
        }
    }
    public void insertpos(int val,int pos){
        if(pos<=0){
            System.out.print("pos invaild");
        }
        if(pos==1){
            insert(val);
            return;
        }
        Node newNode = new Node(val);
        Node tr = start;
        for(int i=0;i<pos-2;i++){
            tr = tr.next;
        }
        newNode.next = tr.next;
        newNode.prev = tr;
        tr.next.prev = newNode;
        tr.next = newNode;
        
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
        System.out.println("froward display");
        while(last!=null){
            System.out.print(last.data+" <-");
            last =last.prev;
        } 
        System.out.print("null");


        
    }
}
public class insertpos
{
	public static void main(String[] args) {
		Dll list1 = new Dll();
		list1.insert(4);
			list1.insert(3);
				list1.insert(5);
					list1.insert(6);
					list1.display();
					list1.insertpos(100,3);
					list1.display();
	}
}
