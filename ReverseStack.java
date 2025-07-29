import java.util.*;
public class ReverseStack {
    static void reverse(Stack<Integer>stack,int top){
        if(stack.isEmpty()){
            return;
        }
        int topValue=stack.pop();
      
        reverse(stack,top);
        insert(stack,topValue);

    }
    static void insert(Stack<Integer> stack,int topValue){
        if(stack.isEmpty()){
         stack.push(topValue);
         return;
        }
         int top=stack.pop();
        insert(stack,topValue);
        stack.push(top);

    }

    public static void main(String[] args) {
      Stack<Integer> stack =new Stack<>();
      int top=-1;
      for(int i=1;i<=5;i++) {
        top++;
        stack.add(i);
      }
     
      System.out.println(stack);
      reverse(stack,top);
       System.out.println(stack);
       
    
    }
}
