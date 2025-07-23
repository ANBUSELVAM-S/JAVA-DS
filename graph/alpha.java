public class alpha {
    static char[] v={'A','B','C','D','E'};
    static int[][] arr = new int[5][5];
    static int getindex(int va)
    {
        for(char i=0;i<5;i++)
        {
            if(va==v[i])
            {
                return i;
            }
        }
        return -1;
    }
    static void add(int i,int j)
    {
        int n=getindex(i);
        int m=getindex(j);
        arr[n][m]=1;
        arr[m][n]=1;
    }
    static void display()
    {

        System.out.print("  ");
	    for(int i=0;i<5;i++)
	    System.out.print(v[i]+" | ");
	    System.out.println();
	    for(int i=0;i<5;i++){
	        System.out.print(v[i]+" ");
	        for(int j=0;j<5;j++){
	            System.out.print(arr[i][j]+"  ");
	        }
	        System.out.println();
	    }
    }
    public static void main(String[] args) {
        add('E','D');
        add('A','D');
        add('B','C');
        add('C','A');
        add('A','E');
        display();
    }
}
