class stack{
    int[] stack_arr;
    int top;
    int max;
    stack(int v){
        max = v;
        stack_arr = new int[v];
        top = -1;
    }
    public void insert(int val){
        if(stack_arr.length-1==top){
            System.out.println("stack Overflow");
        }
        else
        stack_arr[++top] = val;
    }
    public int peek(){
        return stack_arr[top];
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(stack_arr[i]+" ");
        }
        System.out.println();
    }
    public int pop(){
        return stack_arr[top--];
    }
}
public class insert{
    public static void main(String[] args) {
       stack s1 = new stack(100);
       s1.insert(10); 
       s1.insert(20); 
       s1.insert(30); 
       s1.insert(40); 
       s1.insert(50); 
       s1.display();
       System.out.println("Peek :"+s1.peek());
       System.out.println(s1.pop());
       s1.display();
    
}
}