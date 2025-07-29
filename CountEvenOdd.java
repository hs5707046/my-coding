public class CountEvenOdd {
    static int[] count(int range){
        if(range==0){
            int result[]=new int[2];
            return result;
        }
        
        int result[]=count(range-1);
        if(range%2==0){
             result[0]++;
        }
        else {
         result[1]++;
        } 
        return result;
                }
    public static void main(String[] args) {
      int[] array=count(10);
      System.out.println("even "+array[0]+" "+"odd "+array[1]);  
    }
}
