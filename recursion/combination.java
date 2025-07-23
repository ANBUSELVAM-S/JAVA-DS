 import java.util.*;
public class combination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a=in.nextInt();
        System.out.print(combination(n,a));
        
    }
    static int combination(int i,int j){
        if(j==0 || i==j) return 1;
        return combination(i-1,j-1)+combination(i-1,j);
    }
}

