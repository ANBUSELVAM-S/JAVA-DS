import java.util.Scanner;

public class ACSII {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String a=in.nextLine();
        char[] b=a.toCharArray();
        for(int i=0;i<b.length;i++)
        {
            if(b[i]>='A' && b[i]<='Z')
            {
                System.out.printf("%c-%d\n",b[i],b[i]+32);
            }
            else
            {
              System.out.printf("%c-%d\n",b[i],b[i]-32);

            }
        }
        
    }
}
