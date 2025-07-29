public class TwoSum1 {
   public static void main(String[] args) {
    int[] array={2,6,5,8,11};
    int i=0;
    int j=array.length-1;
    int target=14;
    while(i<j){
if(array[i]+array[j]==target){
    System.out.print(i+" "+j);
    break;

}
else if(array[i]+array[j]<target){
i++;
}
else{
    j--;
}


    }
   }



}
