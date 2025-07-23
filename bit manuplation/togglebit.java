import java.util.Scanner;

public class togglebit {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.print(a^(1<<b));
    }
}
