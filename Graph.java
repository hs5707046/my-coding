 import java.util.ArrayList;
 import java.util.*;
 public class Graph {
    public static void main(String[] args) {
        final int v=5;
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }
        list.get(0).add(1);
        list.get(1).add(2);
        list.get(0).add(3);
         list.get(3).add(4);
         for(int i=0;i<v;i++){
            System.out.print("vertex "+i+"--->");{
                for(int j=0;j<list.get(i).size();j++){
                      System.out.print(list.get(i).get(j)+" ");
                }
                System.out.println();
            }
         }

    }
}
