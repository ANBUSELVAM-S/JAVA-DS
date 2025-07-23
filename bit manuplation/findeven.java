import java.util.*;

public class findeven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n & 1) == 1)
        {
            System.out.print("Odd");
        }
        else{
            System.out.print("Even");
        }
    }
}