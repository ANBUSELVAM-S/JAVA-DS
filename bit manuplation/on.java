import java.util.Scanner;

public class on {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if((a&(1<<b))==0)
        {
            System.out.print("off");
        }
        else
        {
            System.out.print("on");
        }
    }
}
