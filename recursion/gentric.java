class BIT<T>{
    private int arr_size;
    private  T arr[];
    BIT(int size){
        arr = (T[]) new Object[size];
        arr_size = size;
    }
    public void add(int ind,T val){
        arr[ind]=val;
    }
    public void get(){
        for(int i=0;i<arr_size;i++)
        {
           System.out.println(arr[i]+" ");
        }
    }

}
public class gentric {

    public static void main(String[] args) {
        BIT<Integer> a= new BIT<>(3);
        a.add(0,10);
        a.add(1,20);
        a.add(2,30);
        a.add(1,100);
        a.get();
    }
}