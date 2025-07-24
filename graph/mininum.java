
import java.util.*;
class Edge{
    int to,wt;
    Edge(int t,int w){
        to=t;
        wt=w;
    }
}

public class mininum
{
    static int V=4;
    static List<List<Edge>> graph=new ArrayList<>();
    
	public static void add(int i,int j,int wt){
	   graph.get(i).add(new Edge(j,wt));
       graph.get(j).add(new Edge(i,wt));
	}
	public static void display()
	{
	    for(int i=0;i<V;i++){
	        System.out.print(i+": ");
	    for(Edge v:graph.get(i))
	    System.out.print(v.to+" "+v.wt+"   ");
	        System.out.println();
	        
	    }
	}
    public static void prims(int start){
        boolean seen[]=new boolean[V];
        int min=0;
        PriorityQueue<Edge> pq=new PriorityQueue<>((a,b)->a.wt-b.wt);
        
        seen[start]=true;
        pq.addAll(graph.get(start));
       // System.out.print(pq);
        while(!pq.isEmpty())
      {
          Edge rem=pq.remove();
           
          if(seen[rem.to]==true) continue;
           
          seen[rem.to]=true;
          min+=rem.wt;
           
          for(Edge e:graph.get(rem.to)){
              if(!seen[e.to])
              pq.add(e);
          }
      }
      System.out.print("Min cost: "+min);
    }
	public static void main(String[] args) {
	    
	    for(int i=0;i<V;i++){
	        graph.add(new ArrayList<>());
	    }
	    
	    add(0,1,1);
	    add(0,2,2);
	    add(1,2,3);
	    add(1,3,2);
	    add(2,3,5);
	    display();
	    prims(0);
	}
}

