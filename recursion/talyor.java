import java.util.Scanner;

public class talyor{
    
    static double pow(int a,int e){
        if(e==0) return 1;
        return a*pow(a,e-1);
    }
    static int fact(int b){
        if(b==0 || b==1) return 1;
        return b*fact(b-1);
    }
    static double taylor(int v,int n){
        if(n==0) return 1;
        double res = pow(v,n)/fact(n);
        return res + taylor(v,n-1);
    }
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int b=in.nextInt();
    int p=in.nextInt();
    System.out.printf("%.5f",taylor(b,p));
}
}