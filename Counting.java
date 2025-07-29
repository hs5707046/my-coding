public class Counting {
    public static void main(String[] args) {
        int[] array={0,0,1,1,1,2,2};
        int[] count=new int[3];
        for(int num:array){
            count[num]++;
        }
        for(int i=0;i<count.length;i++){
            System.out.println("frquency of "+i+" "+count[i]);
        }

    }
}
