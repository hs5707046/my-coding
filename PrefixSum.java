public class PrefixSum {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int[] prefix=new int[array.length];
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
            prefix[i]=sum;
        }
        for(int x:prefix){
         System.out.println(x);
        }
    }

}
