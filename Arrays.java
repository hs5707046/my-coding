public class Arrays {
 public static void main(String[] args) {
   int [] arr= new int[10];
    for(int i=0;i<arr.length;i++){
        arr[i]=i;
    }
   System.out.println(arr); 
   //enhanced for loop
   for(int i:arr){
    System.out.println(i);
   }
   
 }   
}
