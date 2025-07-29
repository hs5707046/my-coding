import java.util.*;
public class PreviousGreater {
    public static void main(String[] args) {
        int[] array={5,4,3,2,1};
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        int n=array.length;
        for(int i=0;i<n;i++){
            
            while(!stack.isEmpty()&&array[i]>=stack.peek()){
                stack.pop();
            }
            list.add(stack.isEmpty()?-1:stack.peek());
            stack.push(array[i]);

        }
        System.out.println(list);
    }
}
