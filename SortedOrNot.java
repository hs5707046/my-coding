public class SortedOrNot {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        System.out.println(sorted(array,0));
    }
    static boolean sorted(int[] array,int index){
          if(index==array.length-1){
            return true;
          }
          else{
            return array[index]<array[index+1]&&sorted(array,index+1);
          }
    }
}
