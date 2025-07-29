import java.util.*;
public class Leaders {
    public static void main(String[] args) {
        int[] array={16,17,4,3,5,2};
        int leader=0;
        ArrayList<Integer> leaders=new ArrayList<Integer>();
        for(int i=array.length-1;i>=0;i--){
            if(array[i]>=leader){
                leader=array[i];
                leaders.add(leader);
            }
        }
        Collections.reverse(leaders);
        System.out.print(leaders);

    }
}
