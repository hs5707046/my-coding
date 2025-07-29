public class LinearSearch {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println(search(array,6,0));
    }
    static int search(int[] array,int target,int index){
          if(array[index]==target){
            return index;
          }
          return search(array,target,index+1);
          
    }
}
