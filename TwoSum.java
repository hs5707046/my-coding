import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int[] array={3,2,4};
        int target =6;
        int[] pair=new int[2];
        int[] array1=Arrays.copyOf(array,array.length);
        Arrays.sort(array1);
        int j=array1.length-1;
        int i=0;
        while(i<j){
            int sum=array1[i]+array1[j];
            if(sum==target){
                break;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }

      for(int k=0;k<array.length;k++){
        if(array[k]==array1[i]){
            pair[0]=k;
        }
      }
      for(int k=array.length-1;k>=0;k--){
           if(array[k]==array1[j]){
            pair[1]=k;
           }
      }
for(int value:pair){
    System.out.print(value+" ");
}
    }
}
