public class Zigzag {
    public static void main(String[] args) {
        int[] array={4,3,7,8,6,2,1};
        boolean flag=true;
        for(int i=0;i<array.length-1;i++){
            if(flag){
                if(array[i]>array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
            if(!flag){
                if(array[i]<array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
            flag=!flag;
        }
        for(int x:array){
            System.out.print(x+" ");
        }
    }
}
