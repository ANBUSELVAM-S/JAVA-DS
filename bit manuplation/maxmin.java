import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int m=-(a<b?1:0);
        int min = b^((a^b) & m);
        int mn=-(a<b?0:1);
        int max = b^((a^b) & mn);
        System.out.print(min+" ");
        System.out.print(max);


    }
}
