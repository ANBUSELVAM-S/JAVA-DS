import java.util.*;
public class upper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a=in.nextLine();
        char[] b=a.toCharArray();
        int c=0;
        for(int i=0;i<b.length;i++)
        {
            if(Character.isUpperCase(b[i]))
            {
                c++;
            }
        }
        System.out.print(c);
    }
}
