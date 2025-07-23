public class manu{
    static int v=3;
    static int[][] arr = new int[v][v];
    static void add(int i,int j){
        arr[i][j]=1;
        arr[j][i]=1;
    }
    static void display(){
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
             {
                System.out.print(arr[i][j]+" ");
             }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        add(0,1);
        add(2,1);
        add(2,1);
        add(1,2);
        display();

    }
}