 import java.util.*;
 public class SumSubsquence {
    public static void main(String[] args) {
       int[] array={1,2,3};
       int n=array.length;
       List<Integer> list=new ArrayList<>();
       int sum=3;
       printS(0,n,array,list,0,sum);

    }
    static void printS(int index,int n,int[] array,List<Integer> list,int s,int sum){
        if(index==n){
            if(s==sum){
                System.out.println(list);
                
            }
            return;
        }
        list.add(array[index]);
        s=s+array[index];
        printS(index+1, n, array, list, s, sum);
        list.remove(list.size()-1);
        s=s-array[index];
        printS(index+1,n ,array,list,s,sum);
    }
}
