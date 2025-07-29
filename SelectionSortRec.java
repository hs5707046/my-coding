  import java.util.Arrays;
 public class SelectionSortRec {
    public static void main(String[] args) {
        int[] array={4,3,2,1};
        sort(array,array.length,1,0);
        System.out.println(Arrays.toString(array));
    }
    static void sort(int[] array,int r,int c,int max){
         if(r==0){
            return;
         } 
         if(c<r){
         if(array[c]>array[max]){
            
           sort(array,r,c+1,c);
         }
         else{
             sort(array,r,c+1,max);
         }
        }
         else{
        int temp=array[r-1];
        array[r-1]=array[max];
        array[max]=temp;
         sort(array,r-1,1,0);
         }
         
    }
}
