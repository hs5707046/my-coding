import java.util.*;
import java.util.ArrayList;
public class SubsetArray { 
    public static void main(String[] args) {
        int array[]={1,2,3};
        int n=3;
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> inner=new ArrayList<>();
        sub(0,array,n,result,inner);
        System.out.println(result);
    }
    static void sub(int index,int[] array, int n,List<List<Integer>> result,List<Integer> inner ){
        if(index==n){
            result.add(new ArrayList<>(inner));
           
            return;
        }
        inner.add(array[index]);
        sub(index+1,array,n,result,inner);
        
        inner.remove(inner.size()-1);
        sub(index+1,array,n,result,inner);

    }
}
