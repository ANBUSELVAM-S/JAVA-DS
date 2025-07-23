import java.util.ArrayList;

public class adjacent{
    static int v=3;
static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
    static void add(int i,int j)
    {
        graph.get(i).add(j);   
        graph.get(j).add(i);
    }
    // static void degree(){
	//     for(int i=0;i<v;i++){
	//         System.out.println(i+"->"+graph.get(i).size());
	//     }
	// }
    // public static void degree()
	// {
	    
	//     for(int i=0;i<v;i++){
	//         int de=0;
	//         for(int j=0;j<v;j++){
	//             if(arr[i][j]==1)
	//             de++;
	//         }
	//         System.out.println("Degree of"+i+" is"+ de);
	//     }
	    
	// }
    static void display()
    {
        for(int i=0;i<v;i++){
	        System.out.print(i+": ");
	    for(int vl:graph.get(i))
	    System.out.print(vl+" ");
	        System.out.println();
	        
	    }
    }
    public static void main(String[] args) {
        for(int i=0;i<v;i++)
        {
        graph.add(new ArrayList<>());
        }
        add(1,0);
         add(2,2);
          add(2,1);
          degree();
          display();
    
}
}