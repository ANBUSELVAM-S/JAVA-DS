class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}
class BST{
    Node root;
    BST(int val){
        root=new Node(val);
    }
    public void insert(int v){
         helper(root,v);
    }
        
    public Node helper(Node n,int v){
        if(n==null) return new Node(v);
        if(v>n.data)
        n.right=helper(n.right,v);
        else
        n.left=helper(n.left,v);
        return n;
    }
    
    public void inOrder(Node n){
        if(n!=null){
        inOrder(n.left);
        System.out.print(n.data+" ");
        inOrder(n.right);
    }
    }
    public void preOrder(Node n){
        if(n!=null){
            
        System.out.print(n.data+" ");
        preOrder(n.left);
        preOrder(n.right);
    }
    }
    public void postOrder(Node n){
        if(n!=null){
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.data+" ");
        
    }
    }
    public boolean search(Node n,int key){
        if(n==null) return false;
        if(key==n.data) return true;
        if(key<n.data)
        return search(n.left,key);
        else
        return search(n.right,key);
    }
}
public class Main
{
	public static void main(String[] args) {
	    BST tree=new BST(50);
	    tree.insert(100);
	    tree.insert(60);
	    tree.insert(20);
	    tree.insert(30);
	    tree.insert(10);
	    tree.insert(80);
	    System.out.println("Preorder: ");
	    tree.preOrder(tree.root);
	    
	    System.out.println("\nInorder: ");
	    tree.inOrder(tree.root);
	    
	    System.out.println("\nPostorder: ");
	    tree.postOrder(tree.root);
	    
	    System.out.println("\nSearch: "+tree.search(tree.root,20));
	    

	
	}
}