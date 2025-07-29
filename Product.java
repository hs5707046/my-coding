public class Product {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        int[] result=new int[array.length];
        
        for(int i=0;i<array.length;i++){
            int product=1;
            for(int j=0;j<array.length;j++){
                if(i!=j){
                    product=product*array[j];
                }
            }
            result[i]=product;
        }
        for(int x:result){
            System.out.println(x);
        }
    }
}
