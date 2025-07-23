import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backtrack {
   public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         char ch[]=new char[]{1,2,3,4};
         int r=2;
         List<Integer> a= new ArrayList<>();
         List<List<Integer>> nested = new ArrayList<>();
          backtrack(ch, r, 0, a, nested);
          System.out.print(nested);
   }
   static void backtrack(char[] fruit,int r,int ind,List<Integer> fl,List<List<Integer>> nested){
    if(fl.size()==r){
        
        nested.add(new ArrayList<>(fl)); 
        return;
    }
    for(int i=ind;i<fruit.length;i++)
    {
        fl.add(fruit[i]);
        backtrack(fruit,r,i+1,fl,nested);
        fl.remove(fl.size()-1);
    }
    
   }
   
   
    
}
