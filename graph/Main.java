import java.util.*;
public class Main
{
static int arr[]={1,2,3,4,5,6,7};
    static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
    public static int getindex(int v)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(v==arr[i])
            return i;
        }
        return -1;
    }
    public static void add(int i,int j){
        int ind=getindex(i);
        int in=getindex(j);
       graph.get(ind).add(in);
       graph.get(in).add(ind);
     
    }
	public static void display()
	{
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+": ");
	        
	    for(int v:graph.get(i))
	    System.out.print(arr[v]+" ");
	        System.out.println();
	        
	    }
	}
	public static void  bfs(int start){
	    boolean seen[]=new boolean[graph.size()];
	    Queue<Integer> q=new LinkedList<>();
	   
	    q.add(start);
	    seen[start]=true;
	    while(!q.isEmpty()){
	        int v=q.remove();
	        System.out.print(arr[v]+" ");
	        for(int a:graph.get(v)){
	            if(!seen[a]){
	                q.add(a);
	                seen[a]=true;
	                //break;
	            }
	        }
	    }
	}
 static boolean seen[]=new boolean[arr.length];
    public static void dfs(int va){
        seen[va]=true;
    System.out.print(arr[va]+" ");
    for(int a:graph.get(va)){
        if(!seen[a])
        dfs(a);
    }
    }
	public static void main(String[] args) {
	    
	    for(int i=0;i<arr.length;i++)
	    graph.add(new ArrayList<>());
	    
	    add(1,2);
	    add(1,4);
	    add(1,5);
	    add(2,3);
	    add(2,6);
	    add(2,7);
	   
	    display();
	    System.out.println("BFS Order");
	    bfs(getindex(1));
 System.out.println("DFS Order");
	    dfs(getindex(1));

	    
	}
}